<%@ include file="/element/header.jsp" %>
<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
				
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

			</section>
			
		</section>
</div>
<%@ include file="/element/footer.jsp" %>