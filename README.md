# Java Fundamentals Playground

A personal repository for learning and practicing Java core concepts, following the "Java In-Depth" tutorial series.

## Project Structure

The project is organized into the following directories:

*   **`classes/`**: Contains core logic and basic demonstrations.
    *   `Basic.java`: Demonstrates naming rules, case sensitivity, console printing, and basic arithmetic operations.
    *   `Student.java`: An introduction to objects, fields, and instance methods.
    *   `CurrencyConverter.java`: Demonstrates variable naming conventions and default field values using various world currencies.

*   **`examples/`**: Contains standalone examples.
    *   `HelloWorld.java`: The classic introductory program.

## How to Run

Since these are single-file Java programs, you can run them directly using the `java` command (Java 11+ required).

### Running Basic.java
```bash
cd classes
java Basic.java
```

### Running Student.java
```bash
cd classes
java Student.java
```

### Running CurrencyConverter.java
```bash
cd classes
java CurrencyConverter.java
```


### Running HelloWorld.java
```bash
# Note: This file uses a package declaration
java examples/HelloWorld.java
```

## Key Concepts Covered

1.  **Naming Rules**: Valid identifiers (letters, `$`, `_`) and reserved keywords.
2.  **Case Sensitivity**: Understanding that `id` and `ID` are different in Java.
3.  **Console I/O**: Using `System.out.println()` vs `System.out.print()`.
4.  **Arithmetic**: Basic operators (`+`, `-`, `*`, `/`, `%`).
5.  **OOP Basics**: Creating classes, instantiating objects, and calling methods.
