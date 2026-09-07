/**
 * AUTOR: Jonathan Chipana
 * CURSO: Lenguajes de Programación
 * FECHA: 06 de Septiembre de 2026
 * DESCRIPCIÓN: Verificación de stock en almacén.
 */

object almacen {

    def verificarReposicion(cantidad: List[Int], LimiteMinimo: Int): Unit = {
        
        val necesitaReposicion = cantidad.filter(_ < LimiteMinimo)

        necesitaReposicion.foreach {cantidad => 
            println(s"El producto con cantidad $cantidad necesita reposicion.")
        }
    }

    def main(args: Array[String]): Unit = {
        val StockActual = List(10, 5, 3, 8, 2)
        val LimiteMinimo = 5

        println("Verificando productos que necesitan reposición ${LimiteMinimo} unidades:")
        verificarReposicion(StockActual, LimiteMinimo)
    }


}