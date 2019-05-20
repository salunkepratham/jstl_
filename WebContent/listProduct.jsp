<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table border=1pix solid black>
<tr <c:forEach items="${productDeatils}" var="product">>

	<td>${product.proId }</td>
	<td>${product.proName }</td>
	<td>${product.proCost }</td>
</tr</c:forEach>>
</table>