package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApplication {
    public static void main(String[] args) {
        // Load the Spring Application Context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve BookService Bean from Context
        BookService bookService = (BookService) context.getBean("bookService");

        // Test Dependency Injection
        bookService.addBook("The Great Gatsby");
    }
}
