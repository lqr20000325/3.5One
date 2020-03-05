<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="resources/js/jquery-1.8.2.min.js"></script>
<body>
	<script src="https://cdn.bootcss.com/blueimp-md5/2.10.0/js/md5.js"></script>
	
	请输入：<input type="text" id="number1"><br>
	<input type="button" value="加密" onclick="aaa()"><br>
	
	<div>
		加密后：<input type="text" id="number2">
	</div>
	
	<script type="text/javascript">
		function aaa() {
			var number = $("#number1").val();
			 $("#number2").val(md5(number));
		}
	</script>
</body>
</html>