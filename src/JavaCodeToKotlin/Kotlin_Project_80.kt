package JavaCodeToKotlin

class Kotlin_Project_80 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val ogrenci_1 = NewClass("İsmail Taşdelen", "007")
            ogrenci_1.set_kayityili("2017")
            ogrenci_1.ogrencinoata()
            System.out.println(ogrenci_1.get_numarasi())
            val ogrenci_2 = NewClass("Nusret Gökçe", "008")
            ogrenci_2.set_kayityili("2017")
            ogrenci_2.ogrencinoata()
            System.out.println(ogrenci_2.get_numarasi())
            ogrenci_1.DersVeNotEkle("NTP", 100, 100)
            ogrenci_1.DersVeNotEkle("ALG", 100, 100)
            ogrenci_1.DersVeNotEkle("AGTML", 100, 100)
            ogrenci_1.DersVeNotEkle("MAT", 100, 100)
            ogrenci_1.DersVeNotEkle("FZK", 100, 100)
            ogrenci_1.DersVeNotEkle("WEB", 100, 100)
            ogrenci_1.DersVeNotEkle("GEO", 100, 100)
            ogrenci_1.DersVeNotEkle("BPP", 100, 100)
            ogrenci_1.OrtalamaHesapla()
        }
    }
}

class NewClass {
    private var bolumkodu: String? = null
    private var numarasi: String? = null
    private var kayityili: String? = null
    var adsoyad: String
    var sinifi: String? = null
    var notlar = Array(8) { IntArray(2) }
    var dersler = arrayOfNulls<String>(8)
    fun get_bolumkodu(): String? {
        return bolumkodu
    }

    fun get_numarasi(): String? {
        return numarasi
    }

    fun kayityili(): String? {
        return kayityili
    }

    fun get_ogrencisayisi(): Int {
        return ogrencisayisi
    }

    fun set_bolumkodu(bolumkodu: String?) {
        this.bolumkodu = bolumkodu
    }

    fun set_numarasi(numarasi: String?) {
        this.numarasi = numarasi
    }

    fun set_kayityili(kayityili: String?) {
        this.kayityili = kayityili
    }

    fun ogrencinoata() {
        numarasi = kayityili + bolumkodu + ogrencisayisi.toString()
    }

    private var i = 0
    fun DersVeNotEkle(dersadi: String?, vize: Int, fnl: Int) {
        dersler[i] = dersadi
        notlar[i][0] = vize
        notlar[i][1] = fnl
        i++
    }

    fun OrtalamaHesapla() {
        for (j in dersler.indices) {
            val ort = notlar[j][0] * 40 / 100 + notlar[j][1] * 60 / 100
            println("${dersler[j]} dersin ortalamasi : $ort")
        }
    }

    constructor(adsoyad: String, bolumkodu: String?) {
        this.bolumkodu = bolumkodu
        this.adsoyad = adsoyad
        ogrencisayisi++
    }

    constructor(adsoyad: String) {
        this.adsoyad = adsoyad
        ogrencisayisi++
    }

    constructor(adsoyad: String, kayityili: String?, sinifi: String?) {
        this.adsoyad = adsoyad
        this.sinifi = sinifi
        this.kayityili = kayityili
        ogrencisayisi++
    }

    companion object {
        private var ogrencisayisi = 0
    }
}