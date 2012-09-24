(: Fonction produitParCouleur :)
declare namespace local="http://istic/xml/xquery";
declare function local:produitParCouleur ($p1 as xs:string) {
	doc("produit.xml")/listeProduit/produit[Couleur=$p1]
};	

<result>
	{local:produitParCouleur('vert')/Nom_p}
</result>

