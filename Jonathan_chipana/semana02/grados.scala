/**
 * @author Jonathan Chipana
 * @codigo u22321360
 * @fecha 2026-06-09
 * @descripcion Este programa verifica si las temperaturas ingresadas están dentro del rango
 * permitido de 10 a 40 grados Celsius. Si alguna temperatura está fuera de este rango, 
 * se imprime un mensaje indicando cuáles son las temperaturas fuera del rango.
 */
import scala.io.StdIn

object grados extends App {

  val temperaturas = List(12, 25, 8, 30, 42, 15, 20)
  /* llamamos a la funcion  de verificacion */
  verificartemperatura(temperaturas)

  def verificartemperatura(temperatura: List[Int]): Unit =
    
    // Solicitar al usuario que ingrese el rango permitido de temperaturas
    print("Ingrese la temperatura mínima permitida (°C): ")
    val min = StdIn.readInt()

    print("Ingrese la temperatura máxima permitida (°C): ")
    val max = StdIn.readInt()

    // Filtrar las temperaturas que están fuera del rango permitido
    // Se utiliza la función filter para crear una nueva lista con las temperaturas fuera del rango
    val fueraDeRango = temperatura.filter(t => t < min || t > max)

    // Verificar si hay temperaturas fuera del rango y mostrar el mensaje correspondiente 
    if fueraDeRango.nonEmpty then
      println("\n-- Las siguientes temperaturas están fuera del rango permitido:")
      // Imprimir cada temperatura fuera de rango en una nueva línea
      fueraDeRango.foreach(t => println(s"   * $t °C"))
      
    else
      println("\n-- Todas las temperaturas están dentro del rango permitido.")
  }
