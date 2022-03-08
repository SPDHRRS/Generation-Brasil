package heritage

class Dogge(nM: String, aG: Int, sND: Boolean, rnnr: Boolean):Animal(nM, aG, sND) {


    val roar = "Bark Bark Bark"

    override fun sound() {

        println("Happy Boi: $roar")

    }
    fun run(){

        println("Running as a Happy Boi")

    }

}