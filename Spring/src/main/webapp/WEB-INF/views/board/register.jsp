<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
table {
	border-collapse: collapse;
}

table, th, td {
	border: 1px solid #cccccc;
}

th {
	padding: 10px 5px;
}
</style>

<form method="post" action="/board/register">
	<table>
		<tr>
			<th width="200px;" style="text-align: center; background-color: #F2F2F2;">제목</th>
			<td width="1000px;"><input name="title" style="width: 800px; height: 38px;"></td>
		</tr>
		<tr>
			<th style="text-align: center; background-color: #F2F2F2;">내용</th>
			<td><textarea rows="4" cols="50" name="content" style="width: 100%"></textarea></td>
		</tr>
	</table>
	<input type="submit" value="전송"></input>
</form>


