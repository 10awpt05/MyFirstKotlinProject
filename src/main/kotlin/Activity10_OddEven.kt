fun main(){
    var num: Int? = 0
    print("Enter Number: ")
    num = readLine()?.toInt()
    if(num!!%2 == 0){
        print("$num is Even = ")
        for(a in num downTo 1){
            if(a%2 == 0){
                print(" $a, ")
            }
        }
    }
    else{
        print("$num is Odd = ")
        for(b in num downTo 1){
            if(b%2 != 0){
                print(" $b, ")
            }
        }
    }
}