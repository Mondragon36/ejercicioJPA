package co.edu.eam.disenosoftware.ejercicioJPA.models

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "tbl_libro")
data class Book(

    @Column(name = "codigo_libro")
    val codigo_libro: Long,

    @Column(name = "isbn_libro")
    val isbn_libro: String,

    @Column(name = "nombre_libro")
    val nombre_libro: String,

    @ManyToOne
    @JoinColumn(name = "id_editorial")
    val publiser: Publisher,
):Serializable
