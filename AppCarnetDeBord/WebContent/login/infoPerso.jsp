<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Page modification donnée</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="../css/style.css">
	</head>
	
	<body>

		<%@ include file="/element/admin/admin.jsp" %>

			<div class="row">
				
				<div class="col-sm-2" id="choix">
				
					<div class="modif-deco">
					<a href="../administrateur.jsp">Retour au tableau de bord</a>
					<a href="../index.jsp">Déconnexion</a>
					</div>
					
				</div>
				<div class="col-sm-10" >
				<form method="POST" action="#">
				
					<label for="old-pass">Ancien mot de passe</label>
					<input name="old-pass" type="text" placeholder="old-password" id="old-pass">
					<label for="new-pass">Nouveau mot de passe</label>
					<input name="new-pass" type="text" placeholder="new-password" id="new-pass">
					<label for="second-new-pass">Second saisie du mot de passe</label>
					<input name="second-new-pass" type="text" placeholder="second-new-password" id="second-new-pass">
				
					<label for="nom">Nom :</label>
					<input name="nom" type="text" placeholder="nom" id="nom">
					<label for="prenom">Prenom :</label>
					<input name="prenom" type="text" placeholder="Prenom" id="prenom">
								
					<button class="valider">Valider</button>
					<button class="annuler">Annuler</button>
					</form>

				</div>

				
			</div>
			


		<%@ include file="/element/footer.jsp" %>
		
	</body>

</html>