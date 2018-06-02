<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!--container -->
<div id="container">
	<!--snb -->
	<div class="snb">서브메뉴 하나</div>
	<!--//snb -->
	<!--content -->
	<div id="content">
	
		<table class="type03">
			<caption>* 리스트 게시판</caption>
			<colgroup>
				<col width="140px">
				<col width="/">
				<col width="200px">
				<col width="200px">
			</colgroup>
			<tr>
				<th scope="row">번호</th>
				<th>제목</th>
				<th>아이디</th>
				<th>등록일</th>
			</tr>
			<c:forEach items="${list}" var="lee">
				<tr>
					<td>${lee.bno}</td>
					<td class="TableLeft"><a href="/board/view?bno=${lee.bno }">${lee.title}</a></td>
					<td>${lee.userId}</td>
					<td>${lee.rgsde}</td>
				</tr>
			</c:forEach>
		</table>
		<br> <a href="/board/register" style="float: right">
			<button class="large color blue button">등록하기</button>
		</a> 
		<br>
		<br>
	</div>
	<!--//content -->
</div>
<!--//container -->

<!-- 레이어 팝업 -->
<div class="mask"></div>
<div class="window">
  <table class="type03">
    <caption>
    * 베이직 게시판
    </caption>
    <colgroup>
    <col width="140px">
    <col width="300px">
    <col width="/">
    </colgroup>
    <tr>
      <th scope="row">항목명</th>
      <th>내용이 들어갑니다.</th>
      <th>내용이 들어갑니다.</th>
    </tr>
    <tr>
      <td>내용이 들어갑니다.</td>
      <td><select class="input_txt">
          <option value="volvo">Volvo</option>
          <option value="saab">Saab</option>
          <option value="mercedes">Mercedes</option>
          <option value="audi">Audi</option>
        </select>
        <select class="input_txt">
          <option value="volvo">Volvo</option>
          <option value="saab">Saab</option>
          <option value="mercedes">Mercedes</option>
          <option value="audi">Audi</option>
        </select></td>
      <td class="TableLeft"><input type="email" placeholder="Email" class="input_txt">
        <label for="lee">hhhhhhhhhhhh</label></td>
    </tr>
  </table>
  <div class="TableCenter mgt30 mgb10">
    <button class="middle color blue button " >확인</button>
    <button class="middle button close">닫기</button>
  </div>
</div>

