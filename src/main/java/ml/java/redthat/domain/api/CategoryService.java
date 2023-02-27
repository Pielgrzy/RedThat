package ml.java.redthat.domain.api;

import ml.java.redthat.domain.Category.Category;
import ml.java.redthat.domain.Category.CategoryDao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CategoryService {
    private CategoryDao categoryDao = new CategoryDao();

    public List<CategoryName> findAllCategoryNames() {
        return categoryDao.findAll()
                .stream()
                .map(CategoryNameMapper::map)
                .collect(Collectors.toList());
    }

    public Optional<CategoryFullInfo> findById(int categoryId) {
        return categoryDao.findById(categoryId)
                .map(CategoryFullInfoMapper::map);
    }


    private static class CategoryNameMapper {
        static CategoryName map(Category category) {
            return new CategoryName(
                    category.getId(),
                    category.getName()
            );
        }
    }

    private static class CategoryFullInfoMapper {
        static CategoryFullInfo map(Category category) {
            return new CategoryFullInfo(
                    category.getId(),
                    category.getName(),
                    category.getDescription()
            );
        }
    }
}
