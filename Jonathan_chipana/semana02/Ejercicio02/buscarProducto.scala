/**
 * AUTOR: Jonathan Chipana
 * CURSO: Lenguajes de Programación
 * FECHA: 06 de Septiembre de 2026
 */

object buscarProducto {
  
  // Método para buscar un producto en el catálogo

def buscarProducto(catalogo: Map[String, Double], productoBuscar: String): Unit = {
    // Se obtiene un iterador sobre el catálogo para recorrerlo
    val iterador = catalogo.iterator
    var encontrado = false 

    // Se recorre el catálogo hasta encontrar el producto o hasta que no haya más elementos
    while (iterador.hasNext && !encontrado) {
      val (producto, precio) = iterador.next()
      
      if (producto == productoBuscar) {
        // Formato exacto requerido en el enunciado original
        println(s"El precio de $producto es $$$precio")
        encontrado = true
      }
    }

    if (!encontrado) {
      // Formato exacto requerido en el enunciado original
      println("Producto no encontrado en el catálogo actual")
    }
  }

  // 2. Método principal para probar la función
  def main(args: Array[String]): Unit = {
    val catalogo: Map[String, Double] = Map(
      "Laptop"      -> 1200.0,
      "Smartphone"  -> 800.0,
      "Tablet"      -> 500.0,
      "Auriculares" -> 150.0,
      "Cámara"      -> 900.0
    )

    println("--- Buscando productos ---")
    buscarProducto(catalogo, "Laptop")      
    buscarProducto(catalogo, "Smartphone")   
    buscarProducto(catalogo, "Televisor")   
  }
}