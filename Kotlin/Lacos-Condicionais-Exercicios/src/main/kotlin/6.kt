fun main(){

/*
		Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
        Infantil A = 5 a 7 anos
        Infantil B = 8 a 11 anos
        Juvenil A = 12 a 13 anos
        Juvenil B = 14 a 17 anos
        Adultos = Maiores de 18 anos
 */

        println("Enter your age: ")
        val aG = readLine()!!.toInt()

        if(aG in 5..7){

        println("K-A")

    }else if(aG in 8..11){

        println("K-B")

        }else if(aG in 12..13){

            println("J-A")

        }else if(aG in 14..17){

            println("J-B")

        } else if(aG > 18){

            println("Adult")

        }




}