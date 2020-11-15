<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="CSS/CreateTopic.css" type="text/css" rel="stylesheet"/>
<title>发帖</title>
</head>
<body>

<div class="createTopicBox">

	<p class="title-text">标题</p>
	
	<div class="title">
	

		
        <textArea id="inputTitle" name="title"></textArea>
                

		
	</div>
	
	<p class="content-text">内容</p>
	

	<div class="content">
	
		
		
         <textArea id="inputContent" name="content"></textArea>
                

		
	</div>
	
	<button class="but" type="button" onclick='getMsg()'>button</button>
	

</div>

<script type="text/javascript">

	function getMsg(){
		var title = document.getElementById("inputTitle").value;
		var content = document.getElementById("inputContent").value;
		sub(title,content);
		
	}
	
	function sub(T,C){
		var url = "TopicCheck.jsp";
		
        var Form = document.createElement("form");
        document.body.appendChild(Form);
        Form.method = "POST";
        Form.action = url;

        var titleInput = document.createElement("input");

        var contentInput = document.createElement("input");
		
        titleInput.setAttribute("type", "hidden");
        contentInput.setAttribute("type", "hidden");
        
        Form.appendChild(titleInput);
        Form.appendChild(contentInput);
        

        titleInput.setAttribute("name", "title");
        contentInput.setAttribute("name", "content");
        
        titleInput.setAttribute("value", T);
        contentInput.setAttribute("value", C);
        
        Form.submit();
	} 
	
</script>

</body>
</html>