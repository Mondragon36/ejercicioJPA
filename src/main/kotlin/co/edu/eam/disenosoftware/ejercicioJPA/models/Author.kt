package co.edu.eam.disenosoftware.ejercicioJPA.models

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tbl_autor")
data class Author(

    @Id
    @Column(name = "codigo_autor")
    val codigo_autor: Long,

    @Column(name = "apellido")
    val apellido: String,

    @Column(name = "nombre")
    val nombre: String,
):Serializable
