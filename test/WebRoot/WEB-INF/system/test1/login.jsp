<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta charset="utf-8">
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="../CSS/login.css">

  </head>
  
  <body>
    <div class="box_content">
    <h2>登录系统</h2>
        <div>
        <div>
        <i class="layui-icon layui-icon-username"></i>
        <input type="text" name="loginname" placeholder="登录账号" required="required"/>
        </div>
        <div>
        <input type="text" name="password" placeholder="密码" required="required"/>
        </div>
        <div>
        <button type="submit" name="denglu" class="denglu">登录</button>
        </div>
        </div>
    </div>
  </body>
</html>
