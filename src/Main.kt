import java.lang.Exception
import kotlin.text.toInt

fun main(){

    print("guess a number between 0 and 10 :   ")

    try {
        var num = readLine()!!.toInt()
        if (num == 5){
            println("You got it  ")
            println(" Game over ")
        }
        else {
            println("Wrong guess . it was 5 ")
        }

    }catch (e:Exception){
        println( "Pls enter number only")
    }



}