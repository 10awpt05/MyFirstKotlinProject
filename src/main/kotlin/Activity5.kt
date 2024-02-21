package src.main.kotlin

import kotlin.system.exitProcess

class BookList() {
    var book: String? = null
    //

    fun books(){
        println("----------------------------------------------------------\n"+
                "PLEASE CHOOSE AN OPTION OF WHAT BOOK DO YOU WANT TO BORROW\n" +
                "----------------------------------------------------------\n"+
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
            1 -> book = "CLEAN CODE: A handbook of Agile Software Craftsmanship by Robert C. Martin"
            2 -> book = "INTRODUCTION TO ALGORITHMS by Thomas Cormen, Charles Leiserson, Ronald Rivest and Clifford Stein"
            3 -> book = "STRUCTURE AND INTERPRETATION OF COMPUTER SCIENCE by Harold Abelson, Gerald Jay Sussman, Julie Sussman"
            4 -> book = "THE CLEAN CODER: A code of conduct for professional Programmers by Robert Martin"
            5 -> book = "CODE COMPLETE: A Practical Handbook of Software Construction by Steve McConnell"
            6 -> book = "DESIGN PATTERNS: Elements of Reusable Object-Oriented Software by Erich Gamma and team"
            7 -> book = " THE PRAGMATIC PROGRAMMER by Andrew Hunt, David Thomas"
            8 -> book = " REFACTORING: Improving the Design of Existing Code by Martin Fowler"

        }
    }
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
        do {
            a1.books()
            println("----------------------------------")
            println("CONFIRMATION:")
            println("----------------------------------")
            println(
                "Are you sure you want to borrow [${a1.book}]?\n" +
                        "Type[Y] for yes and [N] for no."
            )
            val response: Char? = readLine()?.singleOrNull()?.lowercaseChar()
            if (response == 'y') continue
        }while(response == 'n')
        println("$name a $course borrowed a book [${a1.book}]")
        println("Do you want to borrow more book?: [Y/N]")
        val ans1: Char? = readLine()?.singleOrNull()?.lowercaseChar()
        if (ans1 == 'y') continue
        else exitProcess(0)
    } while (true)
}