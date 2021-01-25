enum class CoffeeStrength {
    LEVEL1,
    LEVEL2,
    LEVEL3,
    LEVEL4,
    LEVEL5;

    val level: Int
        get() = ordinal + 1
}