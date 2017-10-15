<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file = "common/Header.jspf" %>

    <section id="main-content">

          <h1>Toy Department</h1>
		
		
		<div class="productDetail">
		<img src="img/${product.imageName}" class="detailImage"/>

		<p class="detailName"><strong><c:out value="${product.name}"/></strong><span class="priceDetail"><c:out value="${product.topSeller ? ' BEST SELLER!' : ' ' } " /></span> </p>
	
		<p class="mfgDetail">By <c:out value="${product.manufacturer}" /></p>
		<p class="priceDetail"><strong>$<c:out value="${product.price}" /></strong></p>
		<p class="weightDetail"><strong>Weight </strong><c:out value="${product.weightInLbs}" /> lbs </p>

		<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="starsDetail"/>

		</div>
	

    </section>
</body>
</html>