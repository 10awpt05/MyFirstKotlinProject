package org.example

fun main () {


   for(i in 1..4) {
      println("Enter your first name: ")
      var fName = readLine()
      println("Enter your middle initial:")
      var mi = readLine()
      println("Enter your last name: ")
      var lName = readLine()
      println("Enter your age:")
      var age = readLine()?.toInt() ?: 0

      println("Your name is $fName $mi $lName")
      println("Your age is $age")
   }
}
