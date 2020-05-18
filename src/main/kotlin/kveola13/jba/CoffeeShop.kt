package kveola13.jba

data class CoffeeStatus(
    var waterAmount: Int = 400,
    var milkAmount: Int = 540,
    var beanAmount: Int = 120,
    var cupAmount: Int = 9,
    var currencyAmount: Int = 550
)

fun coffeeShopCurrentStatus(coffeeStatus: CoffeeStatus): String {
    return (
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
    if (userInput.equals("buy")) {
        buyCoffee(userInput, coffeeStatus)
        println(coffeeShopCurrentStatus(coffeeStatus))
    }
    if (userInput.equals("fill")) {
        fillShop(coffeeStatus)
        println(coffeeShopCurrentStatus(coffeeStatus))
        return 1
    }
    if (userInput.equals("take")) {
        println("I gave you ${coffeeStatus.currencyAmount}")
        coffeeStatus.currencyAmount = 0
        println(coffeeShopCurrentStatus(coffeeStatus))
    }
    if (userInput.equals("q") || userInput.equals("quit")) {
        return -1
    } else {
        println("Please choose a correct input.")
    }
    return 1
}

private fun fillShop(coffeeStatus: CoffeeStatus) {
    print("Write how many ml of water you want to add: ")
    val waterInput = Integer.valueOf(readLine())
    coffeeStatus.waterAmount += waterInput
    print("Write how many ml of milk you want to add: ")
    val milkInput = Integer.valueOf(readLine())
    coffeeStatus.milkAmount += milkInput
    print("Write how many grams of coffee beans you want to add: ")
    val beanInput = Integer.valueOf(readLine())
    coffeeStatus.beanAmount += beanInput
    print("Write how many disposable cups of coffee you want to add: ")
    val cupInput = Integer.valueOf(readLine())
    coffeeStatus.cupAmount += cupInput
}

private fun buyCoffee(userInput: String?, coffeeStatus: CoffeeStatus): Int {
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
    val userPurchase = Integer.valueOf(readLine())
    if (userInput.equals("q") || userInput.equals("quit")) {
        return -1
    }
    if (userPurchase == 1 && purchaseEspresso(coffeeStatus)) {
        print("Transaction attempted: Espresso.\nTransaction pending...\n")
        purchaseEspresso(coffeeStatus)
    } else if (userPurchase == 2 && purchaseLatte(coffeeStatus)) {
        print("Transaction attempted: Latte.\nTransaction pending...\n")
        purchaseLatte(coffeeStatus)
    } else if (userPurchase == 3 && purchaseCappuccino(coffeeStatus)) {
        print("Transaction attempted: Cappuccino.\nTransaction pending...\n")
        purchaseCappuccino(coffeeStatus)
    } else {
        println("We are unfortunately out of stock. Please refill to allow purchase.")
        return 1
    }
    return 1
}

fun purchaseEspresso(coffeeStatus: CoffeeStatus): Boolean {
    return if (coffeeStatus.waterAmount - 250 >= 0 && coffeeStatus.beanAmount - 16 >= 0 && coffeeStatus.cupAmount >= 1) {
        coffeeStatus.waterAmount -= 250
        coffeeStatus.beanAmount -= 16
        coffeeStatus.cupAmount -= 1
        true
    } else {
        false
    }
}

fun purchaseLatte(coffeeStatus: CoffeeStatus): Boolean {
    return if (coffeeStatus.waterAmount - 350 >= 0 && coffeeStatus.milkAmount - 75 >= 0
        && coffeeStatus.beanAmount - 20 >= 0 && coffeeStatus.cupAmount >= 1
    ) {
        coffeeStatus.waterAmount -= 350
        coffeeStatus.milkAmount -= 75
        coffeeStatus.beanAmount -= 20
        coffeeStatus.cupAmount -= 1
        true
    } else {
        false
    }
}

fun purchaseCappuccino(coffeeStatus: CoffeeStatus): Boolean {
    return if (coffeeStatus.waterAmount - 200 >= 0 && coffeeStatus.milkAmount - 100 >= 0
        && coffeeStatus.beanAmount - 12 >= 0 && coffeeStatus.cupAmount >= 1
    ) {
        coffeeStatus.waterAmount -= 200
        coffeeStatus.milkAmount -= 100
        coffeeStatus.beanAmount -= 12
        coffeeStatus.cupAmount -= 1
        true
    } else {
        false
    }
}

fun main() {
    val cs = CoffeeStatus()
    println(coffeeShopCurrentStatus(cs))
    while (takeAction(cs) != -1) {
        takeAction(cs)
    }
}