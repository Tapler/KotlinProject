package JavaCodeToKotlin

class Kotlin_Project_04 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val a: Int
            val b = 3.17f
            a = b.toInt()
            println(a)
            val sayi_a = 15
            val yeni_a: Double
            yeni_a = sayi_a.toDouble()
            println(yeni_a)
            val sayi_b: Byte = 3
            val yeni_b: Int
            yeni_b = sayi_b.toInt()
            println(yeni_b)
            val x1 = 22
            val y = x1.toByte()
            println(y)
            val s1 = "123"
            val x2 = Integer.valueOf(s1)
            println(x2 - 2)
        }
    }
}