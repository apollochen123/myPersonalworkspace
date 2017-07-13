<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看工资</title>
</head>
<body>
<%@include file="empheader.jsp" %>
<table width="960" align="center" background="${pageContext.request.contextPath}/images/bodybg.jpg">
  <tr>
     <td><br><table width="80%" align="center" border="0" cellspacing="1" bgcolor="#cccccc">
        <tr><td colspan="5"><div class="mytitle">当前用户:<s:property value="#session.user"/></div></td></tr>
        <tr class="ptll" height="45">
            <td><b>发薪月份</b></td>
            <td><b>发薪数量</b></td>
        </tr>
        <s:iterator value="salarys" status="index">  
 	         <s:if test="#index.odd == true"> 
		         <tr style="background-color:#dddddd" class="pt11" height="32"></tr>
	         </s:if> 
          <s:else><tr class="ptll" height="32">
                   <td><s:property value="payMonth"></s:property></td>
                   <td><s:property value="amount"></s:property></td>
                  </tr>
          </s:else>
               
         </s:iterator>
     </table></td>
  </tr>
</table>
</body>
</html>