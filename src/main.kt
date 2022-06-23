import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>) {

}

class Question() {
    var Answer: String? = null
    val CorrectAnswer = "42"
    val Question: String = "What is the answer to life, the universe and everything"
    fun display() {
        println("You said $Answer")
    }

    fun printResult(){
        when (Answer) {
            //if answer is correct answer
            CorrectAnswer -> println("You were correct")
            else -> println("Try again")
        }
    }
}