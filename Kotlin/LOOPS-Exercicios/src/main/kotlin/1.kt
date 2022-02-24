fun main() {

    //Informar todos os números de 1000 a 1999 que quando divididos por 11
    //obtemos resto = 5. (FOR)


    println("The numbers between 1000 and 1999 that when divided by 11 get a rest of 5 are:")
    for(i in 1000..1999){

        if(i % 11 == 5){

            println("$i")

        }

    }



}