<%@ include file="/element/header.jsp" %>
<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
					
					<!-- Affichage des lieux en fonction de la base de donnée -->
					<form method="POST" action="#">
					<label for="motif">Motif</label>
					<input name="motif" type="text" placeholder="motif" id="motif">
					
					
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