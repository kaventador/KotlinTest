package kasra


interface person2{
    var name:String
    var age:Int

    fun foo1(){
        println("HELLO")
    }
    fun foo2()
}

class body(override var name: String, override var age: Int) : person2{
    override fun foo2() {
        println("I'm in Body")
    }

}

fun main(){
    var obj = body("Setareh",50)
}


