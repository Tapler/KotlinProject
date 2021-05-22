package JavaCodeToKotlin

import java.util.*

class Kotlin_Project_49 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tara = Scanner(System.`in`)
            print("Başlamak için 1'e basın : ")
            val x = tara.nextInt()
            if (x == 1) {
                val a = (Math.random() * 3).toInt()
                val b = (Math.random() * 3).toInt()
                val c = (Math.random() * 3).toInt()
                if ((a == b) and (b == c)) println("100 altın kazandın.")
                else if (a == b || b == c || a == c)
                    println("15 altın kazandınız.")
                else if ((a != b) and (b != c) and (a != c))
                    println("Kazamadın.")
            }
        }
    }
}