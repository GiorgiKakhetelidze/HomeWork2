import java.util.*

class FilteredCoffeeMachine(private val scanner: Scanner) : CoffeeMachine(scanner) {

    override fun request(): Coffee {
        println("Requesting filtered coffee...")

        return FilteredCoffee(Sugar(requestSugarQuantity()), requestStrength())
    }

    private fun requestStrength(): CoffeeStrength {
        var input = 0
        while (input < 1 || input > 5) {
            println("Please enter int value from 1 to 5")
            input = valInput()
        }

        return CoffeeStrength.values()[input - 1]
    }
}
