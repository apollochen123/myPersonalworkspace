<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>请输入你的注册信息</h2>
<s:fielderror />
<s:form action="regist" validate="true">  <!-- 客户端校验加上 validate="true"-->
	<s:textfield name="user" label="用户名"/>
	<s:textfield name="pass" label="密码"/>
	<s:textfield name="age" label="年龄"/>
	<s:textfield name="birth" label="生日"/>
	
	<tr>
		<td colspan="2"><s:submit value="注册" />
		<s:reset value="重填" theme="simple"/></td>
	</tr>
</s:form>
</body>
</html>