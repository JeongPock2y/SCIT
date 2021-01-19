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
        $("#menu li:first")
            .css({"background-color":"#ff3399"});

        $("#menu li:last")
            .css({"background-color":"#FF0"});

        $("#menu li:odd")
        .css({"background-color":"#FF0"});

		});




</script>

</head>
<body>
    <h1>선탣</h1>
    <ul id="menu">
        <li>1</li>
        <li>2</li>
        <li>3</li>
        <li>4</li>

    </ul>
</body>
</html>