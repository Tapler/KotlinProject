package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_70 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            val d1 = sınıflar(7.0, 8.0)
            System.out.println(d1.enial())
            d1.endegistir(4.0)
            System.out.println(d1.enial())
        }
    }
}

class sınıflar {
    private var en: Double
    var boy = 0.0

    constructor() {
        en = 10.0
    }

    constructor(x: Double, y: Double) {
        en = x
        boy = y
    }

    fun dortgen_alan_hesaplama(): Double {
        return en * boy
    }

    fun enial(): Double {
        return en
    }

    fun endegistir(x: Double) {
        en = x
    }
}