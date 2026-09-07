/**
 * AUTOR: Jonathan Chipana
 * CURSO: Lenguajes de Programación
 * FECHA: 06 de Septiembre de 2026
 */

case class libros (titulo: String, autor: String, paginas: Int)

 object libro {
    def main(args: Array[String]): Unit = {
        val libro1 = libros("El Principito", "Antoine de Saint-Exupéry", 96)
        val libro2 = libros("1984", "George Orwell", 328)
        val libro3 = libros("Cien Años de Soledad", "Gabriel García Márquez", 417)

        val listaLibros = List(libro1, libro2, libro3)

        val librosFiltrados = listaLibros.filter(libro => libro.paginas > 300) 
        val titulosMayusculas = librosFiltrados.map(_.titulo.toUpperCase) 
        val titulosConPrefijo = titulosMayusculas.map(titulo => s"LECTURA CORTA: $titulo")
        val totalCaracteres = titulosConPrefijo.map(_.length).sum

        println("Libros con más de 300 páginas:")
        titulosConPrefijo.foreach(println) 
        println(s"Total de caracteres en los títulos: $totalCaracteres")

    }
}