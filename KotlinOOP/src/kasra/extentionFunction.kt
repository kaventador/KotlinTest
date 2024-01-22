package kasra

class a{
    fun x(){
        println(2)
    }
}

fun a.y(){
    println("y")
}


fun main() {
    var obj1 = a()
    obj1.x()
    obj1.y()
}



