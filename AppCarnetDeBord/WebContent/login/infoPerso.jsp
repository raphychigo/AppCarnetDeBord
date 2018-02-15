<%@ include file="/element/header.jsp" %>
<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
				
				<form method="POST" action="#">
				
					<label class="old-pass"for="old-pass">Ancien mot de passe</label>
						<input name="old-pass" type="text" placeholder="old-password">
					<label class="new-pass"for="new-pass">Nouveau mot de passe</label>
						<input name="new-pass" type="text" placeholder="new-password">
					<label class="second-new-pass" for="second-new-pass">Second saisie du mot de passe</label>
						<input name="second-new-pass" type="text" placeholder="second-new-password">
				
					<label class="nom"for="nom">Nom :</label>
						<input name="nom" type="text" placeholder="nom">
					<label class="prenom" for="prenom">Prenom :</label>
						<input name="prenom" type="text" placeholder="Prenom">
					
					<div class="control">
					<button class="valider">Valider</button>
					<button class="annuler">Annuler</button>
					</div>			
					
					</form>

			</section>
			
		</section>
</div>
<%@ include file="/element/footer.jsp" %>