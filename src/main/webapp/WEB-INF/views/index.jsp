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
    <spring:url value="/resources/js/jquery.min.js" var="jqueryJs"/>
    <spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJs"/>

    <title>Employees management system</title>

    <!-- Bootstrap -->
    <link href="${bootstrapCss}" rel="stylesheet">
</head>
<body>
<h1>Hello, <mark>${user}</mark>!
</h1>
<a href="<c:url value="/logout"/>">Logout</a>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="${jqueryJs}"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="${bootstrapJs}"></script>
</body>
</html>