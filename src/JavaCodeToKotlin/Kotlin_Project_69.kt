package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_69 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            val hesapla_1 = New_class4()
            System.out.println(hesapla_1.en)
            val hesapla_2 = New_class4(4.0)
            System.out.println(hesapla_2.en)
            val hesapla_3 = New_class4(4.0, 3.0)
            System.out.println(hesapla_3.en)
            System.out.println(hesapla_3.boy)
        }
    }
}

class New_class4 {
    var en: Double
    var boy = 0.0

    constructor() {
        en = 10.0
    }

    constructor(x: Double) {
        en = x
    }

    constructor(x: Double, y: Double) {
        en = x
        boy = y
    }

    fun dortgen_alan_hesapla(): Double {
        return en * boy
    }
}