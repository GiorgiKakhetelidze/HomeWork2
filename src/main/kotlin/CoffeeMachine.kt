import java.util.*

class CoffeeMachine(private val scanner : Scanner) {

    fun request(): Double {
        println("Enter Coffee Type : latte, cappuccino")

            return when(scanner.next()){
                "latte" -> LatteCoffee(Sugar(requestSugarQuantity()), Milk(requestMilkQuantity())).price
                "cappuccino" -> CappuccinoCoffee(Sugar(requestSugarQuantity()), Milk(requestMilkQuantity()), requestCinnamon()).price
                else -> { println("Unknown Coffee Type");return 0.0 }
            }
    }

    private fun requestSugarQuantity() : Int{
        println("How much sugar do you want?")

        return valInputInt()
    }

    private fun requestMilkQuantity() : Int{
        println("How much MILK do you want?")

        return valInputInt()
    }

    private fun requestCinnamon() : Boolean{
        println("Do you want cinnamon? true, false")

        while(!scanner.hasNextBoolean()){
            println("Please enter Boolean value : true,false")
            scanner.next()
        }

        return scanner.nextBoolean()
    }

    private fun valInputInt() : Int{
        var input = 0

        while(!scanner.hasNextInt() || input <= 0)
        {
            if(scanner.hasNextInt()){
                input = scanner.next().toInt()
                if(input >= 0)
                    break
            }
            else{
                scanner.hasNextInt()
                scanner.next()
            }

            println("That's not a positive number, try again.")
        }

        return input
    }
}