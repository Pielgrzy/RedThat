<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Signup - RedThat</title>
    <%@ include file="../segments/stylesheets.jspf" %>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/forms.css">
</head>
<body>
<div class="container">
    <%@ include file="../segments/header.jspf" %>

    <form action="#" method="post" class="user-form">
        <h2 class="user-form-title">Signup to RedThat</h2>
        <input name="username" placeholder="User name" required>
        <input name="email" placeholder="email" type="email" required>
        <input name="password" placeholder="Password" type="password" required>
        <button class="user-form-button">Signup</button>
    </form>
    <%@ include file="../segments/footer.jspf" %>
</div>

</body>
</html>