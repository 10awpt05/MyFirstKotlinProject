fun main(){
    var word1: String? = ""
    var word2: String? = ""
    var unique1: String? = ""
    var unique2: String? = ""
    var combineUnique: String? = ""
    var unique3: String? = ""


    println("Enter First String: ")
    word1 = readLine().toString()
    println("Enter Second String: ")
    word2 = readLine().toString()

    for(i in word1.indices)
    {
        var flag = true
        for(j in word1.indices) {
            if (word1[i] == word1[j] && i != j)
            {
                flag = false
                break
            }
        }
        if(flag == true) unique1 += word1[i]
    }
    println("The word $word1 unique character(s): $unique1")
    for(a in word2.indices)
    {
        var flag = 0
        for(b in word2.indices)
        {
            if(word2[a]==word2[b] && a != b)
            {
                flag = 1
                break
            }
        }
        if(flag == 0) unique2 += word2[a]
    }
    println("The word $word2 unique character(s): $unique2")
    combineUnique = unique1 + unique2
    for(x in combineUnique.indices)
    {

        var flag = 0
        for(z in combineUnique.indices)
        {
            if(combineUnique[x]==combineUnique[z] && x != z)
            {
                flag = 1
                break
            }
        }
        if(flag == 0) unique3 += combineUnique[x]
    }
    println("Both Unique String unique character(s): $unique3")
}