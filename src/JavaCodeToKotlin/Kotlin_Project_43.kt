package JavaCodeToKotlin

class Kotlin_Project_43 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val sicaklik = byteArrayOf(10, 11, 12, 13, 14, 15, 16)
            var ort = 0
            for (i in 0 until 7) {
                println("$i . Sıcaklık = ${sicaklik[i]}")
                ort += sicaklik[i]
            }
            ort /= 7
            println("Ortlama Sıcaklık : $ort")
        }
    }
}