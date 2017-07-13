<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工首页</title>
</head>
<body>
<%@include file="empheader.jsp" %>
<table width="960" align="center" 
background="${pageContext.request.contextPath}/images/bodybg.jpg">
  <tr height="60">
     <td>&nbsp;</td>
  </tr>
  <tr>
     <td>
       <s:if test="actionMessages.size()>0">
           <div class="error">
              <s:actionmessage/>
           </div>
       
       </s:if>
     </td>  
  </tr>
  <tr>
    <td><s:property value="#session.user"/>,欢迎使用你的JavaEE系统，你是普通员工</td>
    
  </tr>
  <tr height="60">
     <td>&nbsp;</td>
  </tr>
</table>
</body>
</html>