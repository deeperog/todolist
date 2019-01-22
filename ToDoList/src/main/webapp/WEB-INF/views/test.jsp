<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<input id="content" type="text" />
<button onclick="enter()">등록</button>
<h2 id="list">${VO}</h2>
</body>
<script>
var content = '';
	function enter() {
 		$.ajax({
			url: '${pageContext.request.contextPath}/',
			type: 'post',
			datatype: 'JSON',
			data: {
				"content": $('#content').val()
			},
			success: function(data){
 				$(data).each(
                        function(key, value) {
                        	content += '<h2>'+value+'</h2>';
                        	console.log(value);
                        });
 				/* content += '<h2>'+data+'</h2>'; */
				$('#list').html(content);
			},
			error: function() {
                alert("왓!!?!?!?");
            }
		});
		}
</script>

</html>