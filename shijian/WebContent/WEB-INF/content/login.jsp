<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
</head>
<body>
${requestScope.tip}
<form action="login" method="post">
<table align="center">
	<caption>
	<h2>用户登录</h2>
	</caption>
	<tr>
		<td>用户名：<input type="text" name="user"/></td>
	</tr>
	<tr>
		<td>密&nbsp;&nbsp;码：<input type="text" name="pass"/></td>
	</tr>
	<tr align="center">
		<td><input type="submit" value="登录"/><input type="reset" value="重填" /></td>
	</tr>
</table>
</form>
没有注册，点击完成注册：
<a href="viewRegist">进入注册界面</a>
</body>
</html>