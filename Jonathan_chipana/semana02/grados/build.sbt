ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.3.4" // Versión estable recomendada de Scala 3

lazy val root = (project in file("."))
  .settings(
    name := "grados",
    
    // Aquí se colocan las librerías que usará tu proyecto
    libraryDependencies ++= Seq(
      // MUnit: Librería estándar para hacer pruebas (Unit Testing)
      "org.scalameta" %% "munit" % "1.0.0" % Test
    )
  )