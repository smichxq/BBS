<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="CSS/Regist.css" type="text/css" rel="stylesheet"/>
<title>Reg</title>
<script>
	function check(){
		var accc = document.login.idRegist.value;
		var pwdd = document.login.pwRegist.value;
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
                    <input id="input-item-us" type="text" name="idRegist">
                    
                    <p id="pw">密码</p>
                    <input id="input-item-pw" type="password" name="pwRegist">
                    
                    <p id="pw">密码</p>
                    <input id="input-item-pw" type="password" name="pwRegist">
                    
                    <p id="pw">密码</p>
                    <input id="input-item-pw" type="password" name="pwRegist">
                    
                    <input id="sub" type="submit" name="submit" value="注册">
                    <input id="res" type="reset" name="reset" value="清除">
                </form>
            </div>
        </div>

</body>
</html>