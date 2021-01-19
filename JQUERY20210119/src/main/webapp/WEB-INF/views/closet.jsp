<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.4/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$(".txt1").closest("div")
			.css({
				"border" : "2px solid #F00"
			});

		});

</script>

</head>
<body>
	<h1 class="title">선택자</h1>
	<div>
		<div>
			<p class="txt1">내용</p>
		</div>
	</div>
</body>
</html>