<%--
  Created by IntelliJ IDEA.
  User: Jabo
  Date: 2021/2/20
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layuiAdmin pro - 通用后台管理模板系统（单页面专业版）</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="/static/start/layui/css/layui.css" media="all">
</head>
<body>
<div id="LAY_app"></div>
<script src="/static/start/layui/layui.js"></script>
<script>
    layui.config({
        base: '../static/src/' //指定 layuiAdmin 项目路径，本地开发用 src，线上用 dist
        ,version: '1.4.0'
    }).use('index');
</script>
</body>
</html>


