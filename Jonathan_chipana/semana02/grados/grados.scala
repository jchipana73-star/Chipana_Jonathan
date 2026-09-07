object grados {

  def verificartemperatura(temperatura: List[Int]): List[String] = {
    val min = 10
    val max = 40

    val fuerasDeRango = temperatura.collect {
      case temp if temp < min || temp > max => s"Temperatura fuera de rango: $temp °C"
    }

    if (fuerasDeRango.nonEmpty) {
      println("\n---Temperaturas fuera del rango permitido: ---")
      fuerasDeRango.foreach(println)
      println("\nSe encontraron temperaturas fuera del rango permitido.")
    } else {
      println("\nTodas las temperaturas están dentro del rango permitido.")
    }

    fuerasDeRango
  }

}

// Punto de entrada para ejecutar la función
@main def ejecutar(): Unit = {
  val listaTemperaturas = List(5, 12, 25, 42, 30)
  grados.verificartemperatura(listaTemperaturas)
}

   