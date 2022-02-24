fun main(){

    /*  Uma empresa desenvolveu uma pesquisa para saber as características
        psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
        era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
        (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
        agressiva).
        Pede-se para elaborar um sistema que permita ler os dados de 150
        pessoas, calcule e mostre: (WHILE)
        ● o número de pessoas calmas;
        ● o número de mulheres nervosas;
        ● o número de homens agressivos;
        ● o número de outros calmos;
        ● o número de pessoas nervosas com mais de 40 anos;
        ● o número de pessoas calmas com menos de 18 anos.
    */

    var nTP = 0
    var pC = 0
    var wN = 0
    var mA = 0
    var oC = 0
    var pNF = 0
    var pCE = 0

    while(nTP in 0..150){

        println("Enter you age: ")
        val aG = readLine()!!.toInt()

        println("Whats your genre?: (1-Feminine, 2-Masculine, 3-Others)")
        val seX = readLine()!!.toInt()

        println("Witch one are you?: (1-calm, 2-Nervous, 3-Aggressive")
        val mND = readLine()!!.toInt()

        nTP++

        if(seX == 1 && mND == 2){

            wN++

        }
        if(seX == 2 && mND == 3){

            mA++

        }
        if(seX in 1..3 && mND == 1){

            pC++

        }
        if(seX == 3 && mND == 1){

            oC++

        }
        if(aG < 18 && mND == 1){

            pCE++

        }
        if(aG > 40 && mND == 2){

            pNF++

        }

    }

    println("Calm People: $pC")
    println("Nervous Women: $wN")
    println("Aggressive Men: $mA")
    println("Calm Others: $oC")
    println("Nervous People above 40yrs: $pNF")
    println("Calm People under 18yrs: $pCE")

}