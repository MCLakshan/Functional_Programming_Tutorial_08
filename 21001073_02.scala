object tute_08 extends App{	

	def PatternMatching (num:Int): Unit = {
		val p_match = (num:Int) => num match{
			case x if(x <= 0) => println("Negative/Zero")
			case x if(x % 2 == 0) => println("Even number")
			case _ => println("Odd number")

		}
		p_match(num)
	}

	PatternMatching(-5)
	PatternMatching(0)
	PatternMatching(10)
	PatternMatching(101)
}

