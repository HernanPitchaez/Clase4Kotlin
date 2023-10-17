package com.example.clase4

abstract class Persona (
    private val nombre: String,
    private val edad: Int,
)
{
    abstract fun obtenerNombre(adulto: Adulto): String

    abstract fun obtenerEdad(): String
}