import module namespace local="http://istic/xml/xquery" at "fournisseurParProduit.xqy";

<result>
	{
	for $e in distinct-values(//epicerie/listeProduit/produit/P)
		let $p := //epicerie/listeProduit/produit[P=$e]/Nom_p
		return <produit nom="{$p}">
			{local:fournisseurParProduit($e)/Nom}
		</produit>
	}
</result>