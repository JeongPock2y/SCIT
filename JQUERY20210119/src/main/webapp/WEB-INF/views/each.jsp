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
		var obj =[{
			"area" : "송파구"
		},{
			"area" : "구로구"
		},{
		 	"area" : "김포구"
		}];

		$(obj).each(function(i,o){
			//console.log(i+":",o);
			$("#menu li").eq(i).html(o.area);
		});
		console.log("===준짱 합격기도중 ==");

		$.each($("#menu1 li"), function(i,o){
			console.log(i+":",o);
			});
		console.log("===준짱 합격기도중 ==");

		$.each($("#menu1 li"), function(i,o){
			console.log(i+":",this);
			});
		console.log("===준짱 합격기도중 ==");

		$.each($("#menu1 li"), function(i){
			console.log(i+":",$(this))
			});
	});



</script>

</head>
<body>
    <h1>zkzkzkzzkzz</h1>
	<ul id="menu">
		<li>1.1</li>
		<li>1.2</li>
		<li>1.3</li>
	</ul>
	<ul id="menu1">
		<li>2.1</li>
		<li>2.2</li>
		<li>2.3</li>
	</ul>

</body>
</html>