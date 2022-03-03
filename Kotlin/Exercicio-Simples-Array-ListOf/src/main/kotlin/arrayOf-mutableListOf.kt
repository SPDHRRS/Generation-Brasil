fun main() {

    val numAy = arrayOf(5, 10, 15, 20, 25)

    for(i in numAy){

        println(i)

    }

    val num = mutableListOf(5, 10, 15, 20, 25)

    num.remove(5)
    num.forEach{

        println(it)

    }



}