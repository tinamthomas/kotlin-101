package com.example.demo.persistence.repository

import com.example.demo.persistence.entity.BookEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface BookRepository : JpaRepository<BookEntity?, Long?>