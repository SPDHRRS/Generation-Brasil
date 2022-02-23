fun main() {

/*
    João, homem de bem, comprou um microcomputador para controlar o rendimento diário
    de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
    regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
    excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
    verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
    da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
    ZERO.
*/

    println("Write down the weight of tomatoes: ")
    val weighT = readLine()!!.toDouble()
    val exc = weighT - 50.00

    if(weighT > 50.00) {

        println("Total weight: $weighT \nExceeding weight: $exc \nFine to pay: ${4.00 * exc}")
    }
    else{

        println("Total weight: $weighT \nExceeding weight: 0.0 \nFine to pay: 0.0")
    }
}