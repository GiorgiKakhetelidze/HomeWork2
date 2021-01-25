class CappuccinoCoffee(private val sugar: Sugar, private val milk: Milk, private val hasCinnamon: Boolean) :
    Coffee(sugar) {

    override val price: Double =
        when {
            sugar.price + milk.price == 0.0 -> super.price
            hasCinnamon -> sugar.price + milk.price + 0.5
            else -> sugar.price + milk.price
        }

    override fun drink() {
        if (hasCinnamon)
            println("Drinking cappuccino with cinnamon, ${sugar.quantity} sugar and ${milk.quantity} milk")
        else
            println("Drinking cappuccino with ${sugar.quantity} sugar and ${milk.quantity} milk")
    }
}