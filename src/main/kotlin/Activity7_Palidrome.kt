var b: String? = ""
var word: String? = ""
var trim1: String? = ""
fun main() {

    println("Enter word: ")
    word = readLine()

    for(i in 0..word!!.length-1){
        trim1 += word!![i].toString().trim()
    }

    for (a in trim1!!.length - 1 downTo 0) {
        b += trim1!!.get(a).toString()
    }
    if (trim1 == b) {
        println("$word is palindrome")
    } else {
        println("$word is not palindrome")
    }
    println("$trim1 -> $b")
}