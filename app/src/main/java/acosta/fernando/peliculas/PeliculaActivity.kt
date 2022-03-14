package acosta.fernando.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PeliculaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelicula)

        val tv_nombre: TextView = findViewById(R.id.tv_nombre_pelicula)
        val tv_descripcion: TextView = findViewById(R.id.tv_desc_pelicula)
        val image: ImageView = findViewById(R.id.img_pelicula)

        val bundle = intent.extras

        if(bundle != null){
            tv_nombre.text = bundle.getString("nombre", "")
            tv_descripcion.text = bundle.getString("sinopsis", "")
            image.setImageResource(bundle.getInt("image"))
        }


    }
}