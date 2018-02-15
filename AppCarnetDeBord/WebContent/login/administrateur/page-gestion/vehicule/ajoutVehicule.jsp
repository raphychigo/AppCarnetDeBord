<%@ include file="/element/header.jsp" %>
<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
					
					<!-- Affichage des lieux en fonction de la base de donnée -->
					<form method="POST" action="#">
					<label for="immat">Immatriculation :</label>
					<input name="immat" type="text" placeholder="immatriculation" id="immat">
					<label for="modele">Modèle :</label>
					<input name="modele" type="text" placeholder="modele" id="modele">
					<label for="marque">Marque :</label>
					<input name="marque" type="text" placeholder="marque" id="marque">
					<label for="km">Kilometrage :</label>
					<input name="km" type="text" placeholder="km" id="km">
					<label for="nb-place">Nombre de place :</label>
					<input name="nb-place" type="text" placeholder="nb-place" id="nb-place">
					
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