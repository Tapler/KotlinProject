package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_29 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var indirim = 0
            var sonuc = 0
            val tara = Scanner(System.`in`)
            println("Alışveriş tutarını giriniz : ")
            val tutar = tara.nextInt()
            println("R indirimini giriniz : ")
            val r_indirim = tara.nextInt()
            println("P indirimini giriniz : ")
            val p_indirim = tara.nextInt()
            println("N indirimini giriniz : ")
            val n_indirim = tara.nextInt()
            indirim = tutar * (r_indirim / 100) + (n_indirim - tutar) * (p_indirim / 100)
            sonuc = n_indirim - indirim
            System.out.println(sonuc)
        }
    }
}