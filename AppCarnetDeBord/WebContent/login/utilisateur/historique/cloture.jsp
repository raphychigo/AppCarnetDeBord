<%@ include file="/element/header.jsp" %>
<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
				
				<!--  si l'utilisteur à un vehicule en cours d'usage -->
				
			<form method="POST" action="#">
				<label for="fin">Date fin :</label>
					<input name="fin" type="text" placeholder="date fin d'usage" id="fin">
			
				<label for="km/fin">Kilometrage fin :</label>
					<input name="km/fin" type="text" placeholder="km/fin" id="km/fin">
				
				<label for="nbkm">Nombre de km effectuer</label>
					<input name="nbkm" type="text" placeholder="nombre de kilometre" id="nbkm">
				
				<label for="montantCarb">Montant Carburant</label>
					<input name="montantCarb" type="text" placeholder="montantCarb" id="montantCarb">
					
				<label for="volumeCarb">Volume Carburant</label>
					<input name="volumeCarb" type="text" placeholder="volumeCarb" id="volumeCarb">
					
				<button class="valider">Valider</button>
				<button class="annuler">Annuler</button>

			</form>
					
			</section>
			
		</section>
</div>
<%@ include file="/element/footer.jsp" %>