package bot

import java.util.Scanner
val scanner = Scanner(System.`in`)

fun main() {

    greet("Alexa", 2024)
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: Int) {
    println("Hello! My name is $assistantName.")
    println("I was created in $birthYear.")
    println("Please, remind me your name.")
}

fun remindName() {
    val yourName = scanner.nextLine()
    println("What a great name you have, $yourName!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val remainder3 = scanner.nextInt()
    val remainder5 = scanner.nextInt()
    val remainder7 = scanner.nextInt()
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Your age is $age; that's good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    for (i in 0..readln().toInt()) {
        println("$i!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("What is correct way to declare a variable of Integer type in Kotlin?")
    println("1. let i = 42")
    println("2. var i: Int = 42")
    println("3. let i: int = 42")
    println("4. int i = 42")
    val rightAnswer = "2. var i: Int = 42"
    while(readln() != rightAnswer.first().toString()) {
        println("Please try again.")
    }
}

fun end() {
    println("Congratulations, have a nice day!")
}

