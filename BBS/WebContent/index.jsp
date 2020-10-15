<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BBS</title>
</head>
<body>

<%@ include file = "Head.jsp" %>

<div id="d5"></div>

<script type="text/javascript">

	function add(){
		var h = document.createElement("hr");
		var d = document.createTextNode("div");
		var f = document.getElementById("d5");
		f.appendChild(h);
		f.appendChild(d);
	}
	for(i=0;i<20;i++){
		add();
	}

</script>

</body>
</html>