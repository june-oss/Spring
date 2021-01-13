<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<button id="send">send</button>
<div id="map" style="width:500px;height:400px;"></div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=0e7b9cd1679ce3dedf526e66a6c1a860"></script>
	<!-- services 라이브러리 불러오기 -->
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=0e7b9cd1679ce3dedf526e66a6c1a860&libraries=services"></script>
	<script>
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(33.450701, 126.570667),
			level: 3
		};

		var map = new kakao.maps.Map(container, options);
	</script>
	<script type="text/javascript">
		
		$(document).ready(function(){
			$("#send").on("click", function(e){
				 $.ajax({
			           url:'https://dapi.kakao.com/v2/local/search/address.json?query='+encodeURIComponent('숭의동'),
			           type:'GET',
			           headers: {'Authorization' : 'KakaoAK e511e2ddb9ebfda043b94618389a614c'},
				   success:function(data){
				       console.log(data);
				   },
				   error : function(e){
				       console.log(e);
				   }
				});
			})
			
			
		});
	
	</script>
</body>
</html>