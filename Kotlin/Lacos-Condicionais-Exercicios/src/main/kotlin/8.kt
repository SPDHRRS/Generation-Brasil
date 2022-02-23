fun main(){

/*
        Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100,
	    caso contrário imprimi-la com o valor zero.

*/

    println("Enter a Number: ")
    val n = readLine()!!.toFloat()

    if(n > 100){

        println(n)

    }else {

        println(0.0)

    }


}