<%@ include file="/element/header.jsp" %>
<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
					
					<!-- Affichage de perso en fonction de la base de donnée -->
					<form method="POST" action="#">
					<select>
						<option class=""></option>
					</select>
					<button class="modifie">Modifier</button>
					<button class="supprimer">Supprimer</button>
					</form>
					<div class="nouveau">
					<form method="POST" action="#">
					<button class="nouveau">Nouvelle utilisateur</button>
					</form>
					</div>					
			

			</section>
			
		</section>
</div>
<%@ include file="/element/footer.jsp" %>