
fun main() {
    var num1: Int? = null
    var num2: Int? = null
    var low: Int? = 0
    var high: Int? = 0

    do{

            println("Enter a first number: ")
            num1 = readlnOrNull()?.toInt()


            println("Enter a second number: ")
            num2 = readLine()?.toInt()

        low = if(num1!! < num2!!) num1 else num2
        high = if (num1 > num2) num1 else num2

        if (num1 == null || num2 == null || low == high) {
            println("Invalid input. Please enter valid number scale")
            return
        }
    }while(num1 == null || num2 == null || low == high)







    print("Prime numbers between:\n" + "$low and $high - > ")

    while (low!! < high!!) {
        if (low > 1 && low != 0 && low != 1) {
        var isPrime = true
        for (i in 2 until low) {
            if (low % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            print("$low, ")
        }
    }
        low++
    }
}