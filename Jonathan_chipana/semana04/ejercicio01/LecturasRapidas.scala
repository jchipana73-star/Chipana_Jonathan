/**
 * AUTOR: Jonathan Chipana
 * CURSO: Lenguajes de Programación
 * FECHA: 06 de Septiembre de 2026
 * Codigo: U22321360
 */
case class Libro(titulo: String, autor: String, paginas: Int)

object  LecturasRapidas {

    def main(args: Array[String]): Unit = {
        
    val libros: List[Libro] = List(
      Libro("Cien Años de Soledad", "Gabriel García Márquez", 471),
      Libro("El Principito", "Antoine de Saint-Exupéry", 96),
      Libro("Ficciones", "Jorge Luis Borges", 174),
      Libro("Rayuela", "Julio Cortázar", 635),
      Libro("La Metamorfosis", "Franz Kafka", 96),
      Libro("Animal Farm", "George Orwell", 112),
      Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863)
    )

    println("=== LISTA ORIGINAL DE LIBROS ===")
    libros.foreach(l => println(s"- ${l.titulo} (${l.paginas} páginas) - ${l.autor}"))
    println()    

     val librosCortos: List[Libro] = libros.filter(libro => libro.paginas < 200)
     val titulosMayusculas: List[String] = librosCortos.map(libro => libro.titulo.toUpperCase)
     val titulosConPrefijo: List[String] = titulosMayusculas.map(titulo => "LECTURA CORTA: " + titulo)
     val totalCaracteres: Int = titulosConPrefijo.map(titulo => titulo.length).sum
    
     println("=== REPORTE: LECTURAS RÁPIDAS (< 200 páginas) ===")
    if (titulosConPrefijo.isEmpty) {
      println("No hay libros con menos de 200 páginas.")
    } else {
      titulosConPrefijo.foreach(println)
    }

    println()
    println(s"Total de libros en el reporte: ${titulosConPrefijo.size}")
    println(s"Total de caracteres combinados de los títulos procesados: $totalCaracteres")
  }
}
