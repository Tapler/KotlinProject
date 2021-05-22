package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_21 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("A değerini giriniz : ")
            val a = tara.nextInt().toDouble()
            println("B değerini giriniz : ")
            val b = tara.nextInt().toDouble()
            println("C değerini giriniz : ")
            val c = tara.nextInt().toDouble()
            val art_ort = (a + b + c) / 3
            val har_ort = 3 / (1 / a + 1 / b + 1 / c)
            println("Aritmatik Ortalama : $art_ort")
            println("Harmonik Ortalama : $har_ort")
        }
    }
}