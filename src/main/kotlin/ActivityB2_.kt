package src.main.kotlin
/*
Activity B : 2

Members:
Salazar, John Ryn
Verano, Mark Justine
Pasignasigna, Kim
Pelicano, Genalyn
 */

fun main() {

    var option: Int? = 0
    var quantity1: Int? = 0
    var item: String? = ""
    var total: Int? = 0
    var index: Int = 1
    var t = true


    val list = mutableListOf(
        "APPLE",
        "BANANA",
        "ORANGE",
        "GRAPES",
        "MANGO"
    )
    val itemBought = mutableMapOf<Int, MutableMap<String, Any>>()

    println("WELCOME")
    do{
    println("Please choose an Option\n [1] Buy [2] Display [3] Exit")
    option = readLine()?.toInt()

    if (option == 1) {
        do{
            println(
                "Choose an item you want to buy:\n " +
                        "APPLE = P20.00 \n " +
                        "BANANA = P10.00\n " +
                        "ORANGE  = P10.00\n " +
                        "GRAPES = P70.00\n " +
                        "MANGO = P50.00"
            )

            item = readLine().toString().toUpperCase()
            var type: String? = "N"
            when (item) {
                "APPLE" -> {


                    println("How many?: ")
                    quantity1 = readLine()?.toInt()
                    total = quantity1!! * 20
                    println("TOTAL PRICE: $total")
                    println("Do you want to confirm your purchase?: [Y/N]")
                    type = readLine()
                    if (type != null && (type[0].equals('Y', true) || type.equals("Yes", true))) {
                        val data1 = mutableMapOf<String, Any>()
                        data1["item"] = item?.toUpperCase() ?: ""
                        data1["quantity1"] = quantity1?.toInt() ?: 0
                        data1["total"] = total?.toInt() ?: 0
                        itemBought[index] = data1
                        index++
                        println("Thanks for the purchase!")
                    } else {
                        break
                    }
                }

                "BANANA" -> {

                    println("How many?: ")
                    quantity1 = readLine()?.toInt()
                    total = quantity1!! * 10
                    println("TOTAL PRICE: $total")
                    println("Do you want to confirm your purchase?: [Y/N]")
                    type = readLine()
                    if (type != null && (type[0].equals('Y', true) || type.equals("Yes", true))) {
                        val data1 = mutableMapOf<String, Any>()
                        data1["item"] = item?.toUpperCase() ?: ""
                        data1["quantity1"] = quantity1?.toInt() ?: 0
                        data1["total"] = total?.toInt() ?: 0
                        itemBought[index] = data1
                        index++
                        println("Thanks for the purchase!")
                    } else {
                        break
                    }

                }

                "ORANGE" -> {

                    println("How many?: ")
                    quantity1 = readLine()?.toInt()
                    total = quantity1!! * 10
                    println("TOTAL PRICE: $total")
                    println("Do you want to confirm your purchase?: [Y/N]")
                    type = readLine()
                    if (type != null && (type[0].equals('Y', true) || type.equals("Yes", true))) {
                        val data1 = mutableMapOf<String, Any>()
                        data1["item"] = item?.toUpperCase() ?: ""
                        data1["quantity1"] = quantity1?.toInt() ?: 0
                        data1["total"] = total?.toInt() ?: 0
                        itemBought[index] = data1
                        index++
                        println("Thanks for the purchase!")
                    } else {
                        break
                    }

                }

                "GRAPES" -> {

                    println("How many?: ")
                    quantity1 = readLine()?.toInt()
                    total = quantity1!! * 70
                    println("TOTAL PRICE: $total")
                    println("Do you want to confirm your purchase?: [Y/N]")
                    type = readLine()
                    if (type != null && (type[0].equals('Y', true) || type.equals("Yes", true))) {
                        val data1 = mutableMapOf<String, Any>()
                        data1["item"] = item?.toUpperCase() ?: ""
                        data1["quantity1"] = quantity1?.toInt() ?: 0
                        data1["total"] = total?.toInt() ?: 0
                        itemBought[index] = data1
                        index++
                        println("Thanks for the purchase!")
                    } else {
                        break
                    }

                }

                "MANGO" -> {

                    println("How many?: ")
                    quantity1 = readLine()?.toInt()
                    total = quantity1!! * 50
                    println("TOTAL PRICE: $total")
                    println("Do you want to confirm your purchase?: [Y/N]")
                    type = readLine()
                    if (type != null && (type[0].equals('Y', true) || type.equals("Yes", true))) {
                        val data1 = mutableMapOf<String, Any>()
                        data1["item"] = item?.toUpperCase() ?: ""
                        data1["quantity1"] = quantity1?.toInt() ?: 0
                        data1["total"] = total?.toInt() ?: 0
                        itemBought[index] = data1
                        index++
                        println("Thanks for the purchase!")
                    } else {
                        break
                    }

                }

            }
        print("Do you want to Add more item? [Y/N]")
        type = readLine()
        if (type != null && (type[0].equals('Y', true) || type.equals("Yes", true))) {

        } else {
            break
        }

        }while(true)

        }
        if (option == 2) {
            display1(itemBought)
        }

}while(option == 1 || option == 2)
        }
fun display1(map: Map<Int, Map<String, Any>>): Int {
    var result = 0
    var result1 = 0

    if (map.isEmpty()) {
        println("There's no record yet added.")
    } else {
        map.forEach { (index, data) ->
            val amount = data["total"].toString().toIntOrNull() ?: 0
            val totalQuantity = data["quantity1"].toString().toIntOrNull() ?: 0

            println(
                when (index) {
                    is Int -> "[$index\t] ${data["item"]} - ${data["quantity1"]} = P${data["total"]}.00 "
                    else -> "Invalid index"
                }
            )
            result += amount
            result1 += totalQuantity
        }
        println("Total item Purchase: $result1")
        println("Total price: $result")
    }

    return result
}


