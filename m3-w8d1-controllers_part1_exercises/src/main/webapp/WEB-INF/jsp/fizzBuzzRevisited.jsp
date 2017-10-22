<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<title></title>

	</head>

	<body>
	<c:url var="formAction" value="/fizzBuzzResult"/>
		<form method="GET" action="${formAction }">
		<h2>FizzBuzz Revisited</h2>
		<div>
			<label for="div">Divisable By:</label>
			</div>
			<div>
			<input type="number" name="div" id="div" min="0">
			</div>
			<div>
			<label for="div2">Divisable By:</label>
				</div>
			<div>
			<input type="number" name="div2" id="div2" min="0">
			</div>
			<div>
			<label for="fizz">Alternative Fizz:</label>
				</div>
			<div>
			<input type="text" name="fizz" id="fizz">
			</div>
			<div>
			<label for="buzz">Alternative Buzz:</label>
				</div>
			<div>
			<input type="text" name="buzz" id="buzz">
			</div>
			<div>
			                
			</div>
			
			<div>
			<label for="num">Number 1:</label>
			<input type="number" name="num" id="num" min="0">
			</div>
			<div>
			<label for="num2">Number 2:</label>
			<input type="number" name="num2" id="num2" min="0">
			</div>
			<div>
			<label for="fizz">Number 3:</label>
			<input type="number" name="fizz" id="fizz" min="0">
			</div>
			<div>
			<label for="buzz">Number 4:</label>
			<input type="number" name="buzz" id="buzz" min="0">
			</div>
			<div>
			<label for="buzz">Number 5:</label>
			<input type="number" name="buzz" id="buzz" min="0">
			</div>
	
	 <input type="submit" >
	 </form>
	</body>
</html>