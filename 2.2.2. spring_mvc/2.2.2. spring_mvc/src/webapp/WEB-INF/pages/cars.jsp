<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
</head>
<body>
<center>
    <h1>Car List</h1>

</center>
<div align="center">
    <table border="1" cellpadding="5">
        <c:forEach var="msq" items="${messages}">
        <h1>${msq}</h1>
    </c:forEach>
        <tr>
            <th>Model</th>
            <th>Color</th>
        </tr>
        <c:forEach var="car" items="${carList}">
            <tr>
                <td><c:out value="${car.model}" /></td>
                <td><c:out value="${car.color}" /></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>