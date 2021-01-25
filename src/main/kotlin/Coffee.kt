abstract class Coffee(private val sugar: Sugar) {

    open val price: Double = if (sugar.price == 0.0)
        BASE_PRICE_COFFEE
    else
        sugar.price + BASE_PRICE_COFFEE

    companion object {
        const val BASE_PRICE_COFFEE = 1.0
    }

    abstract fun drink()
}