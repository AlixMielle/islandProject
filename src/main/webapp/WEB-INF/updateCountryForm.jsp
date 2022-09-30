<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Islands Project | Edit Island</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<div class="container">
  <h1>Edit Country</h1>

  <div class="row">

    <form action="${pageContext.request.contextPath}/edit-country" method="POST">
      <input hidden name="id" value="${country.id}">
      <div class="mb-3">
        <label for="name" class="form-label">Name</label>
        <input id="name" name="name" type="text" class="form-control" required value="${country.name}">
      </div>

      <div class="d-flex justify-content-end">
        <button type="submit" class="btn btn-primary">Edit</button>
      </div>
    </form>

  </div>

</div>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>