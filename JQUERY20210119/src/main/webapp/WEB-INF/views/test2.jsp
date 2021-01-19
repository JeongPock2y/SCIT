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
		$("#menu li").eq(2)
            .css({"background-color":"#ff0"});
        $("#menu li:lt(2)")
            .css({"background-color":"#f0f"});
        $("#menu li:gt(2)")
            .css({"background-color":"#f0f"});
		});




</script>

</head>
<body>
    <h1>탐색선탣</h1>
    <ul id="menu">
        <li>11</li>
        <li>22</li>
        <li>33</li>
        <li>44</li>
        <li>55</li>

    </ul>
</body>
</html>