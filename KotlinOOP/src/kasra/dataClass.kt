package kasra

class user1(name: String,age:Int){

}

data class dataclass(var name: String , var age: Int)


fun main(){
    var data = user1("Kasra",25)
    var data2 = user1("Kasra",25)
    var dataclass = dataclass("Setareh",23)
    var dataclass2 = dataclass("Setareh",23)
    var dataclass3 = dataclass.copy(age = 50)

    println(data.equals(data2))
    println(dataclass.equals(dataclass2))
    println(dataclass3)
}


