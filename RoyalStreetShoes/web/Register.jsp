<%-- 
    Document   : Register
    Created on : Nov 15, 2018, 4:36:42 PM
    Author     : Tan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Footwear - Free Bootstrap 4 Template by Colorlib</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Facebook and Twitter integration -->
        <meta property="og:title" content=""/>
        <meta property="og:image" content=""/>
        <meta property="og:url" content=""/>
        <meta property="og:site_name" content=""/>
        <meta property="og:description" content=""/>
        <meta name="twitter:title" content="" />
        <meta name="twitter:image" content="" />
        <meta name="twitter:url" content="" />
        <meta name="twitter:card" content="" />

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

            <div class="breadcrumbs">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <p class="bread"><span><a href="index.html">Home</a></span> / <span>Register</span></p>
                        </div>
                    </div>
                </div>
            </div>


            <div id="colorlib-contact">
                <div class="container">

                    <div class="row">
                        <div class="offset-3 col-md-6">
                            <div class="contact-wrap">
                                <h3>Register</h3>
                                <form action="Register" class="contact-form">
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <div class="form-group">
                                                <label>Username</label>
                                                <input type="text" name="username" class="form-control" placeholder="Your username">
                                            </div>
                                        </div>
                                        <div class="w-100"></div>

                                        <div class="col-sm-12">
                                            <div class="form-group">
                                                <label>Password</label>
                                                <input type="text" name="password" class="form-control" placeholder="Your password">
                                            </div>
                                        </div>
                                        <div class="w-100"></div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>First Name</label>
                                                <input type="text" id="fname" name="fname" class="form-control" placeholder="Your firstname">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="lname">Last Name</label>
                                                <input type="text" id="lname" name="lname" class="form-control" placeholder="Your lastname">
                                            </div>
                                        </div>
                                        <div class="w-100"></div>
                                        <div class="col-sm-12">
                                            <div class="form-group">
                                                <label for="message">Address</label>
                                                <input type="text" name="address" class="form-control" placeholder="Your address">
                                            </div>
                                        </div>
                                        <div class="w-100"></div>
                                        <div class="col-sm-12">
                                            <div class="form-group">
                                                <label for="email">Email</label>
                                                <input type="text" id="email" name="email" class="form-control" placeholder="Your email">
                                            </div>
                                        </div>
                                        <div class="w-100"></div>
                                        <div class="col-sm-12">
                                            <div class="form-group">
                                                <label>Phone</label>
                                                <input type="text" name="phone" class="form-control" placeholder="Your phone number">
                                            </div>
                                        </div>
                                        <div class="w-100"></div>
                                        <div class="col-sm-12">
                                            <div class="form-group">
                                                <label>Credit card No</label>
                                                <input type="text" name="creditcard" class="form-control" placeholder="Your credit card no">
                                            </div>
                                        </div>
                                        <div class="w-100"></div>
                                        <span>${mes}</span>
                                        <div class="offset-5">
                                            <div class="form-group">
                                                <input type="submit" value="Confirm" class="btn btn-primary">
                                            </div>
                                        </div>
                                    </div>
                                </form>		
                            </div>
                        </div>
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
        <!-- Google Map -->
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false"></script>
        <script src="js/google_map.js"></script>
        <!-- Main -->
        <script src="js/main.js"></script>

    </body>
</html>
