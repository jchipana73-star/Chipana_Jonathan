/**
 * AUTOR: Jonathan Chipana
 * CURSO: Lenguajes de Programación
 * FECHA: 06 de Septiembre de 2026
 * Codigo: u22321360
 */

object  actualizacion {

    def main (args: Array [String]): Unit = {

        val productos: Map[String, Double] = Map(
            "Laptop"    -> 1200.00,
            "Televisor" -> 850.00,
            "Celular"   -> 500.00,
            "Teclado"   -> 45.00,  
            "Mouse"     -> 15.00   
    )
        val productosFiltrados = productos.filter { case (_, precio) => 
      precio > 50.00 
    }

            val productosConDescuento = productosFiltrados.map { case (nombre, precio) =>
        (nombre, precio * 0.80)
        }
        
            val listaFormateada: List[String] = productosConDescuento.map { case (nombre, precioRebajado) =>
            s"Producto: $nombre | Precio Rebajado: $$$precioRebajado"
            }.toList
            val preciosFinales = productosConDescuento.values
            val precioPromedio: Double = if (preciosFinales.nonEmpty) {
            preciosFinales.sum / preciosFinales.size
            } else {
            0.0
            }
        
        println("       RESULTADOS DE LA ACTUALIZACIÓN MASIVA      ")
        
        
        println("\n> Lista de productos transformados:")
        listaFormateada.foreach(println)

        println("\n> Métrica de control:")
        // Imprime el promedio formateado de forma limpia con dos decimales
        println(f"El precio promedio de los productos resultantes es: $$$precioPromedio%.2f")
        
    }

}