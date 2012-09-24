(: Fonction fournisseurParProduit :)
module namespace local="http://istic/xml/xquery";
declare function local:fournisseurParProduit ($p1 as xs:string) {
	let $f := doc("maFourniture.xml")/listeFourniture/fourniture[P=$p1]/F
	return doc("fournisseur.xml")/listeFournisseur/fournisseur[F=$f]
};