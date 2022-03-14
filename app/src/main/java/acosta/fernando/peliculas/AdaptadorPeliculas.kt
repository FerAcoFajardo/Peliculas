package acosta.fernando.peliculas

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.security.AccessControlContext

class AdaptadorPeliculas: BaseAdapter {
    lateinit var context: Context
    var peliculas: ArrayList<Pelicula> = ArrayList()

    constructor(context: Context, peliculas: ArrayList<Pelicula>) {
        this.context = context
        this.peliculas = peliculas
    }

    override fun getCount(): Int {
        // Indica el número de elementos que contiene la lista
        return peliculas.size
    }

    override fun getItem(p0: Int): Any {
        // Devuelve el elemento de la posición indicada
        return peliculas[p0]
    }

    override fun getItemId(p0: Int): Long {
        // Devuelve el identificador del elemento de la posición indicada
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        // Devuelve la vista del elemento de la posición indicada
        // Obtener inflador
        val inflador = LayoutInflater.from(context)
        var vista = inflador.inflate(R.layout.pelicula_view, null)

        var iv_img: ImageView = vista.findViewById(R.id.img_view)
        var tv_nombre: TextView = vista.findViewById(R.id.tv_nombre)

        var pelicula = peliculas[p0]

        iv_img.setImageResource(pelicula.image)
        tv_nombre.setText(pelicula.titulo)


        vista.setOnClickListener {
            val intent: Intent = Intent(context, PeliculaActivity::class.java)

            intent.putExtra("titulo", pelicula.titulo)
            intent.putExtra("sinopsis", pelicula.sinopsis)
            intent.putExtra("image", pelicula.image)

            context.startActivities(arrayOf(intent))
        }



        return vista
    }
}