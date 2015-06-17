<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>

<h1>sp ban chay</h1>
<c:forEach var="ps" items="${ProductSelling}">
${ps.ma_sp} <br>
${ps.tensp} <br>
${ps.ngayNhap} <br>
${ps.giaNhap} <br>
</c:forEach>

<h1>sp noi bat</h1>
<c:forEach var="pf" items="${ProductFeatured}">
${pf.ma_sp} <br>
${pf.tensp} <br>
${pf.ngayNhap} <br>
${pf.giaNhap} <br>
</c:forEach>



</body>
</html>