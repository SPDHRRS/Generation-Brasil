fun main(){

    //Faça um programa que entre com três números e coloque em ordem crescente.

    println("Enter the first number: ")
    val n1 = readLine()!!.toFloat()

    println("Enter the second number: ")
    val n2 = readLine()!!.toFloat()

    println("Enter the last number: ")
    val n3 = readLine()!!.toFloat()

    val numbers = listOf(n1, n2, n3)

    println("The crescent order of the numbers is: ${numbers.sorted()}")


}