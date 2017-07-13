<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加图书</title>
</head>
<body>
<h3>添加图书</h3>
<s:form action="addBook">
    <s:textfield name="book.author" label="作者"/>
	<s:textfield name="book.name" label="书名"/>
	<s:textfield name="book.price" label="价格"/>
	
	<tr align="center">
		<td colspan="2">
		<s:submit value="添加" theme="simple"/>
		<s:reset value="重设" theme="simple"/>
		</td>
	</tr>
</s:form>
</body>
</html>