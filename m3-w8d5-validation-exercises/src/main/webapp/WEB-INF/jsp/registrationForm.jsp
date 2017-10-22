<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="pageTitle" value="Home Page"/>
<%@include file="common/header.jspf" %>

<h2>Register</h2>


	<head>
		<title>Register</title>
		<style>
		.error{
		color:red;
		}
		</style>
	</head>
	<body>
	
		<c:url var="registrationSubmitUrl" value="/registrationForm"/>
		<form:form method="POST" action="${registrationSubmitUrl }" modelAttribute="registrationForm">
			
			<div>
				<label for="firstName">First Name</label>
				<form:input path="firstName" placeholder="max 20 characters"/>
				<form:errors path="firstName" cssClass="error"/>
			</div>
			<div>
				<label for="lastName">Last Name</label>
				<form:input path="lastName" placeholder="max 20 characters"/>
				<form:errors path="lastName" cssClass="error"/>
			</div>
			<div>
				<label for="email">Email Address</label>
				<form:input path="email" placeholder="must be valid email"/>
				<form:errors path="email" cssClass="error"/>
			</div>
			<div>
				<label for="confirmEmail"> Confirm Email Address</label>
				<form:input path="emailMatch" placeholder="repeat email address"/>
				<form:errors path="emailMatch" cssClass="error"/>
			</div>
			<div>
				<label for="password">Password</label>
				<form:password path="password" placeholder="must be 8 characters"/>
				<form:errors path="password" cssClass="error"/>
			</div>
			<div>
				<label for="confirmPassword">Confirm Password</label>
				<form:password path="passwordMatch" placeholder="repeat password"/>
				<form:errors path="passwordMatch" cssClass="error"/>
			</div>
			<div>
				<label for="birthDate">Birth Date</label>
				<form:input path="birthDate" placeholder="mm/dd/yyyy"/>
				<form:errors path="birthDate" cssClass="error"/>
			</div>
			<div>
				<label for="numTickets">Number of Tickets</label>
				<form:input path="numTickets" placeholder="max 10 tickets"/>
				<form:errors path="numTickets" cssClass="error"/>
			</div>
			<div>
				<input type="submit" value="Submit"/>
			</div>
			</form:form>


<%@include file="common/footer.jspf" %>