<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1> List of Products </h1>
<form>
    Enter something: <input name="tenSanPham" value="${param.tenSanPham}"/>
    <input type="submit" value="Search"/>
</form>
<c:if test="${empty pageSanPham.isEmpty()}">
    <h2> Not found any records!! </h2>
</c:if>
<c:if test="${not empty pageSanPham.isEmpty()}">
    <p>Found ${pageSanPham.getTotalElements()} records</p>
    <table border="1">
        <tr>
            <th> Product Id </th>
            <th> Product Name </th>
        </tr>
        <c:forEach items="${pageSanPham.getContent()}" var="product">
            <tr>
                <td> ${product.maSanPham} </td>
                <td> ${product.tenSanPham} </td>
            </tr>
        </c:forEach>
    </table>
    <div>
        <c:if test="${pageSanPham.getNumber() + 1 > 1}">
            <a href="?page=${pageSanPham.getNumber() + 1 - 1}&tenSanPham=${param.tenSanPham}">
                Previous
            </a>
        </c:if>
        <span> ${pageSanPham.getNumber() + 1} / ${pageSanPham.getTotalPages()} </span>
        <c:if test="${pageSanPham.getNumber() + 1 < pageSanPham.getTotalPages()}">
            <a href="?page=${pageSanPham.getNumber() + 1 + 1}&tenSanPham=${param.tenSanPham}">
                Next
            </a>
        </c:if>
    </div>
</c:if>