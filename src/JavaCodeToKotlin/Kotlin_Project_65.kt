package JavaCodeToKotlin

class Kotlin_Project_65 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val hesapla = New_class1()
            hesapla.boy = 10.0
            hesapla.en = 15.0
            System.out.println(hesapla.dortgen_alan_hesaplama())
        }
    }
}

class New_class1 {
    var en = 0.0
    var boy = 0.0
    fun dortgen_alan_hesaplama(): Double {
        return en * boy
    }
}