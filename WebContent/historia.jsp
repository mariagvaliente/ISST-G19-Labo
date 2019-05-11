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
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/historia.css">

    <link rel="stylesheet" href="css/font-awesome.css">



    <script src="js/vendor/modernizr-2.6.1-respond-1.1.0.min.js"></script>


    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

</head>
<body>
<!--[if lt IE 7]>
<p class="chromeframe">You are using an outdated browser. <a href="http://browsehappy.com/">Upgrade your browser today</a> or <a href="http://www.google.com/chromeframe/?redirect=true">install Google Chrome Frame</a> to better experience this site.</p>
<![endif]-->

<header>
    <h1>Resultados de las elecciones nacionales en España</h1>
    <p>Seleccione el año que desea consultar</p>
</header>
<br>
<br>
<br>
<br>
<br>

<form action="${pageContext.request.contextPath}/AnnoConsultaServlet" method="post">
<div class="tabla">
    <table class="table">
        <tr>
            <td><input type="submit" name="1977" value="1977" /></td>    
            <td><input type="submit" name="1979" value="1979" /></td>         
            <td><input type="submit" name="1982" value="1982" /></td>
        </tr>
        <tr>
            <td><input type="submit" name="1986" value="1986" /></td>    
            <td><input type="submit" name="1989" value="1989" /></td>         
            <td><input type="submit" name="1993" value="1993" /></td>
        </tr>
        <tr>
            <td><input type="submit" name="1996" value="1996" /></td>    
            <td><input type="submit" name="2000" value="2000" /></td>         
            <td><input type="submit" name="2004" value="2004" /></td>
        </tr>
            <td><input type="submit" name="2008" value="2008" /></td>    
            <td><input type="submit" name="2011" value="2011" /></td>         
            <td><input type="submit" name="2015" value="2015" /></td>
        </tr>
        <tr>
            <td><input type="submit" name="2016" value="2016" /></td>
            <td><input type="submit" name="2019" value="2019" /></td>
            <td></td>
        </tr>
    </table>
    </form>
    
    
    
</div>

</body>
</html>