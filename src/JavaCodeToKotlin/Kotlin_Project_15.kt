package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_15 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            println("x sayısını giriniz : ")
            val x = tara.nextInt()
            println("y sayısını giriniz : ")
            val y = tara.nextInt()
            println("z sayısını giriniz : ")
            val z = tara.nextInt()
            val f1 = x - z
            val f2 = x - y
            val f3 = y - z
            val ort = (f1 + f2 + f3) / 3
            println("Farklarının ortalaması : $ort")
        }
    }
}