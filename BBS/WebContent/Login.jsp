<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="CSS/Login.css" type="text/css" rel="stylesheet"/>
<title>login</title>
<script>
	function check(){
		var accc = document.login.acc.value;
		var pwdd = document.login.pwd.value;
		if(accc=="" || pwdd ==""){
			alert("Password or userName is NULL! ");
			return false;
		}
		return true;
	}
</script>
</head>
<body>
<%@ include file = "Head.jsp" %>
	<div class="d1-container">
		<div class="d2-container">
			<form class="d1-inner-form-container" name="login" method="post" onSubmit="return check()" action="Check.jsp">
				<p id="us">用户名</p>
                <input id="input-item-us" type="text" name="acc">
				<p id="pw">密码</p>
				<input id="input-item-pw" type="password" name="pwd">
				
				<input id="sub" type="submit" name="submit" value="登录">
				<input id="res" type="reset" name="reset" value="清除">
			</form>
		</div>
	</div>


</body>
</html>