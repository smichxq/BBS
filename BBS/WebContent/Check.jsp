<%@page import="java.util.Date"%>
<%@page import="java.text.*"%>
<%@page import="java.util.*"%>
<%@page import="dao.UserDao"%>
<%@page import="biz.UserBiz"%>
<%@page import="biz.impl.UserBizImpl"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="entity.*,dao.impl.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<%!
String idLogin = null;
String pwLogin =null;

String idRegist = null;
String pwRegist = null;

UserBiz ub = null;

Statement ps = null;

Connection connection = null;

String string = null;

User user = null;

Date date = null;

DateFormat dateFormat = null;

%>
<%
	idLogin = request.getParameter("idLogin");
	pwLogin = request.getParameter("pwLogin");
	
	idRegist = request.getParameter("idRegist");
	pwRegist = request.getParameter("pwRegist");

	ub = new UserBizImpl();
	
	//如果是注册页面,那么idLogin与pwLogin就不会被传也就是null
	if(idLogin==null){
		//检查注册id合法性
		user = ub.findUser(idRegist);
		//合法（没找到）
		if(user==null){
			user = new User();
			date = new Date();
			dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
			user.setUserId(Integer.parseInt(idRegist));
			user.setUserPass(pwRegist);
			user.setUserName("sss");
			user.setHead("0x11");
			user.setGender(UserDao.FEMALE);
			user.setRegTime(date);
		}
	}
	
	


	if(true)

	{ %>
	
		<jsp:forward page = "Success.jsp">
			<jsp:param value="<%= idLogin %>" name="accc"></jsp:param>
			</jsp:forward>
		
	<%} else{ %>
	
		<jsp:forward page="ReTry.jsp"></jsp:forward>
		
		<%} %>

<body>

</body>
</html>