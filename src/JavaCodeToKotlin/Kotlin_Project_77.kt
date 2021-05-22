package JavaCodeToKotlin

class Kotlin_Project_77 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val d1 = Dortgen5()
            d1.setboy(3.0)
            System.out.println(d1.getboy())
        }
    }
}

class Dortgen5 {
    var en = 0.0
    private var boy = 0.0
    fun getboy(): Double {
        return boy
    }

    fun setboy(x: Double) {
        boy = x
    }

    fun alan_hesapla(): Double {
        return en * boy
    }
}