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
        <a href=""> Previous </a>
        <span> ${pageSanPham.getNumber() + 1} / ${pageSanPham.getTotalPages()} </span>
        <a href=""> Next </a>
    </div>
</c:if>