open class Bank{
    open fun getdetail(){
        println("Bank details")
    }

}
class SBI:Bank(){
    override fun getdetail(){
        println("SBI details")
    }

}
class BOI:Bank(){
    override fun getdetail(){
        println("BOI details")
    }

}
class ICICI:Bank(){
    override fun getdetail(){
        println("ICICI details")
    }

}
fun main(args:Array<String>){
    var bank=Bank()
    var sbi=SBI()
    var boi=BOI()
    var icici=ICICI()
    bank.getdetail()
    sbi.getdetail()
    boi.getdetail()
    icici.getdetail()
}