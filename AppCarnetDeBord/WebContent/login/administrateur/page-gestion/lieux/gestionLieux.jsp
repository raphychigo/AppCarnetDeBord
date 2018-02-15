<%@ include file="/element/header.jsp" %>
<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
					
					<!-- Affichage des lieux en fonction de la base de donnée -->
					<form method="POST" action="/ajout-modif-lieu.jsp">
					<select class="type" size="4">
						<option class="">fzergzq</option>
						<option class="">fzergzq</option>
						<option class="">fzergzq</option>
					</select>
					<div class="control">
					<button class="modifie">Modifier</button>
					<button class="supprimer">Supprimer</button>
					</div>
					
					</form>
					
					<form method="POST" action="/ajout-modif-lieu.jsp">
					<div class="control">
					<button class="nouveau">Nouveau lieu</button>
					</div>
					
					</form>
									
			

			</section>
			
		</section>
</div>
<%@ include file="/element/footer.jsp" %>