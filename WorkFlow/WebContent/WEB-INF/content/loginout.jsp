<%
  session.invalidate();
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统退出</title>
</head>
<body>
<table width="960" border="0" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
  <tr>
	<td height="264"><div align="center"><font color="#336666" size="3"><b>您已经成功地登出系统，欢迎下次光临</b></font></div></td>
  </tr>
</table>
</body>
</html>