<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 1 - FizzBuzz</title>
		<style>
			li {
				list-style-type: none;
			}
			
			.fizz {
				color: blue;
			}
			
			.buzz {
				color: red;
			}
			
			.fizzbuzz {
				color: purple;
				font-size: 150%;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 1 - FizzBuzz</h1>
		<ul>
	<%-- 	<th>fizzbuzz</th> 
		
		
  	<td><c:out value="${fizzbuzz}"/></td>  --%>
		
	
		<c:forEach begin="1" end="100" var="fizzbuzz">
		
		
			<c:choose>
				<c:when test="${fizzbuzz %15==0}">
						<li class = "fizzbuzz" >fizzbuzz</li>
					</c:when>
					<c:when test="${fizzbuzz % 3==0}">
						<li class = "fizz" >fizz</li>
					</c:when>
					<c:when test="${fizzbuzz %5==0}">
						<li class = "buzz" >buzz</li>
					</c:when>
				
					
					
					<c:otherwise>
						<li ><c:out value="${fizzbuzz}"/></li>
					</c:otherwise>
				</c:choose>
					
				
				
				</tr>	
		
		</c:forEach>
			<%--
				Add a list item (i.e. <li>) containing each of the numbers from 1 to 100.
				
				if the number is divisible by 3, show "Fizz!" instead and style the item using the "fizz" class
				
				if the number is divisible by 5, show "Buzz!" instead and style the item using the "buzz" class
				
				if the number is divisible by both 3 and 5, show "FizzBuzz!" instead  and style the item using the "fizzbuzz" class
				
				see exercise1-fizzbuzz.png for example output
			 --%>
		</ul>
	</body>
</html>