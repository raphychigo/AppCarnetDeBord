<%@ include file="/element/header.jsp" %>
<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
					
					<form method="POST" action="login/administrateur/page-gestion/lieux/ajout-modif-lieu.jsp">
					<label for="lieu">Lieu</label>
					<input name="lieu" type="text" placeholder="lieu" id="lieu">

					<button class="valider">Valider</button>
					<button class="annuler">Annuler</button>
					</form>

								</section>
			
		</section>
</div>
<%@ include file="/element/footer.jsp" %>