<%@ include file="/element/header.jsp" %>
	<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
				<section class="col-xs-9">
				
				<div class="connexion">
				
				<form method="POST" action="#">		
				
				<label class="id" for="id" >Identifiant :</label>
 					<input name="id" type="text" placeholder="identifiant">

				<label class="mdp" for="mdp">Mot de passe :</label>
 					<input  name="password" type="password" placeholder="password">
 				
 				<div class="">
 					<button class="bttvalidation">Connecter</button>
					<button class="bttannulation">Annuler</button>	
 				</div>
					
				</form>	
				
				</div>

			</section>	
	</section>
</div>
<%@ include file="/element/footer.jsp" %>