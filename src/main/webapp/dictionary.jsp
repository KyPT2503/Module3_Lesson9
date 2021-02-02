<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/2/2021
  Time: 5:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/dictionary" method="post">
    <label>
        <input type="text" name="word">
    </label>
    <button type="submit">Translate</button>
</form>
</body>
</html>
