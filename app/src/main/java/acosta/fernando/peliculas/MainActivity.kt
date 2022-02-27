package acosta.fernando.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        llenar_peliculas()

        var adaptador = AdaptadorPeliculas(this, peliculas)
        var listview: ListView = findViewById(R.id.listview)

        listview.adapter = adaptador
    }

    fun llenar_peliculas() {
        val pelicula = Pelicula(0, getString(R.string.peli1), getString(R.string.peli1_sinopsis), 106, R.drawable.deadpool_poster)
        val pelicula2 = Pelicula(1, getString(R.string.peli2), getString(R.string.peli2_sinopsis), 126, R.drawable.wolverine)
        val pelicula3 = Pelicula(2, getString(R.string.peli3), getString(R.string.peli3_sinopsis), 132, R.drawable.shang_chi)
        val pelicula4 = Pelicula(3, getString(R.string.peli4), getString(R.string.peli4_sinopsis), 120, R.drawable.mm_poster)
        val pelicula5 = Pelicula(4, getString(R.string.peli5), getString(R.string.peli5_sinopsis), 105, R.drawable.huevos)
        peliculas.add(pelicula)
        peliculas.add(pelicula2)
        peliculas.add(pelicula3)
        peliculas.add(pelicula4)
        peliculas.add(pelicula5)
    }
}