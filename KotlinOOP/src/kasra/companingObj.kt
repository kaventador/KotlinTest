package kasra

class A {
    companion object {
        fun x(){
            println("x")
        }
    }
}

fun A.Companion.y(){
    println("Companing")
}


fun main() {
    A.x()
    A.y()
}



