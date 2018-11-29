<%-- 
    Document   : Nike
    Created on : Nov 18, 2018, 9:51:23 PM
    Author     : PONGTAWAN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="images/logo.png"/>
        <title>Royal Street Shoes</title>
       
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Rokkitt:100,300,400,700" rel="stylesheet">

        <!-- Animate.css -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- Icomoon Icon Fonts-->
        <link rel="stylesheet" href="css/icomoon.css">
        <!-- Ion Icon Fonts-->
        <link rel="stylesheet" href="css/ionicons.min.css">
        <!-- Bootstrap  -->
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <!-- Magnific Popup -->
        <link rel="stylesheet" href="css/magnific-popup.css">

        <!-- Flexslider  -->
        <link rel="stylesheet" href="css/flexslider.css">

        <!-- Owl Carousel -->
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">

        <!-- Date Picker -->
        <link rel="stylesheet" href="css/bootstrap-datepicker.css">
        <!-- Flaticons  -->
        <link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">

        <!-- Theme style  -->
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="colorlib-loader"></div>

        <div id="page">
            <jsp:include page="include/Header.jsp"/>

            <div class="colorlib-product">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 offset-sm-2 text-center colorlib-heading">
                            <h2>Nike</h2>
                        </div>
                    </div>
                    <div class="row row-pb-md">
                        <c:forEach items="${pd}" var="p">
                            <div class="col-md-3 col-lg-3 mb-4 text-center">
                                <div class="product-entry border">
                                    <a href="#" class="prod-img">
                                        <img src="images/${p.productid}.jpg" class="img-fluid">
                                    </a>
                                    <div class="desc">
                                        <h2><a href="#">${p.productname}</a></h2>
                                        <span class="price">${p.productprice} THB</span>
                                    </div>
                                    <div class="form-group">
                                        <a class="btn btn-outline-dark" href="Addtocart?productid=${p.productid}&&url=Nike">Add to cart</a>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>

            <jsp:include page="include/Footer.jsp"/>
        </div>

        <div class="gototop js-top">
            <a href="#" class="js-gotop"><i class="ion-ios-arrow-up"></i></a>
        </div>

        <!-- jQuery -->
        <script src="js/jquery.min.js"></script>
        <!-- popper -->
        <script src="js/popper.min.js"></script>
        <!-- bootstrap 4.1 -->
        <script src="js/bootstrap.min.js"></script>
        <!-- jQuery easing -->
        <script src="js/jquery.easing.1.3.js"></script>
        <!-- Waypoints -->
        <script src="js/jquery.waypoints.min.js"></script>
        <!-- Flexslider -->
        <script src="js/jquery.flexslider-min.js"></script>
        <!-- Owl carousel -->
        <script src="js/owl.carousel.min.js"></script>
        <!-- Magnific Popup -->
        <script src="js/jquery.magnific-popup.min.js"></script>
        <script src="js/magnific-popup-options.js"></script>
        <!-- Date Picker -->
        <script src="js/bootstrap-datepicker.js"></script>
        <!-- Stellar Parallax -->
        <script src="js/jquery.stellar.min.js"></script>
        <!-- Main -->
        <script src="js/main.js"></script>
    </body>
</html>
