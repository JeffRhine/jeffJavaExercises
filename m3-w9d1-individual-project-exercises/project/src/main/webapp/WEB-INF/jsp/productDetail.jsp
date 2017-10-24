<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<%@ include file = "common/header.jspf" %>
    <section id="main-content">

        
     <h1>Product Details</h1>
		
		<c:forEach items= "${productDetail}" var="product">
		<div id="productList">
		
		<img src="${product.image}" class="detailImage"/>

		<p class="detailName"><strong><c:out value="${product.product}"/></strong><%--<span class="priceDetail"> <c:out value="${product.topSeller ? ' BEST SELLER!' : ' ' } " /></span> </p> --%>
	
		<p class="mfgDetail"><c:out value="${product.description}" /></p>
		<p class="priceDetail"><strong>$<c:out value="${product.price}" /></strong></p>
		
<%-- 
		<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="starsDetail"/> --%>

		</div>
		</c:forEach>
    </section>
</body>
</html>