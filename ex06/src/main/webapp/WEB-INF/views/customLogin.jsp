<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
	<title>Home</title>
</head>
<body>
<h1>
	Custom Login Page
</h1>
<h2><c:out value="${error}"></c:out></h2>
<h2><c:out value="${logout}"></c:out></h2>

<form action="/login" method="post">
	<div>
		<input type="text" name="username" value="admin">
	</div>
	<div>
		<input type="password" name="password" value="admin">
	</div>
	<div>
		<input type="checkbox" name="remember-me"> Remember Me
	</div>
	<div>
		<input type="submit">
	</div>
	<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }"/>

</form>
</body>
</html>
