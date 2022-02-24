fun main() {

    //Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

    var nODD = 0
    var nEVE = 0

    for(i in 1..10) {

        println("Enter the ${i}º Number: ")
        val nbR = readLine()!!.toInt()

        if(nbR % 2 == 0){

            nEVE++

        }else {

            nODD++

        }


    }
    println("Even numbers: $nEVE")
    println("Odd numbers: $nODD")




}