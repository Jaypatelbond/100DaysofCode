package basics

/*
 * @author Jaypatelbond
 */

// Use of Double Dot Operator
fun main(args: Array<String>) {

    var range: IntRange = 1..5//1,2,3,4,5
    range = 1.rangeTo(5)

    var r1 = 5..1 //Invalid
    println(2 in r1)

    var r2 : IntProgression= 5 downTo 1 //Reverse Mode
    r2 = 5.downTo(1)

    var r3: IntProgression = 1..5 step 2//1 3 5

    var r4 :CharRange= 'a'..'z'//'a' 'b' 'c' ... 'z'

    for (x in r4)
        print("$x ")

    var i = 0
    while (i < 10) {
        println(i)
        i++
    }

    var j = 0;
    do {
        println(j)
        j++;
    }while (j<10)


//-----------------------------------
    outer@ for (i in 1..4) {
        inner@ for (j in 5..8) {
            println("${i} ${j}")
            if (i == 2 && j == 6)
                break@outer
        }
    }

}