<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script>
	
$(document).ready(function() {
	// 체크 되어 있는 값 추출

	$("#bno").click(function() {

		var chked_val = "";
		  $(":checkbox[name='nn']:checked").each(function(pi,po){
		    chked_val += ","+po.value;
		  });
		  if(chked_val!="")chked_val = chked_val.substring(1);
		  	
		   alert(chked_val);
		  
		   $('.chnno').val(chked_val);
		   
		   $('#listFrm').attr('action','/board/delete').submit();
			return true;
	});
	
	
	
});
 
</script>

<!--container -->
<div id="container">
	<!--snb -->
	<div class="snb">서브메뉴 하나</div>
	<!--//snb -->
	<!--content -->
	<div id="content">
	<form id='listFrm'>
	<%-- <select name="search_option">
			<option value="title" <c:out value="${map.cri.search_option == 'title'?'selected':''}"/>>제목</option>
			<option value="userid" <c:out value="${map.cri.search_option == 'writer'?'selected':''}"/> >작성자</option>
		</select> 
		<input type="text" name="search_txt" value="${map.cri.search_txt}"> 
		<button class="middle color blue button">검색</button> --%>
		<input type="hidden" class="chnno"  name="bno" > 
			
		<table class="type03">
			<caption>* 리스트 게시판</caption>
			<colgroup>
				<col width="140px">
				<col width="140px">
				<col width="/">
				<col width="200px">
				<col width="200px">
			</colgroup>
			<tr>
				<th class='TableCenter'><button>
			<div id="bno">삭제</div>
		</button>
 			 </th>
				<th class='TableCenter'>번호</th>
				<th class='TableCenter'>제목</th>
				<th class='TableCenter'>작성자</th>
				<th class='TableCenter'>등록일</th>
			</tr>
			<c:forEach items="${list}" var="lee">
				<tr>
					<td class='TableCenter'><input type="checkbox" name="nn" value="${lee.bno }" /></td>
					<td class='TableCenter'>${lee.bno}</td>
					<td class="TableLeft"><a href="/board/view?bno=${lee.bno }">${lee.title}</a></td>
					<td class='TableCenter'>${lee.userId}</td>
					<td class='TableCenter'>${lee.rgsde}</td>
				</tr>
			</c:forEach>
		</table>
</form>	
		<br> <a href="/board/register" style="float: right">
			<button class="large color blue button">등록하기</button>
		</a> 
		<br>
		<br><br>
	</div>
	<!--//content -->
</div>
<!--//container -->

