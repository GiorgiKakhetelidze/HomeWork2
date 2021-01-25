class Sugar(val quantity: Int) {
    val price: Double = BASE_PRICE_SUGAR * quantity

    companion object {
        const val BASE_PRICE_SUGAR = 2.0
    }
}