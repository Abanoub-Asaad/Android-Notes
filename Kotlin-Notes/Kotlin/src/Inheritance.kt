open class BaseCoffeeMachine(
	private val price: Double, 
    private val color: String
) {
    
    fun makeCoffee() {
        println("Here's your coffee")
    }
}


class PremuimCoffeeMachine(
	private val price: Double, 
    private val color: String
) : BaseCoffeeMachine(price, color) {
    
}


fun main() {
    val coffeeMachine = PremuimCoffeeMachine(1000.0, "Brown")
    coffeeMachine.makeCoffee()
}