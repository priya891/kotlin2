class firstLastName {

    init{
        var firstName="priya"
        println("First name: $firstName")
        var lastName="patel"
        println("Last name: $lastName")
    }
    companion object{
        const val age=20
    }
}
fun main(args:Array<String>){
    var obj=firstLastName()
    print(firstLastName.age)
}