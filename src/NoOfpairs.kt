fun main(args: Array<String>) {
    println("enter string")
    var str = readLine()!!.toString()
    val charArray = str.toCharArray()

    for (i in 0..str.length-1){
        for (j in i + 1 ..str.length-1){
            if (charArray[i] == charArray[j]) {
                charArray[i] = '#'
                charArray[j] = '#'
            }
        }
    }
    for (i in 0..charArray.size-1){
        if (charArray[i] != '#') {
            println(charArray[i])
        }
    }

}


