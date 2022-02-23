import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    /*
    Faça um programa em que permita a entrada de um número qualquer e exiba se este
    número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    ímpar exiba o número elevado ao quadrado.
    */

    
    println("Enter a number: ")
    val nR = readLine()!!.toDouble()
    
    val nrQ = sqrt(nR)
    val nrE = nR.pow(2)

    if(nR % 2 == 0.0){

        println("This is a even number with a root square of: ${"%.3f".format(nrQ)}")

        }else if(nR % 2 != 0.0){

            println("This is a odd number and its potency result is: $nrE")

        }else{println("Enter a valid number")}


    }
