<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>出错</title>
</head>
<body>
<table width="960" align="center">
  <tr>
    <td height="39"><br>
    <div align="center">
    <font color="#FF0000" size="+1"><b>系统处理过程中发生了一个错误，信息如下：</b></font>
    </div>
    </td>
  </tr>
  <tr>
    <td height="315">
     <div class="pt11" style="color:red;width:600px;height:300px;
	 border:1px solid black;border-radius:10px"></div>
     <s:property value="exception.message"/>
    </td>
  </tr>
  <tr>
   <td><div align="center" style="font:large;color:#333333">
   请您先核对输入，如果再次出现该错误，请登录<a href="http//www.crazyit.org">http//www.crazyit.org</a>寻求答案，谢谢。
  </div><br></td>
  </tr>
</table>
</body>
</html>