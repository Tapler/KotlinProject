package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_66 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val tara = Scanner(System.`in`)
            val hesapla = New_class()
            hesapla.boy = 10.0
            hesapla.en = 15.0
            hesapla.boy = 20.0
            hesapla.en = 30.0
            System.out.println(hesapla.dortgen_alan_hesaplama())
            System.out.println(hesapla.dortgen_alan_hesaplama())
        }
    }
}

class New_class {
    var en = 0.0
    var boy = 0.0
    fun dortgen_alan_hesaplama(): Double {
        return en * boy
    }
}