<%@ include file="/element/header.jsp" %>
<div class="container">
		<section class="row">
			<%@ include file="/element/menu.jsp" %>
			<section class="col-xs-9 ">
				
				<!--  si l'utilisteur � un vehicule en cours d'usage -->
			<div class="tableau-actif">
			<form method="POST" action="#">
					<table>
   						<caption>Votre v�hicule :</caption>
   					<tr>
      					 <th>Modele</th>
      					 <th>Marque</th>
     					 <th>Nb Kilometre</th>
     					 <th>Modele</th>
      					 <th>Marque</th>
     					 <th>Nb Kilometre</th>
  					 </tr>
   					<tr>
      					<td>Renauld</td>
    			  	 	<td>Megane</td>
    			   		<td>150000</td>
    			   		<td>Renauld</td>
    			  	 	<td>Megane</td>
    			   		<td>150000</td>
  					 </tr>
  				 </table>
			</form>
			</div>	
			
					
			</section>
			
		</section>
</div>
<%@ include file="/element/footer.jsp" %>