fun main(){

    //Crie uma classe conta bancaria e apresente os atributos e métodos
    //referentes esta classe, em seguida crie um objeto conta bancaria, defina as
    //instancias deste objeto e apresente as informações deste objeto no
    //console.


    val bCC = BankACC()

    bCC.bLNC = 2000.00
    bCC.oWNR = "SpeeD"
    bCC.tP = "Checking ACC"

    bCC.sHWbalance()

    println("How much to withdraw?: ")
    val withdraw = readLine()!!.toDouble()

    bCC.wTHDRW(withdraw)

    println("Whats the value of the deposit: ")
    val deposit = readLine()!!.toDouble()

    bCC.aDQRDmoney(deposit)

    bCC.sHWbalance()



}