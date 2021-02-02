<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/2/2021
  Time: 5:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    <label>
        <input type="text" name="username">
    </label>
    <label>
        <input type="password" name="password">
    </label>
    <button type="submit">Login</button>
</form>
</body>
</html>
