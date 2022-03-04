fun main() {
/*
    Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário.
	E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
	Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável.
	A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.

 */



    println("Type the worker code: ")
    val codeW = readLine()

    println("Type n# of worked hours: ")
    val numH = readLine()!!.toDouble()

    var sal = 0.0
    var exc = 0.0
    var salExc = 0.0
    var salTotal = 0.0

    if(numH > 50.0){

        exc = numH - 50.0
        sal = 50.0 * 10.0
        salExc = exc * 20

    }else{

        sal = numH * 10.0

    }

    salTotal = sal + salExc

    println("Worker: $codeW")
    println("The base payment will be: $$sal")
    println("The Extra will be: $$salExc")
    println("The Total to receive: $$salTotal")

}