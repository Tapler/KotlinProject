package JavaCodeToKotlin

class Kotlin_Project_63 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            println(topla(2, 3))
            println(topla(2.3, 3.6))
            println(topla(1, 2, 3))
        }

        fun topla(x: Int, y: Int): Int {
            return x + y
        }

        fun topla(x: Int, y: Int, z: Int): Int {
            return x + y + z
        }

        fun topla(x: Double, y: Double): Double {
            return x + y
        }

    }
}