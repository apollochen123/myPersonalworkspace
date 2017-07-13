<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>全部图书</title>
</head>
<body>
<h3>全部图书</h3>
<table width="640" border="1" height="320">
	<s:iterator value="books" var="b">
		<tr>
			<td><s:property value="name"/></td>
			<td><s:property value="price"/></td>
			<td><s:property value="author"/></td>
			<td><a href="${pageContext.request.contextPath}/deleteBook?id=${b.id}">删除</a></td>
		</tr>
	</s:iterator>
</table>
</body>
</html>