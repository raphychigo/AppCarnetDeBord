<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Page Accueil</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="css/style.css">
	</head>
	
	<body>

		<%@ include file="/element/accueil.jsp" %>

			<div class="row">
				
				<div class="col-sm-2" id="choix">
					<a href="login/login.jsp">Connexion</a>
				</div>
				<div class="col-sm-10" >
					<div class="presentation">
					<img src="">
					<div class="titer">ERP - Gestion de park v�hicule</div>
					<p class="introduction">Cr��e en 1981, 
					ENI Ecole Informatique a acquis une renomm�e nationale dans la formation d'informaticiens. 
					En contact permanent avec les entreprises du secteur num�rique, 
					les entreprises r�gionales et nationales,
					ENI Ecole Informatique propose ainsi � ses �tudiants 
					des formations techniques de qualit� visant certes des dipl�mes
					mais aussi et surtout l'emploi. L'�cole est agr��e par les �diteurs
					(Microsoft, Oracle, Cisco). 
					L'�cole est implant�e � Nantes, Rennes et Niort... </p>
					</div>
				</div>

				
			</div>
			


		<%@ include file="/element/footer.jsp" %>
		
	</body>

</html>