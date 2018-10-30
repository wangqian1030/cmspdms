<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<title>生产管理系统</title>
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

<body bgcolor="#f2f2f2">
	<div class="box"
		style="text-align: center; margin-top: 200px;box-sizing: border-box;">
		<h4 style="font-size: 22px;">登录系统</h4>
		<div class="input_div" style="margin-top: 20px;">
			<label for="loginname"> <i
				class="layui-icon layui-icon-username"></i>
			</label> <input type="text" name="loginname" placeholder="登录账号"
				required="required" style="width:300px;height:35px;border: 1px solid #c0c0c0;padding-left: 10px;" />
		</div>
		<div class="input_div" style="margin-top: 30px;">
			<input type="text" name="password" placeholder="密码"
				required="required" style="width:300px;height:35px;border: 1px solid #c0c0c0;padding-left: 10px;" />
		</div>
		<div class="denglu" style="margin-top: 30px;text-align: center; ">
			<button type="button" name="denglu"
				style="width:300px;height:35px;background-color:green;color:white;border: 1px solid #c0c0c0;">登录</button>
		</div>
		<div style="box-sizing: border-box;margin-top: 300px;font-size: 10px;">
			<p>©2018 江西中海科技有限公司</p>
		</div>
	</div>
</body>
<script type="text/javascript" src="../JS/jquery.cookie.js"></script>
<script type="text/javascript">
	$(function() {
		$('input:first').focus();
		var inp = $('input');
		inp.bind('keydown', function(e) {
			var key = e.which;
			if (key == 13) {
				var nxtIndex = inp.index[this] + 1;
				$(":input:eq(" + index + ")").focus();
			}
		});
		var loginname = $.cookie("loginname");
		if (typeof (loginname) != "undefined") {
			$(".loginname").value(loginname);
			$(".password").focus();
		}
	});
	$(".loginBtn".click(function() {
		var loginname = $(".loginname").val();
		var password = $(".password").val();
		if (loginname == "") {
			$.tipPop("用户名不能为空", ".loginname");
			$("loginname").focus();
		} else if (password = "") {
			$.tipPop("密码不能为空", ".password");
			$(".password").focus();
		} else {
			$.ajax({
				type : "POST",
				url : "loginMethed",
				data : {
					loginname : loginname,
					password : password
				},
				success : function(data){
				if(data.stateType=="0"){
				layer.msg("登录成功",{
				time:1000,
				icon:1,
				shade:0.4,
				shadeClose:true,
				end:function(){
				window.location.href="main"
				}
				})
				}else if(data.stateType=="1"){
				$.msgPop("用户名或密码错误",function(){
				settimeout(1000);
				});
				$(".password").focus();
				}else if(data.stateType=="2"){
				$.msgPop("用户名或密码错误",function(){
				settimeout(1000);
				});
				$(".loginname").focus();
				}
				}
			})
		}
	}))
</script>
<script>
  
  </script>
</html>
