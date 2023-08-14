object tute_08 extends App{	

	def intrest(deposit:Double):Double = {
		val calc: Double => Double = deposit match {
		case x if x <= 20000 => (y:Double) =>  y * 0.02
		case x if x <= 200000 => (y:Double) => y * 0.04
		case x if x <= 2000000 => (y:Double) => y * 0.035
		case _ => (y:Double) => y * 0.065
		}

		calc(deposit)
	}

	println("Intrest of 10000 = " + intrest(10000))
	println("Intrest of 100000 = " + intrest(100000))
	println("Intrest of 1000000 = " + intrest(1000000))
	println("Intrest of 10000000 = " + intrest(10000000))
}

