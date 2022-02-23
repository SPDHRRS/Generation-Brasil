fun main(){

    //Faça um programa que o usuário digite um número e o programa retorne o mês
    //referente ao valor

    println("Enter a number between 1 - 12: ")
    when(readLine()!!.toInt()){

        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else -> println("Invalid Number")

    }




}