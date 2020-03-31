<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.request.contextPath }/">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="loginUser.do" method="post">
		手机号：<input type="text" name="cellphone"></br>
		密码：<input type="password" name="password"></br>
		
		<input type="text"  name="login_time" id="getBookTime" value=""><br>
		
		<div id="login_button_container"></div>
		
	</form>
	<a href="registerUser.do">去注册</a>
	
	
	
	
	<script src="https://unpkg.com/react@16/umd/react.development.js" crossorigin></script>
  <script src="https://unpkg.com/react-dom@16/umd/react-dom.development.js" crossorigin></script>

  <!-- 加载我们的 React 组件。-->
  <script src="js/login_button.js"></script>
  
  <script>
	window.onload = function(){
	function getDate(){
	debugger;
	var today = new Date(); 
	var date; 
	date = (today.getFullYear()) +"-" + (today.getMonth() + 1 ) + "-" + today.getDate() + "-" + today.toLocaleTimeString(); 
	return date;
	}
	
	window.setInterval(function(){
	document.getElementById("getBookTime").value=getDate();
	}, 1000);
	
	}
	
	
	
</script>
  
  
</body>
</html>