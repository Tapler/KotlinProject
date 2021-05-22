package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_68 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            val hesapla_1 = New_class3()
            System.out.println(hesapla_1.en)
            val hesapla_2 = New_class3()
            System.out.println(hesapla_2.en)
        }
    }
}

class New_class3 {
    var en = 10.0
    var boy = 0.0
    fun dortgen_alan_hesapla(): Double {
        return en * boy
    }

}