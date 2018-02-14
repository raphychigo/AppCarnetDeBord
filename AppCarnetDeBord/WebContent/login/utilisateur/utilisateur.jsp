<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Page utilisateur</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="css/style.css">
	</head>
	
	<body>

		<%@ include file="/element/utili/utilisateur.jsp" %>

			<div class="row">
				
				<div class="col-sm-2" id="choix">
					<a href="historique/historique.jsp">Historique</a>
				
					<div class="modif-deco">
					<a href="../infoPerso.jsp">Modification des données personnelle</a>
					<a href="../../index.jsp">Déconnexion</a>
					</div>
					
				</div>
				
				<div class="col-sm-10" >
				
				<!--  si l'utilisteur à un vehicule en cours d'usage -->
				
			<form method="POST" action="#">
					<table>
   						<caption>Votre véhicule :</caption>
   					<tr>
      					 <th>Modele</th>
      					 <th>Marque</th>
     					 <th>Nb Kilometre</th>
  					 </tr>
   					<tr>
      					<td>Renauld</td>
    			  	 	<td>Megane</td>
    			   		<td>150000</td>
  					 </tr>
  				 </table>
  				 <button class="cloturer">Cloturer</button>
			</form>
				<!-- sinon l'utilisateur crée un usage -->
				
			<form method="POST" action="#">
				<label for="debut">Date début :</label>
					<input name="debut" type="text" placeholder="date debut d'usage" id="debut">
				<label for="km/debut">Kilometrage debut :</label>
					<input name="km/debut" type="text" placeholder="km/debut" id="km/debut">
				<label for="commentaire">Commentaire</label>
					<input name="commentaire" type="text" placeholder="commentaire" id="commentaire">
				<SELECT name="lieualler" size="1">
					<OPTION>Nantes
					<OPTION>Rennes
				</SELECT>
				<SELECT name="voiture" size="1">
					<OPTION>Megane
					<OPTION>3008
				</SELECT>
				<SELECT name="motif" size="1">
					<OPTION>Reunion
					<OPTION>Formation
				</SELECT>

				<button class="valider">Valider</button>
				<button class="annuler">Annuler</button>
					
			</form>
				
				
				
				</div>

			</div>
			
		<%@ include file="/element/footer.jsp" %>
		
	</body>

</html>