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

		<%@ include file="/element/admin/admin.jsp" %>

			<div class="row">
				
				<div class="col-sm-2" id="choix">
					<a href="page-gestion/vehicule/gestionVehicule.jsp">Gestion des véhicules</a>
					<a href="page-gestion/perso/gestionPerso.jsp">Gestion des utilisateurs</a>
					<a href="page-gestion/lieux/gestionLieux.jsp">Gestion des lieux</a>
					<a href="page-gestion/nature/gestionNature.jsp">Gestion des nature de déplacement</a>
					<div class="modif-deco">
					<a href="../infoPerso.jsp">Modification des données personnelle</a>
					<a href="../../index.jsp">Déconnexion</a>
					</div>
					
				</div>
				<div class="col-sm-10" >
				<form method="POST" action="#">
				<button class="vue1">Vue sur 12 mois</button>
				<button class="vue2">Vue par consommation/utilisateur</button>
				<button class="vue3">Vue par nature de déplacement</button>
				<button class="vue4">Vue par utilisation d'un véhicule</button>
				</form>

				</div>

				
			</div>
			


		<%@ include file="/element/footer.jsp" %>
		
	</body>

</html>