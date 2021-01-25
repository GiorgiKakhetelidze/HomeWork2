import java.util.*

fun main() {

/*    val espressoCoffee = EspressoMachine(Scanner(System.`in`))
    val espresso = espressoCoffee.request()
    println(espresso.drink())*/

    val coffeeFiltered = FilteredCoffeeMachine(Scanner(System.`in`))
    val filtered = coffeeFiltered.request()
    println(filtered.drink())
}

