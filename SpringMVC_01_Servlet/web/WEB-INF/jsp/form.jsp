<%--
  Created by IntelliJ IDEA.
  User: yangchang
  Date: 2/19/21
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/hello" method="get">
        <input type="text" name="method">
        <input type="submit">
    </form>
</body>
</html>
