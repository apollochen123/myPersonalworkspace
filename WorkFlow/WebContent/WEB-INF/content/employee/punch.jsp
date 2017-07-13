<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电子打卡</title>
</head>
<body>
<%@ include file="empheader.jsp" %>
<table width="960" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
    <tr>
      <td colspan="3"><br/><br/><div class="mytitle">电子打卡系统</div></td>
      <td colspan="3" style="text-align:center;"><br/>
      <!-- 当punchIsValid值为1,3时，可以上班打卡 -->
      <s:if 
      test="punchIsValid==1||punchIsValid==3">
      <s:form action="employeeCome" theme="simple">
      <s:submit value="上班打卡"/>
      </s:form>
      </s:if>
      <!-- 当punchIsValid为2、3时，可下班打卡 -->	
      <s:if test="punchIsValid==2|| punchIsValid==3">
       <s:form action="employeeLeave" theme="simple">
	   <s:submit value="下班打卡"/>
      </s:form>
      </s:if>
      <br/>
      </td>
    </tr>
</table>
</body>

</html>