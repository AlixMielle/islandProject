<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Island Project | Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
</head>

<body>


<jsp:include page="header.jsp"></jsp:include>

<div class="container mt-4">
    <div class="row">
        <div class="col-8 offset-2">

            <h1>Details Country :</h1>

            <div class="card">
                <%--     <img src="${country.pictureUrl}" class="card-img-top h-50" alt="${island.name}">--%>
                <div class="card-body">
                    <h5 class="card-title text">${country.name}</h5>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>

