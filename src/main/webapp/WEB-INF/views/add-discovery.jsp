<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add new topic - RedThat</title>
    <%@ include file="../segments/stylesheets.jspf" %>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/add-discovery-form.css">
</head>
<body>
<div class="container">
    <%@ include file="../segments/header.jspf" %>

    <form action="#" method="post" class="discovery-form">
        <h2 class="discovery-form-title">Add new topic</h2>
        <input name="title" placeholder="Topic" required>
        <input name="url" placeholder="URL" type="url" required>
        <select name="categoryId">
            <c:forEach var="category" items="${requestScope.categories}">
                <option value="${category.id}">${category.name}</option>
            </c:forEach>
        </select>
        <textarea name="description" placeholder="Description"></textarea>
        <button class="discovery-form-button">Add</button>
    </form>

    <%@ include file="../segments/footer.jspf" %>
</div>
</body>
</html>