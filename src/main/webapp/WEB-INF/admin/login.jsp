<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-6-10
  Time: 下午3:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/admin/login" method="post">
    <input type="text" name="name" value=""></br>
    <input type="text" name="password" value=""></br>
    <input type="submit" value="Login">
</form>
</body>
</html>
