<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Page de Connexion</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/style.css">
</head>
	
<body>
	<%@ include file="/element/connexion.jsp" %>
		<div class="row">
			<div class="col-sm-2 choix">
			
				<div class="section">
					<a href="../index.jsp">Accueil</a>
				</div>
				
			</div>
			
			<div class="col-sm-10 ecran-modification">
				
				<form method="POST" action="#">
				
				<div class="row">
					 <label class="col-lg-10 id" for="id" >Identifiant</label>
 					<input class="col-lg-10" name="id" type="text" placeholder="identifiant" id="id">

				<label class="col-lg-10 mdp" for="mdp">Mot de passe :</label>
 					<input class="col-lg-10" name="password" type="password" placeholder="password" id="mdp">
 				
 				<div class="col-lg-12">
 					<button class="bttvalidation">Connecter</button>
					<button class="bttannulation">Annuler</button>	
 				</div>
					
					
				</div>
	
				</form>	
			</div>
		</div>
	<%@ include file="/element/footer.jsp" %>	
</body>

</html>