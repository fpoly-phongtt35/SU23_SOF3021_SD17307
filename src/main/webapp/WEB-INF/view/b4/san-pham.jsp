<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1> Hello, SD17307 </h1>
<table border="1">
    <tr>
        <th> Product Name </th>
        <th> Current Price </th>
        <th> Current Quantity </th>
        <th> Actions </th>
    </tr>
    <c:forEach items="${danhSachSanPham}" var="sanPham">
        <tr>
            <td> ${sanPham.ten} </td>
            <td> ${sanPham.giaHienHanh} </td>
            <td> ${sanPham.soLuongTon} </td>
            <td>
                <a href="/b4/cart/add/${sanPham.id}">
                    Add to Cart
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
