
    fun add(a:Int,b:Int):Int{
        return a + b
    }
    fun add(a:Double,b:Double):Double{
        return a+b

    }
    fun mul(a:Int,b:Int):Int{
        return a*b
    }
    fun con(a:String,b:String):String{
        return a+b
    }
    fun con(a:String,b:String,c:String):String
    {
        return a+b+c
    }

fun main(args:Array<String>)
{

    var x=add(2,3)
    println(x)
    var y=add(2.2,3.5)
    println(y)
    var z=mul(5,6)
    println(z)
    var s=con("hello","world")
    var q=con("hello","how","world")
    println(s)
    println(q)
}