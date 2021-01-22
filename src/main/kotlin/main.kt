import java.util.*

fun main() {
    val coffee  = CoffeeMachine(Scanner(System.`in`))
    val price = coffee.request()
    println(price)
}

