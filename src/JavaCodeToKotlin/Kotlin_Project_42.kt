package JavaCodeToKotlin

class Kotlin_Project_42 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val notlar = byteArrayOf(12, 34, 24, 0, 89, 34, 0)
            for (i in 0 until 7) {
                println("$i . değer = ${notlar[i]}")
            }
        }
    }
}