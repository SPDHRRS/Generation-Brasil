fun main(){

    /*
    Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
    categoria ela se encontra:
    ● 10-14 infantil
    ● 15-17 juvenil
    ● 18-25 adulto
    */

    println("Enter your age: ")
    when(readLine()!!.toInt()){

        in 10..14 -> println("Infantile")
        in 15..17 -> println("Juvenile")
        in 18..25 -> println("Adult")
        else -> println("No categories available to your age")

    }


}