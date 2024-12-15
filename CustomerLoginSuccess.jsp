<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.println("Dear "+session.getAttribute("sname")+", you have successfully loged in");
%><br>
<a href = "carDetails.html">Enter your car Details</a><br>
<a href = >Edit car Details</a><br>
<a href = "serviceRequest.html">Request for a Services</a><br>
<a href = "serviceStatus.html">Check service status</a><br>
</body>
</html>