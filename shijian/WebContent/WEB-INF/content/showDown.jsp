<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选择你要下载的文件</title>
</head>
<body>

<p>选择你要下载的文件，如果未登录请先登录<br>

${requestScope.tip}
<h1>Struts 2的文件下载</h1>
	<ul>
	<li>
	下载图形文件：
		<a href="download1.action">下载图形文件</a> 
	</li>
	<li>
	下载压缩文件：
		<a href="download2.action">下载压缩文件</a>
	</li>
	</ul>
</body>
</html>