package JavaCodeToKotlin

class Kotlin_Project_24 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val s1 = "123"
            val x1 = Integer.valueOf(s1)
            println(x1 - 2)

            val s2 = "123"
            val x2 = s1.toInt()
            println(x2 - 2)
        }
    }
}