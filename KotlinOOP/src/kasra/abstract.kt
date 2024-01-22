package kasra


abstract class person(name:String,age:Int){
    abstract var x :Int
    fun hello(){
        println("HELLO")
    }
    abstract fun name()
}
class nurse(name: String, age: Int, nurseId:Int, override var x: Int):person(name,age){

    override fun name() {
        println("I'm a nurse")
    }
}

class teacher(name: String, age: Int, teacherId: Int, override var x: Int):person(name,age){
    override fun name() {
        println("I'm a teacher")
    }
}


