fun main (){

    //Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    //trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
    //programa deverá atender as seguintes funcionalidades:
    //
    //Armazenar dados da List
    //Remover dados da list;
    //Atualizar dados da list.
    //Apresentar todos os dados da list.


    val iTNS = mutableListOf<String>()

    while(true) {


        println("\nWelcome to the Storage, what do you wish?:")
        print("1 - Add an item \n2 - Retrieve an item\n3 - Update an item \n4 - Show the current inventory\n5 - Exit\n")
        println("\nEnter a option from the menu above: ")
        val dCSN = readln().toInt()

        if (dCSN < 1 || dCSN > 5) {

            println("\nInvalid choice")

        } else if(dCSN == 5) {

            println("\nBye Bye!")
            break

        }
       if(dCSN == 1){

           println("\nEnter the item to be ADD: ")
           val iVNTRY = readLine()!!.toString()
           iTNS.add(iVNTRY)

       }
       if(dCSN == 2){

           println("\nEnter a item to be retrieved: ")
           val iVNTRY = readLine()!!.toString()
           iTNS.remove(iVNTRY)

           println("$iVNTRY Removed")

       }
       if(dCSN == 3){

           println("\nChoose a item based on list position 0 to ${iTNS.size -1} to be updated: ")
           val iSLCT = readLine()!!.toInt()

           println("\nEnter the update to be made: ")
           val iVNTRY = readLine()!!.toString()

           iTNS[iSLCT] = iVNTRY

           println("\nUpdated to $iVNTRY")

       }
       if(dCSN == 4){

           println("\nItems in the storage: ")
           iTNS.forEach{

               println(it)

           }

       }



    }



}