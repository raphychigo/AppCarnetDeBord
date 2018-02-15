<%@ include file="/element/header.jsp" %>
<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
		
				
				<!--  si l'utilisteur à un vehicule en cours d'usage -->
			<div class="tableau-actif">
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
			
			
			</div>	
			
				<!-- sinon l'utilisateur crée un usage -->
			<div class="nouvelle-enregistrement">				
				<form method="POST" action="#">
				
				<label class="debut" for="debut">Date début :</label>
					<input name="debut" type="text" placeholder="date debut d'usage">
				<label class="km/debut" for="km/debut">Kilometrage debut :</label>
					<input name="km/debut" type="text" placeholder="km/debut">
				<label class="commentaire" for="commentaire">Commentaire</label>
					<input name="commentaire" type="text" placeholder="commentaire">
				<div class="liste-select">
					<SELECT class="ville" name="lieualler" size="4">
					<OPTION>Nantes
					<OPTION>Rennes
				</SELECT>
				<SELECT class="vehicule"name="voiture" size="4">
					<OPTION>Megane
					<OPTION>3008
				</SELECT>
				<SELECT class="motif" name="motif" size="4">
					<OPTION>Reunion
					<OPTION>Formation
				</SELECT>
				
				<div class="control">
				<button class="valider">Valider</button>
				<button class="annuler">Annuler</button>
				
				</div>
			
				</div>
						
			</form>
			</div>	
		
			</section>		
		</section>
</div>
<%@ include file="/element/footer.jsp" %>