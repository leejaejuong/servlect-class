<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>result page</h1>
<%-- 	<p>userName : <%= request.getParameter("userName") %></p>
	<p>userAge : <%= request.getParameter("userAge") %></p> --%>
	
	<%-- %--는 EL 표현식 이다  
	서블릿에서 request 객체에 setAttribute로 담은 데이터를 간편하게 꺼내 쓸 수 있다 --%>
	
	<p>userName : ${userName}</p>
	<p>userAge : ${userAge}</p>
	
	<p>name : <c:out value="${userName}"/></p>
	<p>age : <c:out value="${userAge}"/></p>
	
	<c:forEach var ="i" begin ="0" end="9" step="1">
	<p> <c:out value = "${i}"/> </p>
	</c:forEach>
	
	<c:if test="${userAge>5}">
	<c:out value = "${userName}"/>님의 나이는 5살을 초과하였습니다
	</c:if>
	<c:choose>
	<c:when test="${userAge >20}">20살초과</c:when>
	<c:when test="${userAge >5}">5살초과</c:when>
	
	</c:choose>
</body>
</html>