<%@page import="com.my.dto.MyBoardDto"%>
<%@page import="com.my.dao.MyBoardDao"%>
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
<%
	int myno = Integer.parseInt(request.getParameter("myno"));
	MyBoardDao dao = new MyBoardDao();
	MyBoardDto dto = dao.selectOne(myno);
%>

<body>

	<h1>Update Page</h1>
	
	<form action="myupdateres.jsp" method="post">
		<input type="hidden" name="myno" value="<%=dto.getMyno() %>">
		<table border="1">
			<tr>
				<td>이름</td>
				<td><%=dto.getMyname() %></td>	
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="mytitle" value="<%=dto.getMytitle() %>"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" cols="60" name="mycontent"><%=dto.getMycontent() %></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정"/>
					<input type="button" value="취소" onclick="location.href='mylist.jsp;'"/>
				</td>
		</table>
	</form>

</body>
</html>