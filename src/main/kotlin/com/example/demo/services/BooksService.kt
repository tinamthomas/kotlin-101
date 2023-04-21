package com.example.demo.services

import com.example.demo.persistence.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class BooksService {
    @Autowired
    private val bookRepository: BookRepository? = null

    public fun getBooks(): String {
        return bookRepository?.findAll().toString()
    }
}