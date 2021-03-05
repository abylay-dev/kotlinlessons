package hw2.task2

import hw2.task1.Person

class Reader(
        var fullName: String,
        var numberOfReaderCard: Int,
        var faculty: String,
        var birthdate: String,
        var phoneNumber: String,
) {
    constructor():this("", 0, "", "", "")
    fun takeBook(numberOfBooks: Int){
        if (numberOfBooks==1 || numberOfBooks==0) println("$fullName took $numberOfBooks book")
        else println("$fullName took $numberOfBooks books")
    }
    fun takeBook(listOfBooks: List<String>){
        print("$fullName took books: ")
        for (list in listOfBooks) print("$list, ")
        println('.')
    }
    @JvmName("takeBook1")
    fun takeBook(books: List<Book>){
        println("$fullName took books: ")
        for (b in books){
            println("\t${b.name} ----- ${b.author}")
        }
    }
    fun returnBook(numberOfBooks: Int){
        if (numberOfBooks==1 || numberOfBooks==0) println("$fullName took $numberOfBooks book")
        else println("$fullName took $numberOfBooks books")
    }
    fun returnBook(listOfBooks: List<String>){
        print("$fullName took books: ")
        for (list in listOfBooks) print("$list, ")
        println('.')
    }
    @JvmName("returnBook1")
    fun returnBook(books: List<Book>){
        println("$fullName took books: ")
        for (b in books){
            println("\t${b.name} ----- ${b.author}")
        }
    }
}

fun main() {
    val reader = Reader("Paula Lamb", 123456, "IT", "07.07.1997", "+87412345689")
    var books: List<Book> = listOf(Book("The Lord of the Rings", "J.R.R. Tolkien"),
            Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
            Book("The Da Vinci Code","Dan Brown"))

    reader.takeBook(5)
    reader.takeBook(listOf("The Lord of the Rings", "Harry Potter and the Sorcerer's Stone", "The Da Vinci Code"))
    reader.takeBook(books)
    books = books.drop(1)
    println("=============================")
    reader.returnBook(3)
    reader.returnBook(listOf("Harry Potter and the Sorcerer's Stone"))
    reader.takeBook(books)
}
class Book(
        var name: String,
        var author: String
) {
}