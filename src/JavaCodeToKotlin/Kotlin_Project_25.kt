package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_25 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            var ucret = 0.0
            val tara = Scanner(System.`in`)
            println("Kaç saat çalıştı : ")
            val s = tara.nextDouble()
            println("Saat başı kazlınan ücret : ")
            val u = tara.nextDouble()
            if (s <= 40) ucret = s * u
            else if (s > 40) ucret = 40 * u + (s - 40) * u * 1.5

            println("Kazancınız : $ucret")
        }
    }
}