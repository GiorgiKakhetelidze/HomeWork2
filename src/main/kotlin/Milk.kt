class Milk(val quantity : Int) {
    val price : Double = BASE_PRICE_MILK * quantity

    companion object{
        const val BASE_PRICE_MILK = 2.5
    }
}