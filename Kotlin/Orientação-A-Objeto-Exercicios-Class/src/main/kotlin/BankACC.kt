class BankACC {

    var oWNR = ""
    var tP = ""
    var bLNC = 0.00


    fun sHWbalance(){

        println("You have $bLNC in your account")

    }
    fun aDQRDmoney(value: Double){

        if(value <= 0){

            println("Nothing to deposit")

        }else{

            bLNC += value
            println("New Balance: $$value")

        }

    }
    fun wTHDRW(value: Double){

        if(bLNC <= 0){

            println("You are broke bro!")

        }else if(value > bLNC){

            println("Sorry you cant withdraw more than you got on your balance")

        }else{

            bLNC -= value
            println("$$value retrieved, there is $$bLNC left in your account")

        }
    }



}