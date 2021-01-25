class FilteredCoffee(private val sugar: Sugar, private val strength: CoffeeStrength) : Coffee(sugar) {
    override fun drink() {
        println(
            "Drinking filtered coffee with ${sugar.quantity} " +
                    "sugar and strength ${strength.name}"
        )
    }

}