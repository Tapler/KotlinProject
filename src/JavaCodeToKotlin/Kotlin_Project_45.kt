package JavaCodeToKotlin

class Kotlin_Project_45 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val not = byteArrayOf(12, 89, 34, 10)
            var eb = not[0].toInt()
            var ek = not[0].toInt()
            for (i in 1 until 4) {
                if (eb < not[i]) {
                    eb = not[i].toInt()
                } else if (ek > not[i]) {
                    ek = not[i].toInt()
                }
            }
            println(eb)
            println(ek)
        }
    }
}