<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Page utilisateur</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css">
	</head>
	
	<body>

		<%@ include file="/element/utili/utilisateur.jsp" %>

			<div class="row">
				
				<div class="col-sm-2" id="choix">
					<a href="../utilisateur.jsp">Retour au tableau de bord</a>
				
					<div class="modif-deco">
					<a href="../infoPerso.jsp">Modification des données personnelle</a>
					<a href="../../index.jsp">Déconnexion</a>
					</div>
					
				</div>
				
				<div class="col-sm-10" >
				
				<!--  si l'utilisteur à un vehicule en cours d'usage -->
				
			<form method="POST" action="#">
				<label for="fin">Date fin :</label>
					<input name="fin" type="text" placeholder="date fin d'usage" id="fin">
			
				<label for="km/fin">Kilometrage fin :</label>
					<input name="km/fin" type="text" placeholder="km/fin" id="km/fin">
				
				<label for="nbkm">Nombre de km effectuer</label>
					<input name="nbkm" type="text" placeholder="nombre de kilometre" id="nbkm">
				
				<label for="montantCarb">Montant Carburant</label>
					<input name="montantCarb" type="text" placeholder="montantCarb" id="montantCarb">
					
				<label for="volumeCarb">Volume Carburant</label>
					<input name="volumeCarb" type="text" placeholder="volumeCarb" id="volumeCarb">
					
				<button class="valider">Valider</button>
				<button class="annuler">Annuler</button>

			</form>
					
				</div>

			</div>
			
		<%@ include file="/element/footer.jsp" %>
		
	</body>

</html>