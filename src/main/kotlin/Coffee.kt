open class Coffee(sugar : Sugar, milk : Milk) {
    var price : Double
    init {
        if(sugar.price + milk.price == 0.0)
            price = Constants.basePrice
        else
            price = sugar.price + milk.price
    }
}