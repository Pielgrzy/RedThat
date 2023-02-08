<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>RedThat</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/main.css">
</head>
<body>
<div class="container">
    <nav class="navbar">
        <a href="#" class="logo">
            <i class="fas fa-share-alt-square"></i>
            RedThat
        </a>
        <a href="#" class="login-button">Login</a>
    </nav>

    <aside class="categories">
        <ul>
            <li><a href="#">Economy</a></li>
            <li><a href="#">Gaming</a></li>
            <li><a href="#">Entertainment</a></li>
        </ul>
    </aside>

    <main>
        <p>TU PĘTLA</p>
        <c:forEach var="discovery" items="${requestScope.discoveries}">
            <article class="discovery">
                <h2 class="discovery-header"><c:out value="${discovery.title}"/></h2>
                <p class="discovery-details">Dodane przez: Mietek, ${discovery.dateAdded.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))}</p>
                <a href="<c:out value="${discovery.url}"/>" target="_blank" class="discovery-link"><c:out value="${discovery.url}"/></a>
                <p><c:out value="${discovery.description}"/></p>
                <section class="discovery-bar">
                    <a href="#" class="discovery-link upvote">
                        <i class="fas fa-arrow-alt-circle-up discovery-upvote"></i>
                    </a>
                    <p class="discovery-votes">32</p>
                    <a href="#" class="discovery-link downvote">
                        <i class="fas fa-arrow-alt-circle-down discovery-downvote"></i>
                    </a>
                </section>
            </article>
        </c:forEach>
    </main>
    <footer>RedThat ®, developed by MLdasdas</footer>
</div>
</body>
</html>