<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Tiles View</title>
    <link rel="stylesheet" href="css/site.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
            <li><a href="productTable">Link 1</a></li>
            <li><a href="productTiles">Link 2</a></li>
        </ul>
        
    </nav>
    <section id="main-content">

        <h1>Toy Department</h1>
		
		<c:forEach items= "${products}" var="product">
		<div class="productTiles">
		<img src="img/${product.imageName}" class="productImage"/>

		<h1 class="productName"><c:out value="${product.name}"/><span class="price"><c:out value="${product.topSeller ? 'BEST SELLER!' : ' ' } " /></span> </h1>
	
		<h2 class="mfg">By <c:out value="${product.manufacturer}" /></h2>
		<h3 class="price"><strong>$<c:out value="${product.price}" /></strong></h3>
		<h5 class="weight"><strong>Weight </strong><c:out value="${product.weightInLbs}" /> lbs. </h5>

		<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="stars"/>
		</div>
		</c:forEach>

    </section>
</body>
</html>