fun main() {
    var perc: Double? = 0.0
    var value: Double? = 0.0

    do {
        println("Enter Percentage:")
        perc = readLine()?.toDouble()
        if (perc == null || perc <= 0 || perc > 100) {
            println("Invalid percentage. Please enter a valid percentage.")
            return
        }
    }while(perc == null || perc <= 0 || perc > 100)

    do {
        println("Enter a value to calculate percentage of:")
        value = readLine()?.toDouble()
        if (value == null) {
            println("Invalid input for value. Please enter a valid number.")
            return
        }
    }while(value == null)

    val ans = perc / 100
    val result = value * ans
    println("Result: $result")
}