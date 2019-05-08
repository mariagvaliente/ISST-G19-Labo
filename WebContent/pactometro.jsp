<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
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
<title>Insert title here</title>
</head>
<body style="background-image:url(https://www.gmconsulting.pro/wp-content/uploads/2014/10/Pacto-de-no-concurrencia.jpg); background-repeat: no-repeat; background-size: cover;  background-color: rgba(0,0,0,0.5);
    background-blend-mode: soft-light;">

		<div class="form-row" style="align:center; margin-left: 40%;">
			<div class="form-group col-md-4" style="font-size: 200%; color:#FFFFFF">
				<h2>Elija los partidos a pactar:</h2>
				<form name='ConsultaEncuestaServlet' method="post">
					<table style="text-align:center; margin-left: 20%;">

						<c:forEach items="${lista_pactometro}" var="entry">
							<tr>
								<td><input type="checkbox" name="chkBox"
									value="${entry.partido}"></td>
								<td>${entry.partido}</td>
								</div>
							</tr>
						</c:forEach>
					</table>
					</br>
					<button type='submit' name='submit' class="btn btn-primary" style="text-align:center; margin-left: 20%; font-size: 100%">Seleccionar</button>
				</form>
				
				</br>
									<a href="index.jsp"><button class="btn btn-primary" style="text-align:center; margin-left: 30%; font-size: 100%">Index</button></a>
				

			</div>
		</div>
</body>
</html>