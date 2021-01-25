class LatteCoffee(private val sugar: Sugar, private val milk: Milk) : Coffee(sugar) {

    override val price: Double =
        if (sugar.price + milk.price == 0.0)
            super.price
        else
            sugar.price + milk.price

    override fun drink() {
        println("Drinking latte with ${sugar.quantity} sugar and ${milk.quantity} milk")
    }
}