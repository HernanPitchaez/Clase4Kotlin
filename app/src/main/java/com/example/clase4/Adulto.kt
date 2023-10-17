package com.example.clase4

class Adulto (
    private val nombre: String,
    private val edad: Int,
    private val profesion: String,
    private val estadoCivil: EstadoCivil
): Persona(nombre, edad), AccionesAdutos, Acciones
{
    //Los metodos override vienen de una clase abstracta o de una interface
    //Son metodos que tuve que agregar
    override fun obtenerNombre(adulto: Adulto): String {
        return "Mi nombre es:  ${this.nombre}"
    }

    override fun obtenerEdad(): String {
        return "Mi edad es: ${this.edad} años"
    }
    fun obtenerProfesion(): String{
        return "Mi profesion es:  ${this.profesion}"
    }

    enum class EstadoCivil {
        CASADO, SOLTERO, DIVORCIADO, CONYUGE, VIUDO
    }

    override fun trabajando(): String {
        return "Estoy trabajando"
    }

    override fun estudiar(): String {
        return "Estoy estudiando"
    }
}