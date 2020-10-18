<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BBS</title>
</head>
<body style="background-color:#ffffff;">
<jsp:include page = "Head.jsp" />

<%for(int i = 0; i<10; i++){ %>
		<jsp:include page = "Board.jsp" />
		<br>
		<%} %>


<script type="text/javascript">

	function add(){
		var h = document.createElement("hr");
		var d = document.createTextNode("div");
		var f = document.getElementById("d5");
		f.appendChild(h);
		f.appendChild(d);
	}

</script>

</body>
</html>