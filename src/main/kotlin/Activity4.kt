package src.main.kotlin

class inven(){
    var name: String? = null
    var quant: Int? = 0
    var stats: String? = null

    fun thirdOpt(){
        println("Item name:")
        name = readlnOrNull()
        println("Quantity:")
        quant = readlnOrNull()!!.toInt()


    }
    fun status() {
        println(
            "Item Status:\n" +
                    "[1] Good\n" +
                    "[2] Damage\n" +
                    "[3] Rotten"
        )
        val sans: Int? = readlnOrNull()?.toInt()
        when(sans){
            1 -> stats = "Good"
            2 -> stats = "Damage"
            3 -> stats = "Rotten"
        }
    }
    fun display(){
        println("In your inventory you have:")
        println("$quant $name with $stats condition")
    }

}

fun main() {
    val ans = inven()

        println("-------------------------------")
        println("WELCOME TO INVENTORY MANAGEMENT")
        println("-------------------------------")
    do {
        println(
            "CHOOSE AN OPTION: \n" +
                    "[1] Add an Item.\n" +
                    "[2] Delete an Item.\n" + //no function yet
                    "[3] Display Items."
        )
        val fopt = readlnOrNull()!!.toInt()

        when (fopt) {
            1 -> {
                println(
                    "What type of an item you want to add:\n" +
                            "[1] Vegetable\n" +
                            "[2] Fruits\n" +
                            "[3] Condiments"
                )
                println("Choose an Option:")
                val sopt: Int? = readlnOrNull()?.toInt()
                when (sopt) {
                    1 -> {ans.thirdOpt()
                        ans.status()}
                    2 ->  {ans.thirdOpt()
                        ans.status()}
                    3 ->  {ans.thirdOpt()
                        ans.status()}
                }
println("ITEM ADDED SUCCESSFULLY!")
            }

            3 -> ans.display()
        }
    } while (true)
}