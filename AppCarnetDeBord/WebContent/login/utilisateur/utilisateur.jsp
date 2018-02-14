<%@ include file="/element/header.jsp" %>
<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
		
				
				<!--  si l'utilisteur à un vehicule en cours d'usage -->
				
			<form method="POST" action="#">
					<table>
   						<caption>Votre véhicule :</caption>
   					<tr>
      					 <th>Modele</th>
      					 <th>Marque</th>
     					 <th>Nb Kilometre</th>
  					 </tr>
   					<tr>
      					<td>Renauld</td>
    			  	 	<td>Megane</td>
    			   		<td>150000</td>
  					 </tr>
  				 </table>
  				 <button class="cloturer">Cloturer</button>
			</form>
				<!-- sinon l'utilisateur crée un usage -->
				
			<form method="POST" action="#">
				<label for="debut">Date début :</label>
					<input name="debut" type="text" placeholder="date debut d'usage" id="debut">
				<label for="km/debut">Kilometrage debut :</label>
					<input name="km/debut" type="text" placeholder="km/debut" id="km/debut">
				<label for="commentaire">Commentaire</label>
					<input name="commentaire" type="text" placeholder="commentaire" id="commentaire">
				<SELECT name="lieualler" size="1">
					<OPTION>Nantes
					<OPTION>Rennes
				</SELECT>
				<SELECT name="voiture" size="1">
					<OPTION>Megane
					<OPTION>3008
				</SELECT>
				<SELECT name="motif" size="1">
					<OPTION>Reunion
					<OPTION>Formation
				</SELECT>

				<button class="valider">Valider</button>
				<button class="annuler">Annuler</button>
					
			</form>
				
				
				
			</section>
			
		</section>
</div>
<%@ include file="/element/footer.jsp" %>