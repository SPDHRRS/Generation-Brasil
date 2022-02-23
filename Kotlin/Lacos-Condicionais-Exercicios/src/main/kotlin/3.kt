import kotlin.math.pow

fun main(){

/*
                 Desenvolva um sistema em que:
			Leia 4 (quatro) números;
			Calcule o quadrado de cada um;
			Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
			Caso contrário, imprima os valores lidos e seus respectivos quadrados.

 */



    println("Enter the first N#: ")
    val n1 = readLine()!!.toFloat()

    println("Enter the second N#: ")
    val n2 = readLine()!!.toFloat()


    println("Enter the third N#: ")
    val n3 = readLine()!!.toFloat()


    println("Enter the last N#: ")
    val n4 = readLine()!!.toFloat()

    val q1 = n1.pow(2)
    val q2 = n2.pow(2)
    val q3 = n3.pow(2)
    val q4 = n4.pow(2)

    if(q3 >= 1000){

        println("The square of the third n# is: $q3")

    }else println("The squares of the N#s are: \n$q1 \n$q2 \n$q3 \n$q4")





}