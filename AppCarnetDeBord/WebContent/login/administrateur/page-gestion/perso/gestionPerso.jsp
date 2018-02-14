<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Page gestion du personnel</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="css/style.css">
	</head>
	
	<body>

		<%@ include file="/element/admin/gestion/Perso.jsp" %>

			<div class="row">
				
				<div class="col-sm-2" id="choix">
				
					<a href="../../administrateur.jsp">Retour au tableau de bord</a>
					<a href="/index.jsp">Deconnexion</a>
				</div>
				
				<div class="col-sm-10" >
					
					<!-- Affichage de perso en fonction de la base de donn�e -->
					<form method="POST" action="#">
					<select>
						<option class=""></option>
					</select>
					<button class="modifie">Modifier</button>
					<button class="supprimer">Supprimer</button>
					</form>
					<div class="nouveau">
					<form method="POST" action="#">
					<button class="nouveau">Nouvelle utilisateur</button>
					</form>
					</div>					
			

				</div>
			
			</div>

		<%@ include file="/element/footer.jsp" %>
		
	</body>

</html>