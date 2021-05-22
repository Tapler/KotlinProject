package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_55 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("Vize notunu giriniz : ")
            val vize = tara.nextDouble()
            println("Final notunu giriniz : ")
            val finall = tara.nextDouble()
            println("Ortalamanız : ${harfnotu_hesapla(vize, finall)}")
        }

        fun harfnotu_hesapla(vize: Double, finall: Double): Double {
            val ort = vize / 100 * 40 + finall / 100 * 60
            var harf = ""
            when {
                ort >= 90 -> harf = "A+"
                ort >= 85 -> harf = "A-"
                ort >= 80 -> harf = "B+"
                ort >= 75 -> harf = "B"
                ort >= 70 -> harf = "B-"
                ort >= 65 -> harf = "C+"
                ort >= 60 -> harf = "C-"
                ort >= 55 -> harf = "C+"
                ort >= 50 -> harf = "D+"
                ort >= 45 -> harf = "D"
                ort >= 40 -> harf = "D-"
                ort >= 35 -> harf = "F+"
                ort >= 0 -> harf = "F-"
            }
            return ort
        }
    }
}