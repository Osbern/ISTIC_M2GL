<result>
	{ let $p2 := //epicerie/listeFourniture/fourniture[P='p2']/F
	let $p4 := //epicerie/listeFourniture/fourniture[P='p4' and F=$p2]/F
	return $p4 }
</result>