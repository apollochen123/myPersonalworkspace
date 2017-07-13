<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看自己的异常出勤</title>
</head>
<body>
<%@ include file="empheader.jsp" %>
<table width="960" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
<tr>
  <td>
     <table width="80%" align="center">
       <tr bgcolor="#e1e1e1"><td colspan="4" ><div class="mytitle">当前用户:<s:property value="#session.user"/></div> </td></tr>
       <tr bgcolor="#e1e1e1">
          <td colspan="4">你只能查看最近3天的打卡异动，有疑问向经理申请</td>
       </tr>
       <tr class="ptll" height=45>
          <td width="30%"><b>打卡日期</b></td>
          <td width="20%"><b>异动名称</b></td>
          <td width="25%"><b>打卡时间</b></td>
          <td width="25%"><b>&nbsp;</b></td>
       </tr>
       <s:iterator value="unAttend" status="index">
          <s:if test="#index.ood==true"><tr style="background-color:#dddddd" class="pt11" height="32"></tr></s:if>
          <s:else><tr class="ptll" height="32">
                   <td><s:property value="dutyDay"></s:property></td>
                   <td><s:property value="unType"></s:property></td>
                   <td><s:property value="time"></s:property></td>
                   <td><a href='appChange.action?attid=<s:property value="id"/>'>提出申请</a></td>
                  </tr>
          </s:else>
       </s:iterator>
     </table>
  </td>
</tr>
</table>
</body>
</html>