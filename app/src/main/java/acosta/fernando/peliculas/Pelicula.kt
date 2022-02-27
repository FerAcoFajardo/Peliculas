package acosta.fernando.peliculas

data class Pelicula(val id: Int, var titulo: String, var sinopsis: String, var duracion: Int, var image: Int) {
    override fun toString(): String {
        return "Pelicula(titulo='$titulo', sinopsis='$sinopsis', duracion=$duracion, image=$image)"
    }
}
