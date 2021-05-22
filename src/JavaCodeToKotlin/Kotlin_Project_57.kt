package JavaCodeToKotlin

class Kotlin_Project_57 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            birlestir("Metin1", "Metin2")
            val metin1 = "Hello"
            val metin2 = "World!"
            birlestir(metin1, metin2)
        }

        fun birlestir(metin1: String, metin2: String) {
            println("$metin1 $metin2")
        }

    }
}