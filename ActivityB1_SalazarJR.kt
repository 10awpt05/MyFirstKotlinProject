import mu.KotlinLogging
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList

class Logger1 {
    companion object {
        private val logger = KotlinLogging.logger {}
        fun log() = logger
    }
}

fun main() {
    //Activity B:1
    /*
    val members = arrayListOf(
    "Salazar, John Ryn",
    "Verano, Mark Justine",
    "Pelicano, Genalyn",
    "Pasignasigna, Kim")

    hehe
    */

    var formatdate: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-d")
    var dateBorrowed: LocalDate = LocalDate.now()
    var index: Int = 1

    val list = arrayListOf("English", "Math", "Science", "Filipino", "Values")
    val borrowedBooks = mutableMapOf<Int, MutableMap<String, Any>>()

    do {
        var option: Int? = null
        println("Please select Menu \n [1]Add New [2]Display and [3]Exit")

        option = try {
            readLine()?.toInt() ?: 2
        } catch (e: Exception) {
            Logger1.log().error { "ASDASDASD $e" }
            2
        }

        if (option == 1) {
            println("Please enter Borrower name:")
            val borrower = readLine()

            println(list)

            println("Please Enter the book to Borrow:")
            val book = readLine()

            val isBookAvailable = list.any { it.equals(book, ignoreCase = true) }


            println("Please Enter a Number of days to borrow:")
            val daysToBorrow = try {
                readLine()?.toLong() ?: 1
            } catch (e: Exception) {
                Logger1.log().error { e.message }
                0
            }
            val dateReturn = dateBorrowed.plusDays(daysToBorrow).format(formatdate)

            var confirmInput: String? = "N"

            if (isBookAvailable) {

                println("Do you really want to borrow the book? [Y|N]")
                confirmInput = readLine()
                if (confirmInput != null && (confirmInput[0].equals('Y', true) || confirmInput.equals("Yes", true))) {
                    Logger1.log().info { "Please wait! Saving Record.." }
                    val data = mutableMapOf<String, Any>()
                    data["borrower"] = borrower?.toUpperCase() ?: ""
                    data["book"] = book?.toUpperCase() ?: ""
                    data["dateBorrowed"] = dateBorrowed
                    data["dateReturn"] = dateReturn
                    data["daysToBorrow"] = daysToBorrow
                    borrowedBooks[index] = data
                    Logger1.log().info { "Data has been successfully saved!" }
                    index++
                } else {
                    Logger1.log().info { "Thanks for Coming! Come back soon!" }
                }
            } else {

                Logger1.log().warn { "Sorry! Book is not found or available." }


            }
        } else if (option == 2) {
            display1(borrowedBooks)
        }
    } while (option == 1 || option == 2)
}

fun display1(map: Map<Int, Map<String, Any>>) {
    println("List of Borrowed")
    println("INDEX --> BORROWER | BOOK | DATE BORROWED | DATE RETURN | DURATION (DAYS)")
    println("------------------------------------------------------")
    if (map.isEmpty()) {
        println("There's no record yet added.")
    } else {
        map.forEach { (index, data) ->
            println("$index\t | ${data["borrower"]} | ${data["book"]} | ${data["dateBorrowed"]} | ${data["dateReturn"]} | ${data["daysToBorrow"]}")
        }
    }
}
