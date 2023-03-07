<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<meta charset="UTF-8">
    <title>Signup - RedThat</title>
    <%@ include file="../segments/stylesheets.jspf" %>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/forms.css">
</head>
<body>
<div class="container">
    <%@ include file="../segments/header.jspf" %>

    <form action="#" method="post" class="user-form">
        <h2 class="user-form-title">Login to RedThat</h2>
        <input name="j_username" placeholder="User name" required>
        <input name="j_password" placeholder="Password" type="password" required>
        <button class="user-form-button">Login</button>
        <p>Don't have account? <a href="${pageContext.request.contextPath}/signup">Signup</a></p>
    </form>
    <%@ include file="../segments/footer.jspf" %>
</div>
</body>
</html>