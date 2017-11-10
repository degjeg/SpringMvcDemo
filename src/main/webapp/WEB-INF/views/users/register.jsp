<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-11-09
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/users/upload" enctype="multipart/form-data" method="post">
    <div>
        <li>
            <input type="text" name="userName">账号</input>
        </li>
        <li>
            <input>密码</input>
        </li>

        <input type="file" name="file">选择头像</input>
        <li>
            <input type="submit">注册</input>
        </li>
    </div>
</form>
</body>
</html>
