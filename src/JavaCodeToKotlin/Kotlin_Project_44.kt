package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_44 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var toplam = 0
            val sicaklik = IntArray(7)
            val tara = Scanner(System.`in`)
            for (i in 1..7) {
                println("$i. günün sıcaklığını giriniz : ")
                sicaklik[i - 1] = tara.nextInt()
                toplam += sicaklik[i - 1]
            }
            println("Ortalama sıcaklık : " + toplam / 7)
        }
    }
}