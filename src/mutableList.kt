fun main(args:Array<String>)
{
    var x=ArrayList<Int>()
    x.add(10)
    x.add(2)
    x.add(75)

    for(i in 0..x.size-1){
        println(x[i])
    }
    x[1]=15
    println("after replacing second item")
    for(i in 0..x.size-1){
        println(x[i])
    }

}