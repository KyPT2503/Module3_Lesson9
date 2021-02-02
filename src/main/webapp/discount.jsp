<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/2/2021
  Time: 6:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Discount Counting</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/count-discount" method="post">
    <label>
        <input type="text" name="describe">
    </label>
    <label>
        <input type="text" name="price">
    </label>
    <label>
        <input type="text" name="percent">
    </label>
    <button type="submit">Count</button>
</form>
</body>
</html>
