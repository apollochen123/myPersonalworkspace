<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>你已经注册成功</h2>
用户名：<s:property value="user"/><br>
密 &nbsp&nbsp码：<s:property value="pass"/><br>
年 &nbsp&nbsp龄：<s:property value="age"/><br>
生 &nbsp&nbsp日：<s:property value="birth"/><br>
您已经注册成功!
	<a href="viewLogin">返回登录界面</a>
</body>
</html>