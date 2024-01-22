package kasra

open class base {
    private var i1:Int=1
    protected var i2:Int=2
    public var i3:Int=3
}

class child:base(){
    fun b(): Int {
        return i3
    }
}



fun main(){
    var obj1 = base()
}


