<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<title></title>

	</head>

	<body>
	<c:url var="formAction" value="/colorizedResult"/>
		<form method="GET" action="${formAction }">
		<h2>Enter Name:</h2>
		<div>
			<label for="firstName">First Name:</label>
			<input type="text" name="firstName" id="firstName">
			</div>
			<div>
			<label for="lastName">Last Name:</label>
			<input type="text" name="lastName" id="lastName">
			</div>
			
			<h2> Choose order:</h2>
			<div>
	<input type="checkbox" name="red" value="true" /><span>  Red</span>
	</div>
	<div>
	<input type="checkbox" name="blue" value="true"  /><span>  Blue</span>
	</div>
	<div>
	<input type="checkbox" name="green" value="true"  /><span>  Green</span>
	</div>
	 <input type="submit" >
	 </form>
	</body>
</html>