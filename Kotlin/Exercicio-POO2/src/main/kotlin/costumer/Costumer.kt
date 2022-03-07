package costumer

data class Costumer(private val nM: String, private val aG: Int){

    private val itensList = mutableListOf<String>()
    private var addrs = ""
    private var cphn = ""

    constructor(nM: String, aG: Int, end: String): this(nM, aG){

        this.addrs = end

    }

    constructor(nM: String, aG: Int,end: String, tEL: String): this(nM, aG){

        this.cphn = tEL
    }


    init {

        if(nM.isEmpty() || aG == 0){

            throw Exception("Costumer needs a name and a age above 0")

        }else{

            println("Your Info has been saved")

        }

    }
    fun bY(){

        println("Enter a item to be ADD to the list: ")
        val iT = readLine()!!.toString()

        if(itensList.contains(iT)){

            println("\nThis item has already been included in the list!\n")

        }else{

            itensList.add(iT)
            println("\nItem $iT included to your buy list\n")

        }

    }
    fun rMV(){

        println("Enter a item to be removed from the list: ")
        val iT = readLine()!!.toString()

        if(itensList.isEmpty() || iT.isEmpty()){

            println("\nTheres nothing to remove!\n")

        }else if(itensList.contains(iT)){

            itensList.remove(iT)
            println("\nItem $iT removed from your buy list\n")

        }else{

            println("\nThis item is not in the list\n")

        }

    }
    fun shwL(){

        itensList.forEach{

            println("Your current list: $it")

        }

    }

}

