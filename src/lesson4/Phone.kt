package lesson4

class Phone(
        var number : Int,
        var model: String,
        var weight: Int
) {
    constructor(number: Int, model: String): this(number, model, 0)
    constructor():this(0,"",0)

    fun receiveCall(name:String):String{
        return "Звонит $name"
    }
    fun getNumber(number:Int):Int {
        return number
    }

    fun receiveCall(name:String, number: Int):String{
        return "Звонит $name \nномер: ($number)"
    }
}

fun main(){
    var p1 = Phone(7, "sdfsdf", 132)
    var p2 = Phone(8, "bbbbbb", 150)
    var p3 = Phone(10, "aaaaaa", 146)
    var p4 = Phone(97, "cccccc")
    println(p1)
    println("--------")
    println(p2)
    println("--------")
    println(p3)
    println("--------")
    println(p4)
}
