import module namespace local="http://istic/xml/xquery" at "fournisseurParProduit.xqy";

<result>
	{
	for $o in distinct-values(//epicerie/listeProduit/produit/Origine)
		let $p := //epicerie/listeProduit/produit[Origine=$o]
		return <origine ville="{$o}">
			{
			for $e in $p
				return <produit>
					<nom>{$e/Nom_p/text()}</nom>
					{
						for $n in local:fournisseurParProduit($e/P)/Nom/text()
							return <fournisseur>{$n}</fournisseur>
					}
				</produit>
			}
		</origine>
	}
</result>