package kasra

class hi<T , N>(var a:T,var b :N){
    fun <W,Z>x(){
        println("a = $a , b = $b")
    }
    fun <Q>y(vararg item:Q){
        item.forEach { Q -> println(Q) }
    }
}

fun main(){
    var obj = hi<String,Int>("kasra",25)
    obj.a
    obj.b
    obj.x<String,Int>()
    obj.y<Int>(20,30,40)
}

