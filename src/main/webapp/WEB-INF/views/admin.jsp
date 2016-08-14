<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>
<h1>Hello, ${user}!</h1>
<h1>${pageContext.request.userPrincipal.name}</h1>

<a href="${pageContext.request.contextPath}/logout">Logout</a>
</body>
</html>
