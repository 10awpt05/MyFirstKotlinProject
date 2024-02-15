fun main(){
    println("--------------WELCOME--------------")
    println("Please fill up all necessary info:")
    println("-----------------------------------")

    println("How many student?:")
    val ans: Int = readln().toInt()?:0

    repeat(ans){
        println("Please Enter your First Name: ")
        val fName: String? = readlnOrNull()

        println("Please Enter your middle initials: ")
        val mi: Char? = readlnOrNull()?.singleOrNull()

        println("Please Enter your Last Name: ")
        val lName: String? = readlnOrNull()

        println("")
        println("Now Enter your Grades")
        println("English: ")
        val eng = readlnOrNull()?.toInt()?:0

        println("Math: ")
        val math = readlnOrNull()?.toInt()?:0

        println("Science: ")
        val science = readlnOrNull()?.toInt()?:0

        println("Filipino: ")
        val fil = readlnOrNull()?.toInt()?:0

        val ovg: Int = eng + math + science + fil
        val avg: Int = ovg / 4

        println("Hello $fName $mi. $lName")
        println("Your Grades are:")
        println("English: $eng")
        println("Math: $math")
        println("Science: $science")
        println("Filipino: $fil")
        println("You have a total of $ovg")
        println("And your average grade is: $avg")
        println("")
        /*
                if (avg >= 75){
                    println("You Pass")
                }else{
                    println("You Failed")
                }

         */
    }

}