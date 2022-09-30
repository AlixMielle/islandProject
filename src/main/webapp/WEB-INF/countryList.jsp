<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Islands Project | Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>


<div class="container mt-4">

    <h1>Countries :</h1>

    <div class="row">
        <c:forEach items="${countries}" var="country">
            <div class="col-lg-4 mb-3 d-flex align-items-stretch">
                <div class="card">
                    <h5 class="card-title">${country.name}</h5>
                    <div class="card-footer d-flex justify-content-end">
                        <a href="${pageContext.request.contextPath}/detail-country?id=${country.id}"
                           class="btn btn-success me-2">Details</a>
                        <a href="${pageContext.request.contextPath}/edit-country?id=${country.id}" class="btn btn-primary me-2">Edit</a>
                        <form action="${pageContext.request.contextPath}/delete-country" method="post" class="m-0">
                            <input hidden name="idCountry" value="${country.id}">
                            <button class="btn btn-secondary" type="submit">Delete</button>
                        </form>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>