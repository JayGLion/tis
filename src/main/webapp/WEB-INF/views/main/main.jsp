<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title></title>
<script src="<%=request.getContextPath()%>/dist/plugins/jQuery/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/dist/plugins/sockjs/sockjs-1.1.1.min.js"></script>
<script>
$(function() {
	ws = new SockJS('/echo');
	ws.onopen = function () {
		console.log('Info: WebSocket connection opened.');
	};
	ws.onmessage = function (event) {
		console.log('Received: ' + event.data);
	};
	ws.onclose = function () {
		console.log('Info: WebSocket connection closed.');
	}; 
})
</script>
</head>
<body>
main page
</body>
</html>