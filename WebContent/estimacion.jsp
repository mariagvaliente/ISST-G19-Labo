<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="The River template project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="styles/bootstrap-4.1.2/bootstrap.min.css">
<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css"
	href="plugins/OwlCarousel2-2.3.4/owl.carousel.css">
<link rel="stylesheet" type="text/css"
	href="plugins/OwlCarousel2-2.3.4/owl.theme.default.css">
<link rel="stylesheet" type="text/css"
	href="plugins/OwlCarousel2-2.3.4/animate.css">
<link href="plugins/jquery-datepicker/jquery-ui.css" rel="stylesheet"
	type="text/css">
<link href="plugins/colorbox/colorbox.css" rel="stylesheet"
	type="text/css">
<link rel="stylesheet" type="text/css" href="styles/main_styles.css">
<link rel="stylesheet" type="text/css" href="styles/responsive.css">

<html>
<head>

<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>

<script type="text/javascript">
        google.charts.load('current', {'packages':['corechart']});
        google.charts.setOnLoadCallback(drawChart);

        function drawChart() {
        	console.log(${resultado.getPSOE()});

            var data = google.visualization.arrayToDataTable([
                ['% Votos', '% Votos'],
    			[ 'PP', ${resultado.getPP()}],
    			[ 'PSOE', ${resultado.getPSOE()}],
    			[ 'UP', ${resultado.getUP()}],
    			[ 'CS', ${resultado.getCs()}],
    			[ 'ERC', ${resultado.getERC()}],
    			[ 'PDC', ${resultado.getPDC()}],
    			[ 'PNV', ${resultado.getPNV()}],
    			[ 'PAC', ${resultado.getPAC()}],
    			[ 'BIL', ${resultado.getBIL()}],
    			[ 'CC', ${resultado.getCC()}],
    			[ 'VOX', ${resultado.getVOX()}],
    			[ 'COM', ${resultado.getCOM()}]
    			
	
    		]);
            var options = {
                title: 'Resultado de las encuestas',
                    is3D : true, //render Google Pie Chart as 3D
                    pieSliceText: 'label', //on mouse hover show label or name of the Country
                    tooltip :  {showColorCode: true}, // whether to display color code for a Country on mouse hover
                    'width' : 700, //width of the Google Pie Chart
                    'height' : 500, //height of the Google Pie Chart
                    colors: ['#3F67FE', '#FD0F22', '#8E30A5', '#FF9700', '#FED60C', '#FFB310', 
                    	'#0DB03F', '#000000', '#0b9433', '#FFFF00', '#0FC544', '#FE642E']
            };
            var chart = new google.visualization.PieChart(document.getElementById('piechart'));
            chart.draw(data, options);
        }
    </script>
</head>
<body>

	<div class="form-row">
		<div class="form-group col-md-4">
			<h2>Elige encuesta:</h2>
			
			
			<form name='ConsultaEncuestaServlet' method="post">
			<select requiered class= "customInput" name="ConsultaEncuesta" value="${entry.id}" id="inputState" class="form-control">
				<c:forEach items="${lista_encuestas}" var="entry">
					<option value="${entry.id}" >${entry.house} - ${entry.date}</option>
				</c:forEach>
			</select>
			
			<input type='submit' name='submit'/>
			</form>
			
		</div>
	</div>
	
	<div style="text-align: center;">
		<div class="tabla" style="text-align: center; margin-left: 10%">
			<table class="table">
				<tr>
					<div id="piechart" style="width: 40%; height: 500px; float: left"></div>
				</tr>

			</table>
		</div>
	</div>

</body>
</html>

