object tute_08 extends App{	

	val toUpper = (str:String) => str.toUpperCase()
	val toLower = (str:String) => str.toLowerCase()

	def formatNames(name:String, fun: String => String):String = fun(name)


	println(formatNames("Benny", toUpper))
	println(formatNames("Ni", toUpper) + formatNames("roshan", toLower))
	println(formatNames("Saman", toLower))
	println(formatNames("K", toUpper) + formatNames("umar", toLower) + formatNames("a", toUpper))
}

