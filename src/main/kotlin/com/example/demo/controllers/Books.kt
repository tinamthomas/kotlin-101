package com.example.demo.controllers

import com.example.demo.services.BooksService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Books (private val bookService: BooksService) {
    @GetMapping("/")
    fun index(): String {
        return bookService.getBooks()
    }
}