package heritage

class Horse(nM: String, aG: Int, sND: Boolean, rnnr:Boolean):Animal(nM, aG, sND) {


    val roar = "Neeeeighhh !"

    override fun sound() {

        println("With the wind you can hear: $roar")

    }
    fun run(){

        println("Running wild with the wind")

    }

}