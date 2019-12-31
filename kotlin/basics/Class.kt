package basics

fun main(args: Array<String>) {
    var p = Person("Jay")
    p.display()

    //data class
    var student = Student("jay", 23);
    println(student.name + " " + student.age)

}

class Person {
    var name: String

    constructor(name: String) {
        this.name = name
    }


    fun display() {
        println(this.name)
    }

    override fun toString(): String {
        return "Person(name='$name')"
    }
}

data class Student(val name: String, val age: Int)
