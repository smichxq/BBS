<%@page import="entity.User"%>
<%@page import="biz.impl.UserBizImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
      isErrorPage="false" errorPage = "Retry.jsp"%>
    <%@page import="com.jspsmart.upload.SmartUploadException"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%!
UserBizImpl ub = new UserBizImpl();
int flag = 0;
%>
<%
User user = (User) session.getAttribute("user");

//新建SU类
SmartUpload smartUpload = new SmartUpload();
//初始化上下文
smartUpload.initialize(this.getServletConfig(), request, response);
//允许文件格式
//smartUpload.setAllowedFilesList("png");

//开始上传
smartUpload.upload();
//jspsmartUpload获取表单二进制提交数据的方法：通过getRequest方法获取请求对象
//getParameter方法解析http数据区并返回表格数据
String userName = smartUpload.getRequest().getParameter("userName");
String gender = smartUpload.getRequest().getParameter("Sex");

//SU包的File类接收上传的文件
com.jspsmart.upload.File file = smartUpload.getFiles().getFile(0);
//得到文件名字
String fileName = userName;
//存储全路径
String path = "img/" + userName;
//存储
file.saveAs(path, SmartUpload.SAVE_VIRTUAL);
user.setGender(Integer.parseInt(gender));
user.setHead(path);
user.setUserName(userName);
flag = ub.addUser(user);
%>
<%if(flag==1){%>
	<jsp:forward page = "Success.jsp"/>
	<%}else{ %>
	<!-- 名字重复在网页直接抛出异常,将异常捕获并转到其他页面 -->
	<jsp:forward page = "Retry.jsp"/>
	<%} %>	
<body>

</body>
</html>