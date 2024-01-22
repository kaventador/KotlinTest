import com.sun.tools.javac.Main

class Car {
    var color: String? = null
    var name: String? = null
    var model: String? = null

    fun speed() {
        println("Speed is 100km/h")
    }
}

class Car2(color:String,name:String,model:String){
    var color:String=color
    var name:String=name
    var model:String=model
    fun speed2(){
        println("This is Speed2")
    }
}

fun main() {
    var obj = Car()
    obj.name="Benz"
    obj.color="Black"
    obj.model="C200"
    println(obj.color)
    obj.speed()

    var obj2 = Car2("Red","BMW","730i")
    println(obj2.name)
    println(obj2.color)
    println(obj2.model)
    println(obj2.speed2())

}
