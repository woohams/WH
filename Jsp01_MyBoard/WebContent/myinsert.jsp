<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Insert Page</h1>
	
	<form action="myinsertres.jsp" method="post">
		<table border="1">
			<tr>
				<td>이름</td>
				<td><input type="text" name="myname"/></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="mytitle"/></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" cols="60" name="mycontent"></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="작성완료"/>
					<input type="button" value="돌아가기" onclick="location.href='mylist.jsp;'"/>
				</td>
			</tr>
		</table>
	</form>
	
	

</body>
</html>