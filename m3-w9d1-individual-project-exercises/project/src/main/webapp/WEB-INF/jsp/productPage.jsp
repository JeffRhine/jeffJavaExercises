<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<%@ include file = "common/header.jspf" %>
    <section id="main-content">

       <h1>Product Page</h1>
       <h4> (click on image for details)</h4>
		<div class="title">    Best Selling Products</div>
		<c:forEach items= "${allProducts}" var="product">
		<div id="bestSeller" >
		<c:if test="${product.lastMonth > 99}">
		 <a href="productDetail?id=${product.id }"><img src="${product.image}" class="bestImage"/></a> 

		<p class="bestName"><strong><c:out value="${product.product}"/></strong></p><p class="best">  BEST SELLER!</p>
	</c:if>
		</div>	
		</c:forEach>
		
		
		<div class="title">   Top Rated Products</div>
			<c:forEach items= "${allProducts}" var="product">
		<div id="ratedSeller" >
		<c:if test="${product.rating > 3}">
		 <a href="productDetail?id=${product.id }"><img src="${product.image}" class="ratedImage"/></a> 

		<p class="ratedName"><strong><c:out value="${product.product}"/></strong></p>
		  <fmt:formatNumber maxFractionDigits="0" value="${product.rating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="starsRated"/><br>
		  <br>
		  </c:if>
		</div>
		</c:forEach>
		
			<div class="title">   All Products</div>
			<c:forEach items= "${allProducts}" var="product">
		<div class="productList" >
		
		 <a href="productDetail?id=${product.id }"><img src="${product.image}" class="listImage"/></a> 

		<p class="listName"><strong><c:out value="${product.product}"/></strong></p>
		  <fmt:formatNumber maxFractionDigits="0" value="${product.rating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="starsDetail"/><br>
		  <br>
		 
		</div>
		</c:forEach>
		
       
    </section>
</body>
</html>