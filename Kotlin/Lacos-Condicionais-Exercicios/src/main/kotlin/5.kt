fun main(){

/*
            A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
			indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
			varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
			suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
			intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
			notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
			medido e emita a notificação adequada aos diferentes grupos de empresas.
 */

    println("Enter the pollution rate: ")
    val pRate = readLine()!!.toFloat()

    if(pRate < 0.25){

        println("Its Okay")

    }else if(pRate > 0.25 && pRate <= 0.3){

        println("G1 Stop!")

    }else if(pRate > 0.3 && pRate <= 0.4){

        println("G1 and G2 Stop!")

    }else{

        println("All Groups must Stop!")

    }





}