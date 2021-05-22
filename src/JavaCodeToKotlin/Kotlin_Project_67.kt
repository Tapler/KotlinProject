package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_67 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            val ogrenci_1 = School_class()
            ogrenci_1.adsoyad = "İsmail Taşdelen"
            ogrenci_1.dersadi = "Nesne Tabanlı Programlama"
            ogrenci_1.dersnotu = 100
            ogrenci_1.sinif = "1.Sınıf"
            ogrenci_1.tc = "01234567890"
            println(ogrenci_1.adsoyad.toString() + "isimli ögrenci" + ogrenci_1.dersadi + "dan")
            ogrenci_1.kontol()
        }
    }
}

class School_class {
    var adsoyad: String? = null
    var sinif: String? = null
    var tc: String? = null
    var dersadi: String? = null
    var dersnotu = 0
    fun kontol() {
        if (dersnotu < 40) {
            println("Kaldı.")
        } else {
            println("Geçti.")
        }
    }
}