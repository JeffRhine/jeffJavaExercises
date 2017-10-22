<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <c:url value="/css/squirrel.css" var="cssHref" />
   
    
    <link rel="stylesheet" href="${cssHref}">
</head>


<section class="centeredPanel">
<h2> Post a Review</h2>
<c:url var="formAction" value="/reviewPage" />
<form method="POST" action="${formAction}">
	<div class="formInputGroup">
		<label for="username">User Name:</label> 
		<input type="text" name="username" id="userName" />
	</div>
	<div class="formInputGroup">
		<label for="rating">Rating(1 to 5 stars):</label> 
		<input type="number" min="1" max="5" name="rating" id="rating" />
	</div>

	
	<div class="formInputGroup">
		<label for="title">Title:</label> 
		<input type="text" name="title" id="title" />
	</div>
	<div class="textBox">
		<label for="text">Text:</label> 
		<input type="text" name="text" id="text" />
	</div>
	
	<input class="formSubmitButton" type="submit" value="Submit" />

</form>
</section>