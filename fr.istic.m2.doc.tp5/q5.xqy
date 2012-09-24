<result>
	{
	for $e in distinct-values(//epicerie/listeFourniture/fourniture[P=//epicerie/listeProduit/produit[Couleur='vert']/P]/F)
		return <F>{$e}</F>
	}
</result>