<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss"/>
    <spring:url value="/resources/css/signin.css" var="signinCss"/>

    <title>Employees management system</title>

    <!-- Bootstrap -->
    <link href="${bootstrapCss}" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${signinCss}" rel="stylesheet">
</head>
<body>

<div class="container">

    <form class="form-signin" name="loginForm" action="<c:url value='/login'/>" method="POST">
        <h2 class="form-signin-heading">Please log in</h2>
        <c:if test="${error == 'loginFailed'}">
            <div class="alert alert-danger" role="alert">Incorrect username or password</div>
        </c:if>
        <label for="username" class="sr-only">Username</label>
        <input type="text" id="username" name="username" class="form-control" placeholder="Username" value="${username}" required autofocus>
        <label for="password" class="sr-only">Password</label>
        <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
    </form>

</div> <!-- /container -->

</body>
</html>
