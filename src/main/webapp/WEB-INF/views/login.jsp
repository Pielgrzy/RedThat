<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Login - RedThat</title>
    <%@ include file="../segments/stylesheets.jspf" %>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/forms.css">
</head>
<body>
<div class="container">
    <%@ include file="../segments/header.jspf" %>

    <form action="j_security_check" method="post" class="user-form">
        <h2 class="user-form-title">Login ReadStack</h2>
        <input name="j_username" placeholder="User name" required>
        <input name="j_password" placeholder="password" type="password" required>
        <button class="user-form-button">Zaloguj się</button>
        <p>Don't have account!? <a href="${pageContext.request.contextPath}/signup">Signup</a></p>
    </form>

    <%@ include file="../segments/footer.jspf" %>
</div>
</body>
</html>