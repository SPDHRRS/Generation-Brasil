package heritage

class Sloth(nM: String, aG: Int, sND: Boolean, clmb:Boolean):Animal(nM, aG, sND) {


    val roar = "Awwwhnnnnnn"

    override fun sound() {

        println("The forest echos with: $roar")

    }
    fun climb() {

        println("One Eternity Later...")

    }

}