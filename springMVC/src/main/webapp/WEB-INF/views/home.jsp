<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>


user = ${user}
id =  ${user.id }<br>
age =  ${user.age }<br>
birthDate =  ${user.birthDate }<br>
</body>
</html>
