<%--
  Created by IntelliJ IDEA.
  User: yangchang
  Date: 2/21/21
  Time: 01:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
        <input type="file" name="file"/>
        <input type="submit">
    </form>
</body>
</html>
