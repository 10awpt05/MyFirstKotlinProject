package src.main.kotlin

import kotlin.system.exitProcess

class Beverage(){
    var bev1: String? =  null
    var con: String? = null
    var stat: String? = null
    fun item(){
        println("Choose an item to add:\n"+
                "[1] Soft drinks\n"+
                "[2] Wine\n"+
                "[3] Coffee\n"+
                "[4] Water")
        val ans = readLine()?.toInt()
        when(ans){
            1->bev1 = "Soft drinks"
            2->bev1 = "Wine"
            3->bev1 = "Coffee"
            4->bev1 = "Water"
        }

    }
    fun condition(){
        println("Item Status:\n"+
                "[1] GOOD\n"+
                "[2] DAMAGE\n"+
                "[3] EXPIRED")
        val choice = readLine()?.toInt()
        when(choice){
            1-> {con = "GOOD"
                stat = "SALEABLE"}
            2-> {con = "DAMAGE"
                stat = "UNSALEABLE"}
            3->{ con = "EXPIRED"
                stat = "UNSALEABLE"}
        }

    }
}
fun main() {
    val opt = Beverage()
    do {
        println("---------------------------")
        println("WELCOME TO BEVERAGE INVENTORY SYSTEM")
        println("---------------------------")
        println("")
        println(
            "PLEASE CHOOSE AN OPTION:\n" +
                    "[1] ADD ITEM TO THE INVENTORY.\n" +
                    "[2] CHECK INVENTORY[not available]\n"+
                    "[3] EXIT PROGRAM.")
        val option1: Int? = readlnOrNull()?.toInt()
        if (option1 == 1) {
            do {
                opt.item()

                println("Enter Brand: ")
                val brand: String? = readLine()
                println("What size:")
                val size: Any? = readLine()
                opt.condition()
                println("---------------------------")
                println("$size of $brand successfully added with ${opt.con} condition and its ${opt.stat}")
                println("---------------------------")
                println("Do you want to add more item? type [Y] for yes and [N] for no")
                val ans1: Char? = readLine()?.singleOrNull()?.lowercaseChar()

            } while (ans1?.equals('y')!!)
        }else if(option1 == 2){
            break
        }else if(option1 == 3){
            exitProcess(0)
        }else{
            break
        }
    } while (true)
}

