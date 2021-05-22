package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_54 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("Vize notunu giriniz : ")
            val vize = tara.nextDouble()
            println("Final notunu giriniz : ")
            val finall = tara.nextDouble()
            println("Ortalamanız : ${hesapla(vize, finall)}")
        }

        fun hesapla(vize: Double, finall: Double): Double {
            return vize / 100 * 40 + finall / 100 * 60
        }
    }
}