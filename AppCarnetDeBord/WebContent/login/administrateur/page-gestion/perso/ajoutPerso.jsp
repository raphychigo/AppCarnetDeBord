<%@ include file="/element/header.jsp" %>
<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
					
					<!-- Affichage des lieux en fonction de la base de donnée -->
					<form method="POST" action="#">
					<label for="nom">Nom :</label>
					<input name="nom" type="text" placeholder="nom" id="nom">
					<label for="prenom">Prenom :</label>
					<input name="prenom" type="text" placeholder="Prenom" id="prenom">
					<div>
					<select class="type" name="type">
						<option>Administrateur</option>
						<option>Utilisateur</option>
					</select>
					</div>
					
					<div class="control">
					<button class="valider">Valider</button>
					<button class="annuler">Annuler</button>
					</div>
					
					</form>
					</div>					
			

			</section>
			
		</section>
</div>
<%@ include file="/element/footer.jsp" %>