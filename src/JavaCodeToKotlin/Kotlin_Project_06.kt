package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_06 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // Örnek 1 :
            println("Bir sayı girişi yapınız :")
            val tara = Scanner(System.`in`)
            val s1 = tara.nextInt()
            println(5 * s1)
            // Örnek 2 :
            val tara1 = Scanner(System.`in`)
            println("Birinci sayı girişini yapınız : ")
            val sayi1 = tara1.nextInt()
            println("İkinci sayı girişini yapınız : ")
            val sayi2 = tara1.nextInt()
            val toplam = sayi1 + sayi2
            val carpim1 = sayi1 * sayi2
            println("Sayıların Toplamı : $toplam")
            println("Sayıların Çarpımı : $carpim1")
            // Örnek 3 :
            val sayi3 = 2
            val sayi4 = 3
            val carpim2 = sayi3 * sayi4
            val bolum1 = sayi3 / sayi4
            val kalan1 = sayi3 % sayi4
            println("Sayıların Çarpımı : $carpim2")
            println("Sayıların Bölümü : $bolum1")
            println("Sayıların Kalanı : $kalan1")
            // Örnek 4 :
            val tara2 = Scanner(System.`in`)
            println("Bir sayi giriniz : ")
            val x1 = tara2.nextInt()
            println("Karesi : ${x1 * x1}")
            // Örnek 5 :
            val tara3 = Scanner(System.`in`)
            println("X değerini giriniz : ")
            val x2 = tara3.nextInt()
            println("Bölümü : ${x2 / 2}")
            println("Kalanı : ${x2 % 2}")
            // Örnek 6 :
            val tara4 = Scanner(System.`in`)
            println("X değerini giriniz : ")
            val x3 = tara4.nextInt().toFloat()
            println("Bölümü : ${x3 / 2}")
            println("Kalanı : ${x3 % 2}")
            // Örnek 7 :
            val tara5 = Scanner(System.`in`)
            println("X değerini giriniz : ")
            val x4 = tara5.nextInt()
            println("Y değerini giriniz : ")
            val y1 = tara5.nextInt()
            println("Bölümü : ${x4 / y1}")
            println("Kalanı : ${x4 % y1}")
            // Örnek 8 :
            val tara6 = Scanner(System.`in`)
            println("A değerini giriniz : ")
            val a = tara6.nextInt()
            println("B değerini giriniz : ")
            val b = tara6.nextInt()
            println("C değerini giriniz : ")
            val c = tara6.nextInt()
            println("A değeri : $a")
            println("B değeri : $b")
            println("C değeri : $c")
            println("A ve B'nin ortalaması : ${(a + b) / 2}")
            println("A ve C'nin ortalaması ${(a + c) / 2}: ")
            println("B ve C'nin ortalaması : ${(b + c) / 2}")
            println("ABC'nin ortalaması : ${(a + b + c) / 2}")
            // örnek 9 :
            val a_kenari = 5
            val b_kenari = 7
            println("Dikdörtge'nin çeversi : ${(a_kenari + b_kenari) * 2}")
            println("Dikdörtge'nin alanı : ${a_kenari * b_kenari}")
        }
    }
}