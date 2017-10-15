<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file = "common/Header.jspf" %>

    <section id="main-content">

          <h1>Toy Department</h1>
		
		<c:forEach items= "${products}" var="product">
		<div id="productList">
		<a href="productDetail?productId=${product.productId }"><img src="img/${product.imageName}" class="listImage"/></a>

		<p class="listName"><strong><c:out value="${product.name}"/></strong><span class="price"><c:out value="${product.topSeller ? ' BEST SELLER!' : ' ' } " /></span> </p>
	
		<p class="mfgList">By <c:out value="${product.manufacturer}" /></p>
		<p class="priceList"><strong>$<c:out value="${product.price}" /></strong></p>
		<p class="weightList"><strong>Weight </strong><c:out value="${product.weightInLbs}" /> lbs </p>

		<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="starsList"/>

		</div>
		<br>_______________________________________________________________________________________________________________________
		</c:forEach>

    </section>
</body>
</html>
