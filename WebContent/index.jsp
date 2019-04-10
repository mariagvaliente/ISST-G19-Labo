<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <title>Laboratorio Electoral</title>
    <meta name="description" content="">
    <!--
    Travel Template
    http://www.templatemo.com/tm-409-travel
    -->
    <meta name="viewport" content="width=device-width">
    <meta name="author" content="templatemo">
    
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,800,700,600,300' rel='stylesheet' type='text/css'>


    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/font-awesome.css">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/templatemo_misc.css">
    <link rel="stylesheet" href="css/templatemo_style.css">


    <script src="js/vendor/modernizr-2.6.1-respond-1.1.0.min.js"></script>
</head>
<body>
<!--[if lt IE 7]>
<p class="chromeframe">You are using an outdated browser. <a href="http://browsehappy.com/">Upgrade your browser today</a> or <a href="http://www.google.com/chromeframe/?redirect=true">install Google Chrome Frame</a> to better experience this site.</p>
<![endif]-->

<div class="flexslider">
    <ul class="slides">
        <li>
            <div class="overlay"></div>
            <img src="images/psoe.jpg" alt="Special 1">
            <div class="container">
                <div class="row"  style="float: left">
                    <div class="col-md-5 col-lg-4">
                        <div class="flex-caption visible-lg">
                            <span class="price">¿Consulta?</span>
                            <h3 class="title">Resultados históricos</h3>
                            <p>Si desea ver los resultados electorales, clicke en el botón!</p>
                            <a href="historia.jsp" class="slider-btn">CONSULTA</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row" style="float: right">
                    <div class="col-md-5 col-lg-4">
                        <div class="flex-caption2">
                            <span class="price">¿LABORATORIO?</span>
                            <h3 class="title">Realizar experimento</h3>
                            <p>Si desea hacer un experimento, clicke en el botón.</p>
                            <a href="seleccionley.jsp" class="slider-btn">LABORATORIO</a>
                        </div>
                    </div>
                </div>
            </div>
        </li>
        <li>
            <div class="overlay"></div>
            <img src="images/pp.jpeg" alt="Special 1">
            <div class="container">
                <div class="row"  style="float: left">
                    <div class="col-md-5 col-lg-4">
                        <div class="flex-caption visible-lg">
                            <span class="price">¿Consulta?</span>
                            <h3 class="title">Resultados históricos</h3>
                            <p>Si desea ver los resultados electorales, clicke en el botón!</p>
                            <a href="historia.jsp" class="slider-btn">CONSULTA</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row" style="float: right">
                    <div class="col-md-5 col-lg-4">
                        <div class="flex-caption2">
                            <span class="price">¿LABORATORIO?</span>
                            <h3 class="title">Realizar experimento</h3>
                            <p>Si desea hacer un experimento, clicke en el botón.</p>
                            <a href="seleccionley.jsp" class="slider-btn">LABORATORIO</a>
                        </div>
                    </div>
                </div>
            </div>
        </li>
        <li>
            <div class="overlay"></div>
            <img src="images/podemos.jpg" alt="Special 1">
            <div class="container">
                <div class="row"  style="float: left">
                    <div class="col-md-5 col-lg-4">
                        <div class="flex-caption visible-lg">
                            <span class="price">¿Consulta?</span>
                            <h3 class="title">Resultados históricos</h3>
                            <p>Si desea ver los resultados electorales, clicke en el botón!</p>
                            <a href="historia.jsp" class="slider-btn">CONSULTA</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row" style="float: right">
                    <div class="col-md-5 col-lg-4">
                        <div class="flex-caption2">
                            <span class="price">¿LABORATORIO?</span>
                            <h3 class="title">Realizar experimento</h3>
                            <p>Si desea hacer un experimento, clicke en el botón.</p>
                            <a href="seleccionley.jsp" class="slider-btn">LABORATORIO</a>
                        </div>
                    </div>
                </div>
            </div>
        </li>
        <li>
            <div class="overlay"></div>
            <img src="images/vox.png" alt="Special 1">
            <div class="container">
                <div class="row"  style="float: left">
                    <div class="col-md-5 col-lg-4">
                        <div class="flex-caption visible-lg">
                            <span class="price">¿Consulta?</span>
                            <h3 class="title">Resultados históricos</h3>
                            <p>Si desea ver los resultados electorales, clicke en el botón!</p>
                            <a href="historia.jsp" class="slider-btn">CONSULTA</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row" style="float: right">
                    <div class="col-md-5 col-lg-4">
                        <div class="flex-caption2">
                            <span class="price">¿LABORATORIO?</span>
                            <h3 class="title">Realizar experimento</h3>
                            <p>Si desea hacer un experimento, clicke en el botón.</p>
                            <a href="seleccionley.jsp" class="slider-btn">LABORATORIO</a>
                        </div>
                    </div>
                </div>
            </div>
        </li>
    </ul>
</div> <!-- /.flexslider -->




<script src="./js/vendor/jquery-1.11.0.min.js"></script>
<script>window.jQuery || document.write('<script src="./js/vendor/jquery-1.11.0.min.js"><\/script>')</script>
<script src="./js/bootstrap.js"></script>
<script src="./js/plugins.js"></script>
<script src="./js/main.js"></script>
<!-- templatemo 409 travel -->
</body>
</html>

