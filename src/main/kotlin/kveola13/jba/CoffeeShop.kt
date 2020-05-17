package kveola13.jba

data class CoffeeStatus(var waterAmount: Int = 400,
                        var milkAmount: Int = 540,
                        var beanAmount: Int = 120,
                        var cupAmount: Int = 9,
                        var currencyAmount: Int = 550)

fun coffeeShopCurrentStatus(coffeeStatus: CoffeeStatus): String{
    return(
        "The coffee machine has:\n${coffeeStatus.waterAmount} of water\n" +
                "${coffeeStatus.milkAmount} of milk\n" +
                "${coffeeStatus.beanAmount} of coffee beans\n" +
                "${coffeeStatus.cupAmount} of disposable cups\n" +
                "${coffeeStatus.currencyAmount} of money"
    )
}

fun takeAction(coffeeStatus: CoffeeStatus): Int {
    print("Write action (buy, fill, take): ")
    val userInput = readLine()
    if(userInput.equals("buy")) {
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
        val userPurchase = Integer.valueOf(readLine())
        println(coffeeShopCurrentStatus(coffeeStatus))
    }
    if(userInput.equals("fill")){
        println("Write how many ml of water you want to add: ")
        val waterInput = Integer.valueOf(readLine())
        println(coffeeShopCurrentStatus(coffeeStatus))

    }
    if(userInput.equals("take")){
        println("I gave you ${coffeeStatus.currencyAmount}")
        coffeeStatus.currencyAmount = 0
        println(coffeeShopCurrentStatus(coffeeStatus))
    }
    if(userInput.equals("q") || userInput.equals("quit")){
        return -1
    }
    else{
        println("Please choose a correct input.")
    }
    return 1
}

fun main() {
    val cs = CoffeeStatus()
    println(coffeeShopCurrentStatus(cs))
    while (takeAction(cs) != -1){
        takeAction(cs)
    }
}