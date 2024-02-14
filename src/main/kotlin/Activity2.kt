package org.example
fun main(){
    println("--------------WELCOME--------------")
    println("Please fill up all neccessary info:")
    println("-----------------------------------")

    while(true){
        println("Please Enter your First Name: ")
        var fName: String? = readlnOrNull()

        println("Please Enter your middle innitials: ")
        var mi: Char? = readlnOrNull()?.singleOrNull()

        println("Please Enter your Last Name: ")
        var lName: String? = readlnOrNull()

        println("")
        println("Now Enter your Grades")
        println("English: ")
        var eng = readlnOrNull()?.toInt()?:0

        println("Math: ")
        var math = readlnOrNull()?.toInt()?:0

        println("Science: ")
        var science = readlnOrNull()?.toInt()?:0

        println("Filipino: ")
        var fil = readlnOrNull()?.toInt()?:0

        var ovg: Int = eng + math + science + fil
        var avg: Double = ovg.toDouble() / 4

        println("Hello $fName $mi. $lName")
        println("Your Grades are:")
        println("English: $eng")
        println("Math: $math")
        println("Science: $science")
        println("Filipino: $fil")
        println("You have a total of $ovg")
        println("And your average grade is: $avg")

      /*  if (avg >= 75){
            println("You Pass")
        }else{
            println("You Failed")
        }
        */

    }

}