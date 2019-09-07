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
	<h1>Select Page</h1>
	<table border="1">
		<tr>
			<td>이름</td>
			<td><%=dto.getMyname() %></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><%=dto.getMytitle() %></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea rows="10" cols="60" readonly="readonly"><%=dto.getMycontent() %></textarea></td>
		</tr>
		<tr>
			<td>날짜</td>
			<td><%=dto.getMydate() %></td>
		</tr>
			
		<tr>
			<td colspan="4">
			<input type="button" onclick="location.href='myupdate.jsp?myno=<%=myno%>'" value="수정"/>
			<input type="button" onclick="location.href='mydelete.jsp?myno=<%=myno%>'" value="삭제"/>
			<input type="button" onclick="location.href='mylist.jsp;'" value="목록"/>
			</td>
		</tr>
	</table>
	



</body>
</html>