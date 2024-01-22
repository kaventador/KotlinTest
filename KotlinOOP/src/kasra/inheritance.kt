package kasra


//open class bace(name: String,age:Int){
//
//}
//class chld(name:String,age: Int,id:Int):bace(name,age){
//
//}


//open class bace{
//    constructor(name: String,age:Int)
//}
//class chld:bace{
//    constructor(name:String,age: Int):super(name,age)
//}


open class bace{
   open var name:String="Nikshabani"
   open fun foo(){
        println("Class bace")
    }
}

class chld:bace(){
    override var name="setareh"
    override fun foo() {
        super.foo()
    }
}

fun main(){
    //var obj = chld("Kasra",25,220)
}

