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

td {
	padding: 5px;
}
</style>
 <script type="text/javascript">
 
 function goBack(){
	 history.go(-1);
 
 </script>

<h1 style="float: left">뷰페이지</h1>
<div>
	<table style="clear: both">
		<tr>
			<th style="text-align: center; background-color: #F2F2F2; width: 200px">번호</th>
			<td width="1000px;">${view.bno }</td>
		</tr>
		<tr>
			<th style="text-align: center; background-color: #F2F2F2; width: 200px">작성일</th>
			<td width="1000px;">${view.rgsde }</td>
		</tr>
		<tr>
			<th style="text-align: center; background-color: #F2F2F2; width: 200px">아이디</th>
			<td>${view.userId }</td>
		</tr>
		<tr>
			<th style="text-align: center; background-color: #F2F2F2; width: 200px">타이틀</th>
			<td>${view.title }</td>
		</tr>
		<tr>
			<th style="text-align: center; background-color: #F2F2F2; width: 200px">내용</th>
			<td>${view.content }</td>
		</tr>
	</table>
</div>


<a href=" /board/list" style="float: right">목록</a>