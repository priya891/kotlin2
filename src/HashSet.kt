fun main(args: Array<String>){
    var hashSet = HashSet<String>(6)
    hashSet.add("hello")
    hashSet.add("world")
    hashSet.add("hii")
    hashSet.add("how")


    for (i in hashSet){
        println(i)
    }
}