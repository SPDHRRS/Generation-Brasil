fun main(){

    //Escrever um programa que receba vários números inteiros no teclado. E no final
    //imprimir a média dos números múltiplos de 3. Para sair digitar
    //0(zero).(DO...WHILE)

    var sM = 0f
    val mD: Float
    var nT = -1

    do{

        println("Enter the numbers to be calculate: ")
        val nTC = readLine()!!.toInt()

        if(nTC % 3 == 0){

            sM += nTC
            nT++

        }

    }while(nTC != 0)

    mD = sM / nT

    println("The mean of the numbers multiples of 3 is: $mD")


}