package hw2.task1

class Person(
        var fullName: String,
        var age: Int
) {
    constructor(): this("Noname", 0)
    fun move(){
        println("$fullName,(age - $age) is moving")
    }

    fun talk(){
        println("$fullName,(age - $age) is talking")
    }
}

fun main() {
    val person = Person("Abylay", 18)
    val p2 = Person()
    person.move()
    person.talk()
    p2.talk()

}