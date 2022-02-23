fun main() {

// Faça um programa que receba três inteiros e diga qual deles é o maior.

    println("Enter the first number to compare: ")
    val n1 = readLine()!!.toInt()

    println("Enter the second one: ")
    val n2 = readLine()!!.toInt()

    println("Enter the last one: ")
    val n3 = readLine()!!.toInt()

    if(n1 > n2 && n1 > n3){

        println("The first is bigger")

    }else if(n2 > n1 && n2 > n3){

        println("The second is bigger")

    }else if(n3 > n1 && n3 > n2){

        println("The third is bigger")

    }else {

        println("They are equals")

    }



}