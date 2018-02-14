<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Page gestion des vehicules</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css">
	</head>
	
	<body>

		<%@ include file="/element/admin/gestion/Vehic.jsp" %>

			<div class="row">
				
				<div class="col-sm-2" id="choix">
				
					<a href="../../administrateur.jsp">Retour au tableau de bord</a>
					<a href="/index.jsp">Deconnexion</a>
				</div>
				
				<div class="col-sm-10" >
					
					<!-- Affichage des lieux en fonction de la base de donnée -->
					<form method="POST" action="#">
					<label for="immat">Immatriculation :</label>
					<input name="immat" type="text" placeholder="immatriculation" id="immat">
					<label for="modele">Modèle :</label>
					<input name="modele" type="text" placeholder="modele" id="modele">
					<label for="marque">Marque :</label>
					<input name="marque" type="text" placeholder="marque" id="marque">
					<label for="km">Kilometrage :</label>
					<input name="km" type="text" placeholder="km" id="km">
					<label for="nb-place">Nombre de place :</label>
					<input name="nb-place" type="text" placeholder="nb-place" id="nb-place">
					
					<button class="valider">Valider</button>
					<button class="annuler">Annuler</button>
					
					</form>
					</div>					
			

				</div>
			
			</div>

		<%@ include file="/element/footer.jsp" %>
		
	</body>

</html>