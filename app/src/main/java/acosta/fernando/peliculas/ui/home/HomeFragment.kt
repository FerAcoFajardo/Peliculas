package acosta.fernando.peliculas.ui.home

import acosta.fernando.peliculas.AdaptadorPeliculas
import acosta.fernando.peliculas.Pelicula
import acosta.fernando.peliculas.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import acosta.fernando.peliculas.databinding.FragmentHomeBinding
import android.widget.ListView

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    var peliculas: ArrayList<Pelicula> = ArrayList()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        llenar_peliculas()

        var adaptador = AdaptadorPeliculas(root.context, peliculas)

        var listview: ListView = binding.viewPeliculas

        listview.adapter = adaptador




        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
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