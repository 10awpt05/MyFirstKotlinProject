fun main(){
    var num1: Int? = 0

    print("Enter number:")
    num1 = readLine()?.toInt()

    print("$num1 : ")

    var result = 1

    for(a in num1!! downTo 1)
    {
        print(a)
        if (a > 1){
        print(" x ")
    }
        result *= a
    }
    print(" = $result")
}