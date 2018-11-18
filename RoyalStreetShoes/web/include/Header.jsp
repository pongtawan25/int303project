<%-- 
    Document   : Header
    Created on : Nov 17, 2018, 9:43:11 PM
    Author     : PONGTAWAN
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="colorlib-nav" role="navigation">
    <div class="top-menu">
        <div class="container">
            <div class="row">
                <div class="col-sm-7 col-md-9">
                    <div id="colorlib-logo"><a href="Index"><img src="images/logo.png" width="100"> Royal Street Shoes</a></div>
                </div>
                <div class="col-sm-5 col-md-3">
                    <form action="#" class="search-wrap">
                        <div class="form-group">
                            <input type="search" class="form-control search" placeholder="Search">
                            <button class="btn btn-primary submit-search text-center" type="submit"><i class="icon-search"></i></button>
                        </div>
                    </form>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12 text-left menu-1">
                    <ul>
                        <li class="active"><a href="Index">Home</a></li>
                        <li><a href="All">All</a></li>
                        <li><a href="Adidas">Adidas</a></li>
                        <li><a href="Nike">Nike</a></li>
                        <li><a href="Converse">Converse</a></li>
                        <li><a href="Vans">Vans</a></li>
                        <li><a href="Help">Help</a></li>
                        <li><a href="Contact">Contact</a></li>
                        <li class="cart"><a href="Cart.jsp"><i class="icon-shopping-cart"></i> Cart[${cart.totalQuantity}]</a></li>
                            <c:choose>
                                <c:when test="${sessionScope.cus!=null}">
                                <li class="cart"><img src="images/iconuser.png" width="30"> ${sessionScope.cus.customerfname}
                                    <a href="Logout">Logout</a></li>
                                </c:when>
                                <c:otherwise>
                                <li class="cart"><a href="Login1">Login</a></li>
                                </c:otherwise>
                            </c:choose>
                </div>
            </div>
        </div>
    </div>
    <div class="sale">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 offset-sm-2 text-center">
                    <div class="row">
                        <div class="owl-carousel2">
                            <div class="item">
                                <div class="col">
                                    <h3><a href="#">25% off (Almost) Everything! Use Code: Summer Sale</a></h3>
                                </div>
                            </div>
                            <div class="item">
                                <div class="col">
                                    <h3><a href="#">Our biggest sale yet 50% off all summer shoes</a></h3>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</nav>
