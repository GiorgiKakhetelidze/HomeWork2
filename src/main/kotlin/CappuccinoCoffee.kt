class CappuccinoCoffee(sugar : Sugar, milk : Milk, hasCinnamon : Boolean) :Coffee(sugar, milk) {

    init {
        if(hasCinnamon)
            price += 0.5
    }
}