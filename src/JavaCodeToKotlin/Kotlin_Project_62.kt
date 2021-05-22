package JavaCodeToKotlin

import java.util.*
import kotlin.math.pow

class Kotlin_Project_62 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            polinom()
        }

        fun polinom(){
            val tara = Scanner(System.`in`)
            println("A değerini giriniz : ")
            val a = tara.nextInt()
            println("B değerini giriniz : ")
            val b = tara.nextInt()
            println("C değerini giriniz : ")
            val c = tara.nextInt()
            println("D değerini giriniz : ")
            val d = tara.nextInt()
            println("X değerini giriniz : ")
            val x = tara.nextInt()
            val polinom = a + b * x +
                    c * x.toDouble().pow(2.0) +
                    d * x.toDouble().pow(3.0)
            println("Sonuç : $polinom")
        }

    }
}