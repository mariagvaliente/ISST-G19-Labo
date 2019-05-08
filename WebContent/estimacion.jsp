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
	href="plugins/OwlCarousel2-2.3.4/owl.theme.default.css">
<link rel="stylesheet" type="text/css"
	href="plugins/OwlCarousel2-2.3.4/animate.css">
<link href="plugins/jquery-datepicker/jquery-ui.css" rel="stylesheet"
	type="text/css">
<link href="plugins/colorbox/colorbox.css" rel="stylesheet"
	type="text/css">
<link rel="stylesheet" type="text/css" href="styles/main_styles.css">
<link rel="stylesheet" type="text/css" href="styles/responsive.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<html>
<head>

<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>

<script type="text/javascript">
        google.charts.load('current', {'packages':['corechart']});
        google.charts.setOnLoadCallback(drawChart);

        function drawChart() {
            var data = google.visualization.arrayToDataTable([
                ['% Votos', '% Votos'],
    			[ 'PP', ${resultado.getPP()}],
    			[ 'PSOE', ${resultado.getPSOE()}],
    			[ 'UP', ${resultado.getUP()}],
    			[ 'CS', ${resultado.getCs()}],
				<c:if test="${resultado.getERC() != null}">
    			[ 'ERC', ${resultado.getERC()}],
    			</c:if>
				<c:if test="${resultado.getPDC() != null}">
    			[ 'PDC', ${resultado.getPDC()}],
    			</c:if>
				<c:if test="${resultado.getPNV() != null}">
    			[ 'PNV', ${resultado.getPNV()}],
    			</c:if>
				<c:if test="${resultado.getPAC() != null}">
    			[ 'PAC', ${resultado.getPAC()}],
    			</c:if>
				<c:if test="${resultado.getBIL() != null}">
    			[ 'BIL', ${resultado.getBIL()}],
    			</c:if>
				<c:if test="${resultado.getCC() != null}">
    			[ 'CC', ${resultado.getCC()}],
    			</c:if>
				<c:if test="${resultado.getVOX() != null}">
    			[ 'VOX', ${resultado.getVOX()}],
    			</c:if>
				<c:if test="${resultado.getCOM() != null}">
    			[ 'COM', ${resultado.getCOM()}]
    			</c:if>
    		]);
            var options = {
                title: 'Resultado de las encuestas',
                    is3D : true, //render Google Pie Chart as 3D
                    pieSliceText: 'label', //on mouse hover show label or name of the Country
                    tooltip :  {showColorCode: true}, // whether to display color code for a Country on mouse hover
                    'width' : 700, //width of the Google Pie Chart
                    'height' : 500, //height of the Google Pie Chart
                    colors: ['#3F67FE', '#FD0F22', '#8E30A5', '#FF9700', 
        				<c:if test="${resultado.getERC() != null}">
                    	'#FED60C', 
            			</c:if>
        				<c:if test="${resultado.getPDC() != null}">
                    	'#FFB310',
            			</c:if>
        				<c:if test="${resultado.getPNV() != null}">
                    	'#0DB03F',
            			</c:if>
        				<c:if test="${resultado.getPAC() != null}">
                    	'#000000',
            			</c:if>
        				<c:if test="${resultado.getBIL() != null}">
                    	'#0b9433',
            			</c:if>
        				<c:if test="${resultado.getCC() != null}">
                    	'#FFFF00',
            			</c:if>
        				<c:if test="${resultado.getVOX() != null}">
                    	'#0FC544',
            			</c:if>
        				<c:if test="${resultado.getCOM() != null}">
                    	'#FE642E'
            			</c:if>]
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
				<select requiered class="customInput" name="ConsultaEncuesta"
					value="${entry.id}" class="form-control">
					<c:forEach items="${lista_encuestas}" var="entry">
						<option value="${entry.id}">${entry.house}-${entry.date}</option>
					</c:forEach>
				</select>
				<button type='submit' name='submit' class='btn btn-primary'>Seleccionar
				</button>				
			</form>
							<a href="index.jsp"><button class="btn btn-primary">Index</button></a>
			


		</div>
	</div>

	<div style="text-align: center;">
		<div class="tabla" style="text-align: center; margin-left: 10%">
			<table class="table" style="border: 5px solid transparent;">
				<tr>
					<td>
						<div id="piechart" style="width: 40%; height: 500px; float: left"></div>
					</td>

					<td><c:if test="${resultado.getHouse()!= null}">

							<table style="border: 15px solid transparent;">
								<tr style="border: 15px solid transparent;">
									<td>Encuesta realizada por ${resultado.getHouse()}</td>
								</tr>
								<tr style="border: 15px solid transparent;">
									<td>A fecha de ${resultado.getDate()}</td>
								</tr>
								<tr style="border: 15px solid transparent;">
									<td>Se han encuestado a ${resultado.getSample()} personas</td>
								</tr>
							</table>
						</c:if></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>

