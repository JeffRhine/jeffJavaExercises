<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
		<li><c:set var='fib' value="1"/></li>
		<li><c:set var='prevFib' value="0"/></li>
		
		<c:forEach begin="1" end="25" >
		<c:set var='temp' value= "${fib }" />
		<c:set var='fib' value="${fib+prevFib }" />
		<c:set var='prevFib' value="${temp }" /> 
			<li> ${fib }</li>
		
		
		
		
		</c:forEach>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
		</ul>
	</body>
</html>
 int fibo = 1;
 int fiboPrev = 1;
 for(int i = 2; i < n; ++i){
  int temp = fibo;
  fibo += fiboPrev;
  fiboPrev = temp;
 }
 return fibo;
}