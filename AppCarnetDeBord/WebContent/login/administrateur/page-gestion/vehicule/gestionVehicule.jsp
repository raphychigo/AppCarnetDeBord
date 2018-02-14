<%@ include file="/element/header.jsp" %>
<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
					
					<!-- Affichage des lieux en fonction de la base de donnée -->
					
					<form method="POST" action="#">
					<select class="choix-vehicule" size="6">
						<option>Renault Megane</option>
						<option>Peugeot 3008</option>
						<option>Renault Megane</option>
						<option>Peugeot 3008</option>
						<option>Renault Megane</option>
						<option>Peugeot 3008</option>
					</select>
					<button class="modifie">Modifier</button>
					<button class="supprimer">Supprimer</button>
					</form>
					<div class="nouveau">
					<form method="POST" action="#">
					<button class="nouveau">Nouveau vehicule</button>
					</form>
					</div>					
			
			</section>
			
		</section>
</div>
<%@ include file="/element/footer.jsp" %>