fun main(){

    //Crie um programa que leia um número do teclado até que encontre um número igual a zero.
    //No final, mostre a soma dos números digitados.(DO...WHILE)


    var sm = 0

    do{

        println("Enter a Number:" )
        val eN = readLine()!!.toInt()

        sm += eN

    }while(eN != 0)

    println("The sum of all the entered numbers are: $sm")




}