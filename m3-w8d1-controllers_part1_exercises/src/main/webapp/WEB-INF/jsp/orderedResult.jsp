<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>

	<head>
		<title></title>

	</head>

	<body>
<h2>Ordered Name</h2>

  First Name:  <c:out value="${ nameModel.firstName}"/><br>
  Middle Initial:  <c:out value="${ nameModel.mI}"/><br>
  Last Name:  <c:out value="${ nameModel.lastName}"/><br>
  
  <div>
  <h2>Ordered:</h2>
  </div>
  <c:if test="${nameModel.fml}">
  <div ><c:out value="${nameModel.firstName }"/> <c:out value="${nameModel.mI }"/> <c:out value="${nameModel.lastName }"/>
	</div></c:if>
	 <c:if test="${nameModel.fl }">
  <div><c:out value="${nameModel.firstName }"/> <c:out value="${nameModel.lastName }"/>
	</div></c:if>
	 <c:if test="${nameModel.lmf}">
  <div><c:out value="${nameModel.lastName }"/>,<c:out value="${nameModel.firstName }"/> <c:out value="${nameModel.mI }"/>
	</div></c:if>
	 <c:if test="${nameModel.lf}">
  <div><c:out value="${nameModel.lastName }"/>,<c:out value="${nameModel.firstName }"/> 
	</div></c:if>

</body>