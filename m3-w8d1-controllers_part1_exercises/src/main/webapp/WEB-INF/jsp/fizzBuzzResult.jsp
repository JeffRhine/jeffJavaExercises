<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>

	<head>
		<title> Fizz Buzz Results</title>

	</head>

	<body>
<h2></h2>

 	 Divisable By: <c:out value="${ fizzBuzzModel.divBy}"/><br>
 	 Divisable By: <c:out value="${fizzBuzzModel.divBy2}"/><br>
 	 Divisable By: <c:out value="${ fizzBuzzModel.divBy}"/> and <c:out value="${fizzBuzzModel.divBy2}"/><br>
  
  <c:if test="${colorizedName.red }">
  <div style="color:red;"><c:out value="${colorizedName.firstName }"/><c:out value="${colorizedName.lastName }"/>
	</div></c:if>
	 <c:if test="${colorizedName.blue }">
  <div style="color:blue;"><c:out value="${colorizedName.firstName }"/><c:out value="${colorizedName.lastName }"/>
	</div></c:if>
	 <c:if test="${colorizedName.green}">
  <div style="color:green;"><c:out value="${colorizedName.firstName }"/><c:out value="${colorizedName.lastName }"/>
	</div></c:if>

</body>