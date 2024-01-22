package kasra

sealed class shape{
    class circle(var radios:Float):shape(){
        fun too(){
            println("Hello")
        }
    }
    class squer(var leng:Int):shape(){
        fun too2(){
            println("Hello2")
        }
    }
    object notshape :shape()
}

fun eval(e:shape)=when(e) {
    is shape.circle -> println("circle anjam shod")
    is shape.squer -> println("ANjam SHOOOOD")
    shape.notshape->Double.NaN
}

fun main(){
    var obj1 = shape.circle(5f)
    var obj2 = shape.squer(20)

    obj1.too()
    obj2.too2()
    eval(shape.squer(20))

}


