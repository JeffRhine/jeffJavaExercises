<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <c:url value="/css/squirrel.css" var="cssHref" />
   
    
    <link rel="stylesheet" href="${cssHref}">
</head>
<img src="img/forDummies.png" class="centered"/>
<section class="centeredPanel">
<h2> Squirrel Party for Dummies</h2>

<div class="post-container">
<c:forEach items="${allReviews }" var="review">
	<div class="post">
	<br>
		 <strong> <c:out value="${review.title }"/></strong> (<c:out value="${review.username }"/>) <br>
		 <br>
		  <c:out value="${review.dateSubmitted}"/><br>
		  <br>
		  <fmt:formatNumber maxFractionDigits="0" value="${review.rating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="starsDetail"/><br>
		  <br>
		  <c:out value="${review.text }"/><br>
		  <br>___________________________________________________________________________________________________________________
		  <br>
	</div>
</c:forEach>
</div>

<c:url var="makePost" value="reviewPage"/>
<a href="${makePost}">Post New Review</a>
</section>


<%-- <fmt:formatNumber maxFractionDigits="0" value="${review.rating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="starsDetail"/> --%>