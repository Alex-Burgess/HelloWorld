# HelloWorldJava
A Hello World Java application, which demonstrates project structure and unit tests

## Requirements
The application is written for Java 9.  Java download: http://www.oracle.com/technetwork/java/javase/downloads/jre9-downloads-3848532.html

$ java --version
java 9.0.4
Java(TM) SE Runtime Environment (build 9.0.4+11)

Junit 5 is also required: https://junit.org/junit5/

## Basic Configuration
The classpath file (.classpath) contains references to the Java 9 JRE and Junit 5 libraries.

## Running the application
The application is mainly meant to be view from within Eclipse (or similar IDE) as a reference.  The unit tests can be run to exercise the sample code.

The application can be compiled and run locally:
1. Change to the source file location: 
```cd /Users/alexburgess/Development/HelloWorldJava/src/main
```

1. Compile the class file:
```javac Hello.java
```
1. Execute the file:
```$ cd /Users/alexburgess/Development/HelloWorldJava/src/main

$ java main/Hello
Hello World!
```
