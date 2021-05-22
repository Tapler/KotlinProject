package JavaCodeToKotlin

class Kotlin_Project_74 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val b1 = Bisiklet()
            val b2 = Bisiklet(4)
            val b3 = Bisiklet(5, 5.4)
            b3.HiziDegistir(6)
            System.out.println(b3.HiziAl())
            b3.HiziArtir()
            System.out.println(b3.VitesAl())
            b3.HiziAzlat()
            System.out.println(b3.HiziAl())
            b3.Kontrol()
            System.out.println(b3.VitesAl())
        }
    }
}

class Bisiklet {
    private var hiz: Int
    private var vites = 0
    var agirlik = 0.0
    var fren = 0.0
    private val artis = 1

    constructor() {
        hiz = 3
        agirlik = 7.0
    }

    constructor(hiz: Int) {
        this.hiz = hiz
    }

    constructor(hız: Int, agirlik: Double) {
        this.hiz = hız
        this.agirlik = agirlik
    }

    fun HiziDegistir(hiz: Int) {
        this.hiz = hiz
    }

    fun HiziAl(): Int {
        return hiz.also { hiz = it }
    }

    fun VitesDegistir(hiz: Int) {
        this.hiz = hiz
    }

    fun VitesAl(): Int {
        return hiz
    }

    fun HiziArtir() {
        hiz += artis
    }

    fun HiziAzlat() {
        hiz += artis
    }

    fun VitesArttir() {
        vites += artis
    }

    fun VitesAzalt() {
        vites += artis
    }

    fun Kontrol() {
        if (hiz < 4) {
            println("Vites düşürülüyor.")
            VitesAzalt()
        } else if (hiz > 6) {
            println("Vites artırlıyor.")
            VitesArttir()
        }
    }
}