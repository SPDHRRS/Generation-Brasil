import costumer.Costumer

fun main() {

    //Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
    //e pelo menos mais duas opções de construtores conforme sua percepção,
    //com os atributos: nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
    //A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    //Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
    //Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.

    try {

        println("Welcome to our Market")

        println("Lets sign you up: ")

        println("Enter Your Name: ")
        val nM = readLine()!!

        println("Enter Your Age: ")
        val aG = readLine()!!.toInt()

        println("Enter your address: ")
        val end = readLine()!!

        println("Enter your cellphone: ")
        val tEL = readLine()!!

        val cSTMR = Costumer(nM, aG, end, tEL)

        println("Your Info in our Market: $cSTMR")

        do {
            println("Choose a option to continue: ")
            println("1 - ADD Item\n 2 - Remove an item\n 3 - Show your list\n 4 - Exit")
            val oPT = readLine()!!.toInt()

            when(oPT){

                1 -> {cSTMR.bY()}
                2 -> {cSTMR.rMV()}
                3 -> {cSTMR.shwL()}
            }
        }while (oPT != 4)

    }catch (e: Exception) {

        println(e.message)

    }


}