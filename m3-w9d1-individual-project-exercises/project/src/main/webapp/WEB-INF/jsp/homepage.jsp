<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<%@ include file = "common/header.jspf" %>
    <section id="main-content">

          <h1>Click on image to select Category</h1>
		
		<c:forEach items= "${allCategories}" var="cat">
		<div id="categoryList">
		<p class="listName"><strong><c:out value="${cat.name}"/></strong></p>
		 <a href="productPage?id=${cat.id}"><img src="${cat.image}" class="listImage"/></a> 		
		</div>
		<br>
		</c:forEach>

    </section>
</body>
</html>