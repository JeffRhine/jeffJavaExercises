<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 3 - Echo</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 3 - Echo</h1>
		
		<ul>
	 
		
		<c:forEach begin="1" end="${param.count}" step= "1" var="xxx">
		
		<li style="font-size:${param.count-xxx+1}px"><c:out value ="${param.word}"/></li>
		
	
		 </c:forEach>
		</ul>
		
	</body>
</html>