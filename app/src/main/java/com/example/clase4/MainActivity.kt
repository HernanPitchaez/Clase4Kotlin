package com.example.clase4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adulto = Adulto("Hernan", 38, "Analista de Sistemas", estadoCivil = Adulto.EstadoCivil.SOLTERO)
        //El toast es un msj que sale en medio de la pantalla del telefono parecido al console de javascript
        //Se utiliza para msj cortos, como avisos, ya que se muestra el msj y despues desaparece
        Toast.makeText(this, adulto.obtenerNombre(adulto), Toast.LENGTH_LONG).show()
        //Cuando hacemos referencia del context: this, es por que trabaja en el mismo contexto de trabajo
    }
}