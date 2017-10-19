<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<c:set var="subTitle" value="Ordered Name" />

<section class="centeredPanel">
<h2>Enter Name</h2>
<c:url var="formAction" value="/orderedResult" />
<form method="GET" action="${formAction}">
	<div class="formInputGroup">
		<label for="firstName">First Name:  </label> 
		<input type="text" name="firstName" id="firstName" />
	</div>
	<div class="formInputGroup">
		<label for="mI">Middle initial:</label> 
		<input type="text" name="mI" id="mI" />
	</div>
	<div class="formInputGroup">
		<label for="lastName">Last Name:  </label> 
		<input type="text" name="lastName" id="lastName" />
	</div>
		
<p> Choose order:</p>
<div>
	<input name="fml" class="formRadioButton" type="radio" value="true" /><span>  First MI Last</span>
	</div>
	<div>
	<input  name="fl" class="formRadioButton" type="radio" value="true" /><span>  First Last</span>
	</div>
	<div>
	<input  name="lmf" class="formRadioButton" type="radio" value="true" /><span>  Last, First MI</span>
	</div>
	<div>
	<input  name="lf" class="formRadioButton" type="radio" value="true" /><span>  Last, First </span>	
	</div>
		<div>
	<input class="formSubmitButton" type="submit" value="Submit" />
	</div>
</form>
</section>  