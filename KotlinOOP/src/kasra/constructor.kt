package kasra

class User(name:String?,age:Int?){
    var name:String = "kasra"
    var age:Int = 25

//    init {
//        println("name is $name")
//    }
}

class User2(id: Int?){
    constructor(name:String?,age: Int?,id:Int?):this(id)
}



fun main(){
    var obj1 = User("ali",null)
    var obj2 = User2("ali",null,22)
    println("name and age is : ${obj1.name}  ${obj1.age}")
}

