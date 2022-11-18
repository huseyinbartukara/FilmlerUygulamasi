package com.example.filmleruygulamasi

class Kategorilerdao {

    fun tumKategoriler(vt:VeritabaniYardimcisi) : ArrayList<Kategoriler>{

        val db = vt.writableDatabase
        val kategorilerListe = ArrayList<Kategoriler>()

        val c = db.rawQuery("SELECT * FROM kategoriler",null)

        while(c.moveToNext()){
            val kategori = Kategoriler(c.getInt(c.getColumnIndex("kategori_id"))
                ,c.getString(c.getColumnIndex("kategori_ad")))

            kategorilerListe.add(kategori)
        }
        return kategorilerListe
    }
}