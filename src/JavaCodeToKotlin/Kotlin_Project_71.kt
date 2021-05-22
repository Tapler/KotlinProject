package JavaCodeToKotlin

class Kotlin_Project_71 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val d1 = Dortgen(7.0, 5.0)
        }
    }
}

class Dortgen {
    private var en = 0.0
    var boy: Double

    constructor() {
        boy = 10.0
    }

    constructor(en: Double, boy: Double) {
        this.en = en
        this.boy = boy
    }

    fun dortgen_alan_hesapla(): Double {
        return en * boy
    }

    fun enial(): Double {
        return en
    }

    fun endegistir(en: Double) {
        this.en = en
    }
}