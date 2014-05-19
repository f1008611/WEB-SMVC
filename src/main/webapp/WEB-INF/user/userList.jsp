<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-4-17
  Time: 下午2:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
this is UserList!     sdfsdds
          <br>
<c:forEach var="user" items="${userList}" >
       ${user.name}<br>
</c:forEach>
</body>
</html>
