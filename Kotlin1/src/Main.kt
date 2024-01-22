//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
//    println("Hello Kasra")
//    println("Hello Setareh")
//
//    print("Hello Kotlin")
//    println(3+3)
//    println(3)

//    var age  = 25
//    var fname  = "Kasra"
//    var lname  = "Nikshabani"
//    println(fname + " " + lname + "\nAge = "+age)

//    var n1 = 2
//    var n2 = 3
//    val name:String="Kasra"
//    println("Number One : $n1 And Number Two : ${n1+n2} And Name is $name")

//    var a = 5
//    a+=5
//    println(a)


//    var n = 5
//    if (n==5){
//        println(n)
//    }else if (n==3){
//        println(n)
//    }else{
//        println("by by")
//    }

//    var n = 10
//    when(n){
//        1 -> {
//            println("n=1")
//        }
//        2 -> println("n=2")
//        3 -> println("n=3")
//        4 -> println("n=4")
//        else -> {
//            if (n>5){
//                println(n)
//            }
//        }
//    }


//    var number = 0
//    while (number < 100) {
//        println(number)
//        number++
//    }

//    var array1 = arrayOf("Kasra","Ali")
//    var array2 = arrayOf(41,32,68)
//    var array3 = arrayOf(true,false)
//    var array4 = arrayOf("kasra",100,true,1.02)
//
//    var newarray:Array<String> = arrayOf("Kasra ")
//
//    println(array1[0])
//    println(array2[2])
//    println(array3[1])
//    println(array4[3])
//
//    println(array1.size)
//
//    var arr = mutableListOf<Any>("kasra",25)
//    arr.add("Nikshabani")
//    arr.add(0,"index")
//    println(arr[0])
//    println(arr[1])
//    println(arr[2])


//    var arr = mutableListOf<Any>("kotlin","java","python","PHP")
//    for (i in 0 until 10 ){
//        println(i)
//    }
//    println("---------------------")
//    for (i in arr.indices){
//        println(arr[i])
//    }

//    for(i in arr.indices){
//        if (arr[i]=="python") {
//            println("I Found Python")
//            break
//        }
//        println(arr[i])
//    }
//

//    calculation1()
//    calculation2(5, 6)
//    Name("kasra","nikshabani")
//
//    var a = cal()
//    println(a)
//
//    var b = calculation4(5,4)
//    println(b)
//}
//
//
//fun calculation1() {
//    println(3 + 2)
//}
//
//fun calculation2(a: Int, b: Int) {
//    var sum = a + b
//    println(sum)
//}
//
//fun Name(name:String,family:String){
//    println(name.plus(" ").plus(family))
//}
//
//fun cal():String{
//    return "This is cal"
//}
//
//fun calculation4(a:Int,b:Int):Any{
//    return a+b


    num(22)
}


fun num(a:Int?){
    when(a){
        null -> println(-1)
        5 -> {
            println("number is 5")
        }
        10 -> {
            println("number is 10")
        }
        15 -> {
            println("number is 15")
        }
        20 -> {
            println("number is 20")
        }
        25 -> {
            println("number is 25")
        }
        else -> {
            println("Out Of Range")
        }
    }
}





