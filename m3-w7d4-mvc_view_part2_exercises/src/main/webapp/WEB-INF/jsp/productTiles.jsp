<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file = "common/Header.jspf" %>
    <section id="main-content">

        <h1>Toy Department</h1>
		
		<c:forEach items= "${products}" var="product">
		<div class="productTiles">
		<a href="productDetail?productId=${product.productId }"><img src="img/${product.imageName}" class="productImage"/></a>

		<p class="productName"><strong><c:out value="${product.name}"/></strong><span class="price"><c:out value="${product.topSeller ? ' BEST SELLER!' : ' ' } " /></span> </p>
	
		<p class="mfg">By <c:out value="${product.manufacturer}" /></p>
		<p class="priceTile"><strong>$<c:out value="${product.price}" /></strong></p>
		<p class="weight"><strong>Weight </strong><c:out value="${product.weightInLbs}" /> lbs. </p>

		<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="stars"/>
		</div>
		</c:forEach>

    </section>
</body>
</html>