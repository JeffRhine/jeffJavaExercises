<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file = "common/Header.jspf" %>
    <section id="main-content">



         <h1>Toy Department</h1>
    <table id="productTable">
    <tr>
		<th>&nbsp;</th>
		<c:forEach items="${products}" var="product">
		<td><a href="productDetail?productId=${product.productId }"><img src="img/${product.imageName}" class="productImage"/></a></td>
		</c:forEach>
		</tr>
		<tr>
		  <th>&nbsp;</th>
    <c:forEach items="${products}" var="product" >
		<td class="price"><c:out value="${product.topSeller ? 'BEST SELLER!' : ' ' } " /></td>
		</c:forEach>
		</tr>
		<tr class="greyed">
    <th>Name</th>
    <c:forEach items="${products}" var="product" >
		<td><c:out value="${product.name}" /></td>
		</c:forEach>
		</tr>
			<tr >
    <th>Rating</th>
    <c:forEach items="${products}" var="product" >
		<td><fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="rating"/>
		</td>
		</c:forEach>
		</tr>
		<tr class="greyed">
		<th>Mfr</th>
	  <c:forEach items="${products}" var="product" >
		<td><c:out value="${product.manufacturer}" /></td>
		</c:forEach>
		</tr>
		<tr >
		<th>Price</th>
		<c:forEach items="${products}" var="product" >
		<td class="price"><strong>$<c:out value="${product.price}" /></strong></td>
		</c:forEach>
		</tr>
		<tr class="greyed">
		<th>Wt. (in lbs)</th><c:forEach items="${products}" var="product" >
		<td><c:out value="${product.weightInLbs}" /> </td>
		</c:forEach>
		</tr>
	
		
		
		</table>
       

    </section>
</body>
</html>