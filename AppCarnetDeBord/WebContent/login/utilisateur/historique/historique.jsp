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
					<a href="../utilisateur.jsp">Retour au tableau de bord</a>
				
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
     					 <th>Modele</th>
      					 <th>Marque</th>
     					 <th>Nb Kilometre</th>
  					 </tr>
   					<tr>
      					<td>Renauld</td>
    			  	 	<td>Megane</td>
    			   		<td>150000</td>
    			   		<td>Renauld</td>
    			  	 	<td>Megane</td>
    			   		<td>150000</td>
  					 </tr>
  				 </table>
  				 <button class="cloturer">Cloturer</button>
			</form>
					
				</div>

			</div>
			
		<%@ include file="/element/footer.jsp" %>
		
	</body>

</html>