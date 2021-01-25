import java.util.*

abstract class CoffeeMachine(private val scanner: Scanner) {

    protected fun requestSugarQuantity(): Int {
        println("How much sugar do you want?")

        return valInput()
    }

    //Validate negative number and string
    protected fun valInput(): Int {
        var input = 0

        while (!scanner.hasNextInt() || input <= 0) {
            if (scanner.hasNextInt()) {
                input = scanner.next().toInt()
                if (input >= 0)
                    break
            } else {
                scanner.hasNextInt()
                scanner.next()
            }

            println("That's not a positive number, try again.")
        }

        return input
    }

    abstract fun request(): Coffee
}