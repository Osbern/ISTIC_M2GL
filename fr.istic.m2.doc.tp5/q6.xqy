<result>
	{let $b := /epicerie/listeFournisseur/fournisseur[Nom='Barnibus']/F
	let $p := //epicerie/listeFourniture/fourniture[F=$b]/P
	for $e in //epicerie/listeProduit/produit[Couleur='vert' and P=$p]/Nom_p/text()
		return <produit>{$e}</produit>
	}
</result>