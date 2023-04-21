package com.example.demo.persistence.entity

import jakarta.persistence.*;


@Entity
@Table(name = "books")
class BookEntity {
    @get:GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Id
    var id: Long = 0

    @get:Column(name = "name", nullable = false)
    var name: String? = null

    @get:Column(name = "author", nullable = false)
    var author: String? = null

    constructor()
    constructor(name: String?, author: String?) {
        this.name = name
        this.author = author
    }

    override fun toString(): String {
        return ("Book [id=$id, name=$name, author=$author]")
    }
}