package kasra

class outerClass{
    var name:String = "Kasra"
    fun foo(){
        println("name is $name")
    }

    class nestedclass1{
        var id:Int=101
        fun foo1(){
            println("id is $id")
        }
    }
    class nestedclass2{
        var id2:Int=202
        fun foo2(){
            println("id2 is $id2")
        }
    }

}

fun main(){
    var obj = outerClass()
    obj.foo()
    var obj2 = outerClass.nestedclass1()
    obj2.foo1()
    var obj3 = outerClass.nestedclass2()
    obj3.foo2()
}


