import java.util.*

class EspressoMachine(private val scanner: Scanner) : CoffeeMachine(scanner) {

    override fun request(): Coffee {
        println("Enter Coffee Type : latte, cappuccino")

        return when (scanner.next()) {
            "latte" -> LatteCoffee(Sugar(requestSugarQuantity()), Milk(requestMilkQuantity()))
            "cappuccino" -> CappuccinoCoffee(
                Sugar(requestSugarQuantity()),
                Milk(requestMilkQuantity()), requestCinnamon()
            )
            else -> {
                println("Unknown Coffee Type");error("error")
            }
        }
    }

    private fun requestMilkQuantity(): Int {
        println("How much MILK do you want?")

        return valInput()
    }

    private fun requestCinnamon(): Boolean {
        println("Do you want cinnamon? true, false")

        while (!scanner.hasNextBoolean()) {
            println("Please enter Boolean value : true,false")
            scanner.next()
        }

        return scanner.nextBoolean()
    }

}