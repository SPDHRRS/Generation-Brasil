fun main() {

    /*
      Fazer uma calculadora utilizando funções para cada operação matemática:
      Adição
      Subtração
      Multiplicação
      Divisão
    */

    val calcS = Calc(0.0,0.0)
    var oPR: Int

    while(true) {

        println("Enter 0 to continue or 5 to Results or any other number to exit")
        val oPR2 = readLine()!!.toInt()

        if(oPR2 == 5){

            println("\nThe Result is: ${Calc.result}")

        }else if(oPR2 == 0){

            println("Enter a number to calculate: ")
            calcS.n1 = readLine()!!.toDouble()

            println("Enter another number to calculate: ")
            calcS.n2 = readLine()!!.toDouble()

            println("Choose what will be done: (1-Add. 2-Subtraction. 3-Multi. 4-Div.")
            oPR = readLine()!!.toInt()

            when(oPR){

                1 -> {Calc.suM(calcS.n1, calcS.n2)}
                2 -> {Calc.suB(calcS.n1, calcS.n2)}
                3 -> {Calc.mulT(calcS.n1, calcS.n2)}
                4 -> {Calc.diV(calcS.n1, calcS.n2)}

            }
            if(oPR >= 5 || oPR <= 0){

                println("Invalid")
                break

            }

        }else break

    }

}
/*
fun aDD(nBR: Double, nBR2: Double): Double {

    return nBR + nBR2

}
fun sub(nBR:Double, nBR2:Double): Double {

    return nBR - nBR2

}
fun mult(nBR:Double, nBR2:Double): Double {

    return nBR * nBR2
}
fun div(nBR:Double, nBR2:Double): Double {

    return nBR / nBR2

}
*/