<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<LINK href="resources/css/css.css" type="text/css" rel="stylesheet">
<script src="resources/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<input type="button" value="批量删除" onclick="deleteBatch()"> 
	<table>
		<tr>
			<td></td>
			<td>编号</td>
			<td>名称</td>
			<td>导演</td>
			<td>票价</td>
			<td><a href="javascript:query('uptime')">上映时间</a></td>
			<td><a href="javascript:query('longtime')">时间长度</a></td>
			<td>类型</td>
			<td><a href="javascript:query('year')">年代</a></td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${info.list }" var="list">
			<tr>
				<td><input type="checkbox" value="${list.id }" class="ck"></td>
				<td>${list.id}</td>
				<td>${list.name}</td>
				<td>${list.actor}</td>
				<td>${list.price}</td>
				<td><fmt:formatDate value="${list.uptime}" pattern="yyyy-MM-dd"/></td>
				<td>${list.longtime}</td>
				<td>${list.type}</td>
				<td>${list.year}</td>
				<td>${list.area}</td>
				<td>${list.status}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100">
				${page }
			</td>
		</tr>
	</table>
	
	<script type="text/javascript">
		var orderMethod = '${movieVo.orderMethod=='asc'?'desc':'asc'}';
		function query(orderField) {
			location.href="selects?orderField="+orderField+"&orderMethod="+orderMethod;
		}
		
		
		function deleteBatch() {
			var ids = $("[class=ck]:checked").map(function() {
				return this.value
			}).get().join();
			
			alert(ids);
			if(ids.length==0){
				alert("至少选中一个");
				return;
			}
			
			$.post(
				"deleteBatch",
				{ids:ids},
				function (flag) {
					if(flag){
						alert("成功");
						location.reload();
					}else{
						alert("失败");
					}
				},
				"json"
			)
		}
	</script>
</body>
</html>