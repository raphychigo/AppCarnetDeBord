<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Page gestion des lieux</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css">
	</head>
	
	<body>

		<%@ include file="/element/admin/gestion/Lieux.jsp" %>

			<div class="row">
				
				<div class="col-sm-2" id="choix">
				
					<a href="../../administrateur.jsp">Retour au tableau de bord</a>
					<a href="/index.jsp">Deconnexion</a>
				</div>
				
				<div class="col-sm-10" >
					
					<form method="POST" action="login/administrateur/page-gestion/lieux/ajout-modif-lieu.jsp">
					<label for="lieu">Lieu</label>
					<input name="lieu" type="text" placeholder="lieu" id="lieu">

					<button class="valider">Valider</button>
					<button class="annuler">Annuler</button>
					</form>
					</div>					
			

				</div>
			
			</div>

		<%@ include file="/element/footer.jsp" %>
		
	</body>

</html>