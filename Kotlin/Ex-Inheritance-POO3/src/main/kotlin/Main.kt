import heritage.Dogge
import heritage.Horse
import heritage.Sloth

fun main() {

    val sif = Dogge("Sif", 250, true, true)
    val spirit = Horse("Spirit",22, true, true)
    val flash = Sloth("Flash",55, true,true)

    fun snd(opt:Int):String{

        return sif.sound().toString()
    }
    fun snd(opt:Double):String{

        return spirit.sound().toString()
    }
    fun snd(opt:Float):String{

        return flash.sound().toString()
    }

    println("Choose a animal to hear its sound:")
    println("1 - Sif(Dogge) 2 - Spirit(Horse) 3 - Flash(Sloth)")
    val chc = readLine()!!.toInt()

    when(chc){

        1 -> {snd(1)}
        2 -> {snd(1.11)}
        3 -> {snd(1.1f)}

    }
    if(chc <= 0 || chc >= 4){

        println("No Sound, Bye Bye!")

    }
}
