/**
 * AUTOR: Jonathan Chipana
 * CURSO: Lenguajes de Programación
 * FECHA: 06 de Septiembre de 2026
 */

object  etiquetas {

    def main (args: Array[String]): Unit = {
        val hashtagsEntradas: Set [String] = Set(" Scala", "scala", "Java", "JS", "Python ", "js", "Go")
        
        println(s"Entrada original: $hashtagsEntradas")

       val resultadoFinal: String = procesarConjuntoEtiquetas(hashtagsEntradas)

       println(s"Resultado limpio: $resultadoFinal")
    }

        def procesarConjuntoEtiquetas(etiquetas: Set[String]): String = {

        val etiquetasLimpias = etiquetas.map(tag => tag.trim.toLowerCase)

        val etiquetasFiltradas = etiquetasLimpias.filter(tag => tag.length >= 3)

        val cadenaResultado = etiquetasFiltradas.mkString(", ")
        
        cadenaResultado
       }
     }
   

