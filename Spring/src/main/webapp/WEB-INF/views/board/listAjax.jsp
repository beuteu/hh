<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript">

		$.ajax({
			url : 'http://localhost/board/listAjax.do',
			dataType : 'json',
			type : 'GET',
			success : function(data) {
				var listBoard = ""
				var list = data.list
				
				for (var i = 0; i < list.length; i++) {

					listBoard += "<div style='cursor: pointer;' class='popnotice' data-bno='"+list[i].bno+"' data-title='"+list[i].title+"'  data-content='"+list[i].content+"'  data-userId='"+list[i].userId+"'  data-regde='"+list[i].regde+"'  >"
							+ list[i].bno
							+ list[i].userId
							+ list[i].title
							+ list[i].content
							+ list[i].regde 
							+ "</div>"

				}

				$("#listBoard").html(listBoard);

			}

		});

</script>
<div id="listBoard">hjhj</div>

