<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Restaurants</title>
</head>
<body>
<section>
    <h3><a href="index.html">Home</a></h3>
    <hr/>
    <h2>Restaurants</h2>
    <form method="get" action="meals">
        <a href="meals?action=create">Add Meal</a>
        <table border="1" cellpadding="8" cellspacing="0">
            <thead>
            <tr>
                <th>Name</th>
                <th>Description</th>
                <th>Menu</th>
                <th>Select</th>
                <th></th>
                <th></th>
            </tr>
            </thead>
            <c:forEach items="${restaurants}" var="restaurant">
                <jsp:useBean id="restaurant" type="org.babareko.graduation.to.RestaurantTO"/>
                <tr data-mealExcess="${RestaurantTO}">
                    <td>${restaurant.name}</td>
                    <td>${restaurant.discription}</td>
                    <td>${restaurant.menu}</td>
                    <td><a href="restaurants?action=update&id=${restaurant.id}">Update</a></td>
                    <td><a href="restaurants?action=delete&id=${restaurant.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </form>
    >
</section>
</body>
</html>