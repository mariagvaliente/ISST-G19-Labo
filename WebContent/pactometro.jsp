<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<div class="form-row">
			<div class="form-group col-md-4">
				<h2>Elija los partidos a pactar:</h2>
				<form name='ConsultaEncuestaServlet' method="post">
					<table>

						<c:forEach items="${lista_pactometro}" var="entry">
							<tr>
								<td><input type="checkbox" name="chkBox"
									value="${entry.partido}"></td>
								<td>${entry.partido}</td>
								</div>
							</tr>
						</c:forEach>
					</table>
					<button type='submit' name='submit' class='btn-default'>Seleccionar</button>
				</form>
									<a href="index.jsp"><button class="btn btn-primary">Index</button></a>
				

			</div>
		</div>
	</center>
</body>
</html>