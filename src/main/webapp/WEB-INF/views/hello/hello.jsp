<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Hello</title>
<script src="<%=request.getContextPath()%>/dist/plugins/jQuery/jquery.min.js"></script>
<script>
$(function() {
	
})
</script>
</head>
<body>
	<c:out value="<xmp>" escapeXml="true"></c:out>
	<h2>Hello! ${name}</h2>
</body>
</html>
