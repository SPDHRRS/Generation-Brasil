fun main(){

 //Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.


    println("Enter a number: ")
    val nbr = readLine()!!.toInt()

    if(nbr % 2 == 0) {

        println("Even")

    }else {

        println("ODD")

    }

    if(nbr < 0){

        println("Negative Number")

    }else {

        println("Positive Number")

    }




}