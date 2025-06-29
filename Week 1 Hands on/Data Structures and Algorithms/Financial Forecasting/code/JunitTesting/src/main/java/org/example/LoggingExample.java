package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class demonstrates logging of error and warning messages using SLF4J with Logback.
 */
public class LoggingExample {

    // Initialize the Logger instance
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        // Log an error message
        logger.error("This is an error message");

        // Log a warning message
        logger.warn("This is a warning message");
    }
}
