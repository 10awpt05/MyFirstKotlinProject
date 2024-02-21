package src.main.kotlin

import kotlin.system.exitProcess

class BookList() {

   //
   var book1 = "CLEAN CODE: A handbook of Agile Software Craftsmanship by Robert C. Martin"
        val book2 = "INTRODUCTION TO ALGORITHMS by Thomas Cormen, Charles Leiserson, Ronald Rivest and Clifford Stein"
        val book3 =
            "STRUCTURE AND INTERPRETATION OF COMPUTER SCIENCE by Harold Abelson, Gerald Jay Sussman, Julie Sussman"
        val book4 = "THE CLEAN CODER: A code of conduct for professional Programmers by Robert Martin"
        val book5 = "CODE COMPLETE: A Practical Handbook of Software Construction by Steve McConnell"
        val book6 = "DESIGN PATTERNS: Elements of Reusable Object-Oriented Software by Erich Gamma and team"
        val book7 = "THE PRAGMATIC PROGRAMMER by Andrew Hunt, David Thomas"
        val book8 = "REFACTORING: Improving the Design of Existing Code by Martin Fowler"
   //

}

fun main() {
    val a1 = BookList()
    println("----------------------------------")
    println("WELCOME TO STUDENT LIBRARY SYSTEM")
    println("----------------------------------")
    println("")
    println("Please Enter Student Name: ")
    val name = readLine()?.uppercase()
    println("Please Enter Student Course and year level: [ex.: BSIT 2]")
    val course = readLine().toString().uppercase()
    println("------------------------")
    do {
        println(
            "Please Choose a book you want to borrow:\n" +
                    "[1] CLEAN CODE: A handbook of Agile Software Craftsmanship by Robert C. Martin\n" +
                    "[2] INTRODUCTION TO ALGORITHMS by Thomas Cormen, Charles Leiserson, Ronald Rivest and Clifford Stein\n" +
                    "[3] STRUCTURE AND INTERPRETATION OF COMPUTER SCIENCE by Harold Abelson, Gerald Jay Sussman, Julie Sussman\n" +
                    "[4] THE CLEAN CODER: A code of conduct for professional Programmers by Robert Martin\n" +
                    "[5] CODE COMPLETE: A Practical Handbook of Software Construction by Steve McConnell\n" +
                    "[6] DESIGN PATTERNS: Elements of Reusable Object-Oriented Software by Erich Gamma and team\n" +
                    "[7] THE PRAGMATIC PROGRAMMER by Andrew Hunt, David Thomas\n" +
                    "[8] REFACTORING: Improving the Design of Existing Code by Martin Fowler"
        )
        val ans: Int? = readLine()?.toInt()
        when (ans) {
            1 -> {
                println("Do you want to borrow ${a1.book1}?: [Y/N]")
                val ans1: Char? = readLine()?.singleOrNull()?.lowercaseChar()
                if (ans1 == 'y') println("$name $course borrowed [${a1.book1}]")

            }

            2 -> {
                println("Do you want to borrow ${a1.book2}?: [Y/N]")
                val ans1: Char? = readLine()?.singleOrNull()?.lowercaseChar()
                if (ans1 == 'y') println("$name $course borrowed [${a1.book2}]")
            }

            3 -> {
                println("Do you want to borrow ${a1.book3}?: [Y/N]")
                val ans1: Char? = readLine()?.singleOrNull()?.lowercaseChar()
                if (ans1 == 'y') println("$name $course borrowed [${a1.book3}]")
            }

            4 -> {
                println("Do you want to borrow ${a1.book4}?: [Y/N]")
                val ans1: Char? = readLine()?.singleOrNull()?.lowercaseChar()
                if (ans1 == 'y') println("$name $course borrowed [${a1.book4}]")
            }

            5 -> {
                println("Do you want to borrow ${a1.book5}?: [Y/N]")
                val ans1: Char? = readLine()?.singleOrNull()?.lowercaseChar()
                if (ans1 == 'y') println("$name $course borrowed [${a1.book5}]")
            }

            6 -> {
                println("Do you want to borrow ${a1.book6}?: [Y/N]")
                val ans1: Char? = readLine()?.singleOrNull()?.lowercaseChar()
                if (ans1 == 'y') println("$name $course borrowed [${a1.book6}]")
            }

            7 -> {
                println("Do you want to borrow ${a1.book7}?: [Y/N]")
                val ans1: Char? = readLine()?.singleOrNull()?.lowercaseChar()
                if (ans1 == 'y') println("$name $course borrowed [${a1.book7}]")
            }

            8 -> {
                println("Do you want to borrow ${a1.book8}?: [Y/N]")
                val ans1: Char? = readLine()?.singleOrNull()?.lowercaseChar()
                if (ans1 == 'y') println("$name $course borrowed [${a1.book8}]")
            }
        }
        println("Do you want to borrow more book?: [Y/N]")
        val ans1: Char? = readLine()?.singleOrNull()?.lowercaseChar()
        if (ans1 == 'y') continue
        else exitProcess(0)
    } while (true)
}