import java.time.LocalDate
import kotlin.concurrent.thread
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    var user: String?
    var pass: String?
    var cpass: String?
    var name: String? = ""
    var age: Int?
    val xword = mutableListOf(
        "stupid",
        "fool",
        "idiot",
        "fuck",
        "oten",
        "yawa",
        "shit",
        "buang",
        "bobo",
        "vagina",
        "bilat",
        "piste"
    )
    val account = mutableMapOf<Int, MutableMap<String, Any>>()
    val records = mutableMapOf<String, Any>()
    var loginData = mutableMapOf<String, Any>()
    var menu: CharArray
    var balance = 1000
    var deposit: Int?
    var withdraw: Int?
    var index: Int = 1
    val dateNow: LocalDate = LocalDate.now()




        println("\u001b[31m---------Welcome--------\u001b[0m")
        println("\u001b[32m------------to----------\u001b[0m")
        println("\u001b[34m-----Banking System-----\u001b[0m")


    do {
        println("Choose an Option")
        println("[1] Register [2]Log in")
        var option1 = readLine()?.toInt()


        if (option1 == 1) {
            println("-----------------------")
            println("Please fill up all data")
            println("-----------------------")
            do {
                print("Name: ")
                name = readLine()
                if (name == null) {
                    println("Fill up Name1")
                }
            } while (name == null)

            do {
                print("Age: ")
                age = readLine()?.toInt()
                if (age == null || age == 0 || age < 0) {
                    println("Invalid Input")
                }
            } while (age == null || age == 0 || age < 0)

            do {
                print("Username[Avoid Inappopriate Word]: ")
                user = readLine()
                if (xword.contains(user)) {
                    println("avoid inappopriate words")
                } else {
                    break
                }
            } while (true)

            do {
                print("Password[6-10 Characcters]: ")
                pass = readLine()
                print("Comfirm Password[6-10 Characcters]: ")
                cpass = readLine()
                if (pass != cpass) {
                    println("Password did not Match")
                } else if (pass!!.length < 5 || pass!!.length > 10) {
                    println("Password must have 6-10 characters!")
                } else {
                    break
                }
            } while (true)

            loginData[user!!] = pass!!
            println("Register Successfully!")


        } else if (option1 == 2) {
            do {
                println("Log In ")
                print("Username: ")
                val user1 = readLine()
                print("Password: ")
                val pass1 = readLine()

                if (loginData.containsKey(user1) && loginData[user1] == pass1) {
                    println("----------------------")
                    println("Welcome $name")
                    println("----------------------")
                    do {
                        println(
                            "Choose an Option: \n" +
                                    "[1] Deposit \n" +
                                    "[2] Withdraw\n" +
                                    "[3] Check Balance\n" +
                                    "[4] Transactions [i]\n" +
                                    "[5] Exit"
                        )
                        val ans = readLine()?.toInt()

                        when (ans) {
                            1 -> {
                                do {
                                    println("Type amount you want to Deposit: ")
                                    deposit = readLine()?.toInt()
                                    if (deposit!! < 1) {
                                        println("Invalid Amount")
                                    } else {
                                        balance += deposit
                                        println("$deposit has been deposit to your account")
                                        break
                                    }
                                } while (true)

                                val records = mutableMapOf<String, Any>()
                                records["Amount"] = deposit!!
                                records["Word"] = "Deposit" // Marking as deposit
                                records["Balance"] = balance
                                records["date"] = dateNow
                                account[index] = records
                                index++

                                println("Do you want to do another transaction? [Y/N]")
                                val conf1 = readLine()?.lowercase()
                                if (conf1 == "n") {
                                    return
                                }

                            }

                            2 -> {
                                do {
                                    println("Type amount you want to withdraw")
                                    withdraw = readLine()?.toInt()
                                    if (withdraw!! < 1) {
                                        println("Invalid Amount")
                                    } else if (withdraw > balance) {
                                        println("You only have $balance in your account please try again")
                                    } else {
                                        println("$withdraw has successfully withdraw")
                                        balance -= withdraw
                                        break
                                    }
                                } while (true)

                                val records = mutableMapOf<String, Any>()
                                records["Amount"] = withdraw!!
                                records["Word"] = "Withdraw" // Marking as withdrawal
                                records["Balance"] = balance
                                records["date"] = dateNow
                                account[index] = records
                                index++
                                println("Do you want to do another transaction? [Y/N]")
                                val conf1 = readLine()?.lowercase()
                                if (conf1 == "n") {
                                    return
                                }
                            }


                            3 -> {
                                println("Your Account balance is: $balance.")
                                println("Do you want to do another transaction? [Y/N]")
                                val conf1 = readLine()?.lowercase()
                                if (conf1 == "n") {
                                    break

                                }
                            }

                            4 -> {
                                transac(account)

                                println("Do you want to do another transaction? [Y/N]")
                                val conf1 = readLine()?.lowercase()
                                if (conf1 == "n") {
                                    break
                                }
                            }

                            5 -> return
                        }
                    } while (true)


                } else {
                    println("Invalid Username or Password! Try again? [Y/N]")
                    menu = readLine()?.lowercase()!!.toCharArray()
                    if(!menu.equals('y')){
                        continue
                    }

                }

            } while (true)
        }
    }while(true)
}
fun transac(map: Map<Int, Map<String, Any>>) {
    println("TRANSACTIONS: ")
    println("-----------------------------------------")
    if (map.isEmpty()) println("No records!")
    else {
        map.forEach { (index, records)  ->
            val amount = records["Amount"]
            val word = records["Word"]
            val date = records["date"]
            val balance = records["Balance"]
            val transactionType = if (word == "Deposit") "deposited" else "withdrawn"
            println("$index\t - $amount has been $transactionType from your account on $date! Current Balance: $balance")
        }
    }
}







