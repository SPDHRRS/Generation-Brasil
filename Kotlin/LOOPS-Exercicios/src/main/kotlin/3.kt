fun main(){

    // Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    //21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    //idade for =-99. (WHILE)

    var aG = 0
    var aY = 0
    var aO = 0

    while(aG != -99){

        print("Enter your age: ")
        aG = readLine()!!.toInt()

        if(aG in 0..20){

            aY++

        }else if(aG > 50){

            aO++

        }
    }
    println("People below 21 years: $aY")
    println("People Above 50 years: $aO")

}