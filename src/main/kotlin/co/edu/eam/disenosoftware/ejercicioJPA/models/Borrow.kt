package co.edu.eam.disenosoftware.ejercicioJPA.models

import java.io.Serializable
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "tbl_prestamo")
data class Borrow(

    @Id
    @Column(name = "id")
    val id: Long,

    @Column(name = "fecha_prestamo")
    val fecha_prestamo: Date,

    @ManyToOne
    @JoinColumn(name = "id_libro")
    val book: Book,

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    val user: User,
):Serializable
