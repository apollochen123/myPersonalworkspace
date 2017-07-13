<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
   <s:form action="LoginAction">
      <s:textfield name="username" label="用户名"/>
      <s:textfield name="password" label="密码"/>
      <tr align="center">
      <td colspan="2">
      <s:submit value="登录" theme="simple"></s:submit>
       <s:reset value="重设" theme="simple"/>
       </td>
       </tr>
       
   
   </s:form>
 
</body>
</html>