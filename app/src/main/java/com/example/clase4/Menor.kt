package com.example.clase4

class Menor(
    private val nombre: String,
    private val edad: Int,
    private val colegio: String,
    private val actividad: Actividad
): Persona(nombre, edad), Acciones, AccionesMenor
{
    override fun obtenerNombre(adulto: Adulto): String {
        return "Mi nombre es:  ${this.nombre}"
    }

    override fun obtenerEdad(): String {
        return "Mi edad es reservada"
    }

    override fun estudiar(): String {
        return "Estoy estudiando el cole"
    }

    override fun jugar(): String {
        return "Estoy jugando a ${this.actividad}"
    }
}
enum class Actividad{
    DANZA,
    FUTBOL,
    PINTURA,
    HANDBALLL,
    GUITARRA
}