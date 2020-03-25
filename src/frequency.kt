fun main(args: Array<String>) {
    val str = "tothenew"
    val ch = 't'
    var frequency = 0

    for (i in 0..str.length - 1) {
        if (ch == str[i]) {
            ++frequency
        }
    }

    println("Frequency of $ch = $frequency")
}