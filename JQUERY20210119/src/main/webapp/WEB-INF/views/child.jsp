<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.4/jquery.js"></script>
<script type="text/javascript">
	$(function(){
			$("#menu li:nth-child(1)")
			.css({"background-color":"#ff0"});
			$("#menu li:nth-child(2n)")
			.css({"border":"2px dashed #f00"});
			$("#menu2 li:nth-last-child(2)")
			.css({"background-color":"#0ff"});
	});



</script>

</head>
<body>
    <h1>zkzkzkzzkzz</h1>
    <ul id="menu">
    	<li>1.1</li>
    	<li>1.2</li>
    	<li>1.3</li>
    	<li>1.4</li>
    </ul>

    	<ul id="menu2">
    	<li>1.1</li>
    	<li>1.2</li>
    	<li>1.3</li>
    	</ul>

</body>
</html>