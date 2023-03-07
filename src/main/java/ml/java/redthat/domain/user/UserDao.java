package ml.java.redthat.domain.user;

import ml.java.redthat.domain.common.BaseDao;

import java.sql.*;

public class UserDao extends BaseDao {

    public void save(User user) {
        saveUser(user);
        saveUserRole(user);
    }

    private void saveUserRole(User user) {
        final String query = """
                INSERT INTO
                user_role(username)
                VALUES
                (?)
                """;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, user.getUsername());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void saveUser(User user) {
        final String query = """
                INSERT INTO
                user(username,email,password,registration_date)
                VALUES
                (?,?,?,?)
                """;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setObject(4, user.getRegistrationDate());
            statement.executeUpdate();
            ResultSet generatedKey = statement.getGeneratedKeys();
            if (generatedKey.next()) {
                user.setId(generatedKey.getInt(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}