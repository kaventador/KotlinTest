package kasra

enum class status(var statusid: Int){
    ON(1),
    OFF(0),
    OUT(-1)
}

class lamp(var status: status = kasra.status.OFF){
}

fun main(){
    var obj = lamp()
    println(obj.status)
    println(obj.status.statusid)
}


