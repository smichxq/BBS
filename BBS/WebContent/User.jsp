<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>用户中心</title>

</head>
<body>
<!-- 解决如何同时提交图片和信息（异步提交） -->
 <!-- 传输文件必须指定编码类型 enctype="multipart/form-data"-->
  <!-- 这表示从表单传输的任何数据都被转为二进制数据并放在http数据区打包-->
 <!-- 表格提交的本质是http请求,可以在serverlet获取二进制数据并处理 -->
 <!-- 
 表单数据都保存在http的正文部分，各个表单项之间用boundary隔开。
 格式类似于下面这样：用request.getParameter是取不到数据的，
 这时需要通过request.getInputStream来取数据，不过取到的是个InputStream，
 所以无法直接获取指定的表单项（需要自己对取到的流进行解析，才能得到表单项以及上传的文件内容等信息）
 。这种需求属于比较共通的功能，所以有很多开源的组件可以直接利用。
 比如：apache的fileupload组件,smartupload等。通过这些开源的upload组件提供的API，
 就可以直接从request中取得指定的表单项了。 
 -->
<form id="form-file" action="Save.jsp" enctype="multipart/form-data" method="post" >
	<input type="file" name="img"><br>
	男<input type="radio" checked="checked" name="Sex" value="1" /><br>
	女<input type="radio" name="Sex" value="2" /><br>
	<input type="text" name = "userName"><br>
	<input type = "submit" value="提交">
</form>



<script>

</script>

</body>
</html>