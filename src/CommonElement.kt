fun main(a: Array<String>) {
    val arr1 = intArrayOf(4, 7, 3, 9, 2)
    val arr2 = intArrayOf(3, 2, 12, 9, 40, 32, 4)
    println("common element in both")
    for (i in arr1.indices) {
        for (j in arr2.indices) {
            if (arr1[i] == arr2[j]) {
                println(arr1[i])
            }
        }
    }
}

