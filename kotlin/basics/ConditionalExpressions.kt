package basics

/**
 * @author Jaypatelbond
 */

//We can use if and else blocks to return some values also , last statement is the return value
//When is like a switch block, We dont need to use break statement in this, using else we can define default part
//we can use multiple values seperated by {,} in LHS of cases


fun main(args: Array<String>) {
    val x = 5;
    val y = 5;
    var a = if (x > y) {
        println("X is greater than y.");
        x
    } else {
        println("Last line emit some value.")
        y
    }
}