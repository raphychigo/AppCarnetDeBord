<%@ include file="/element/header.jsp" %>
<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
					
					<!-- Affichage des lieux en fonction de la base de donn�e -->
					<form method="POST" action="#">
					<label for="motif">Motif</label>
					<input name="motif" type="text" placeholder="motif" id="motif">
					
					<button class="valider">Valider</button>
					<button class="annuler">Annuler</button>
					</form>
										
			
			</section>
			
		</section>
</div>
<%@ include file="/element/footer.jsp" %>