<%@ include file="/element/header.jsp" %>
<div class="container">
	<section class="row">
		<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
				
				<form method="POST" action="#">		
				
				<label class="" for="id" >Identifiant :</label>
 					<input class="" name="id" type="text" placeholder="identifiant" id="id">

				<label class="" for="mdp">Mot de passe :</label>
 					<input class="" name="password" type="password" placeholder="password" id="mdp">
 				
 				<div class="">
 					<button class="bttvalidation">Connecter</button>
					<button class="bttannulation">Annuler</button>	
 				</div>
					
				</form>	
				
			</section>	
	</section>
</div>
<%@ include file="/element/footer.jsp" %>