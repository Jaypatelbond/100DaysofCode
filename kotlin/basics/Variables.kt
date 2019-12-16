package basics

/*
 * @author Jaypatelbond
 */

 /*
 * type inference is used in kotlin
 * var can be reassigned but val can not be
 * There are no primitive data types in Kotlin
 * All the data types are objects, so there is no default values for them
 * Boolean(1) Byte(8) Char(16) Short(16) Int(32) Long(64,L) Float(32,f,F) Double(64,d,D)
 * string interpolation is used in kotlin (" ${} ")
 */

 fun main(args: Array<String>) {
    val mString = "avcbcoder"
    println(mString)
    //mString="cannot be reassigned"

    var a = "hello"
    a = "name is ${a}"//interpolation
    println(a)

    var x = 10
    var y = 20
    println("Answer is ${x + y} and x is $x")

    var mFloat: Float
    var mDouble: Double
    mFloat = 99.6f
    mDouble = 99.6

    // Casting

    val int:Int="123".toInt()
    println(int)
}