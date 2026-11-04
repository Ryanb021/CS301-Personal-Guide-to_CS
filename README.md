# Personal Guide to Computer Science

This repository contains my **Personal Guide to Computer Science**. I will use this guide to keep simple notes, examples, and code that I can use for future reference.

## Week 1 – Chapter 1: Elements of Programming

### 1.1 – Your First Program

This section introduces the basic structure of a Java program, the `main()` method, printing output, and how to compile and run a Java program.

### 1.2 – Built-in Types of Data

This section introduces basic types of data used in Java, including:

- Strings
- Integers
- Floating-point numbers
- Variables
- Expressions

### 1.3 – Conditionals and Loops

This section introduces how programs make decisions and repeat instructions using:

- `if` statements
- `if-else` statements
- `while` loops
- `for` loops

### 1.4 – Arrays

This section introduces how arrays are used to store multiple values of the same type. It includes:

- Creating arrays
- Accessing values using indexes
- Finding the length of an array
- Using loops with arrays
- Two-dimensional arrays
- Using nested loops with two-dimensional arrays

### 1.5 – Input and Output

This section introduces how Java programs receive input and display output. It includes:

- Standard output using System.out.print() and System.out.println()
- Standard input using Scanner
- Reading integers and decimal numbers
- Redirection
- Piping

## Week 3 - Chapter 2: Functions and Modules

### 2.1 – Defining Functions

This section introduces how to create and use methods in Java. It includes:

- Static methods
- Implementing mathematical functions
- Using static methods to organize code
- Passing arguments to methods
- Returning values from methods

### 2.2 – Libraries and Clients

This section introduces how to reuse methods from other classes and organize programs into smaller parts. It includes:

- Using static methods in other programs
- Creating and using libraries
- Generating random numbers
- Input and output for arrays
- Iterated function systems
- Basic statistics
- Modular programming

### 2.3 Recursion

This section introduces how a Java method can call itself to solve smaller problems. It includes:

- Writing a first recursive program
- Understanding base cases and recursive calls
- Mathematical induction
- Euclid's algorithm
- Function-call trees
- Gray codes
- Dynamic programming

### 2.4 Case Study: Percolation

This section introduces how percolation works using a simple Java program.

Java Program: Percolation.java

The program uses a two-dimensional array to represent a grid of open and blocked cells. It checks whether water can travel from the top of the grid to the bottom through connected open cells.

The program includes:

- Two-dimensional boolean arrays
- Nested for loops
- if statements
- Recursive methods
- Checking neighboring cells
- Tracking visited cells
- Displaying whether the grid percolates

## Week 4 - Chapter 3: Object-Oriented Programming

### 3.1 – Using Data Types

This section introduces how Java uses different data types and objects to store and process information. It includes the following Java programs:

- Dog.java – Creates an object and calls an instance method.
- DNAExample.java – Counts characters in a DNA sequence.
- ColorExample.java – Creates a color using RGB values.
- FileExample.java – Writes information to a text file.
- ReferenceExample.java – Demonstrates how reference variables work.

### 3.2 – Creating Data Types

This section introduces how to create custom data types using Java classes. It includes the following Java programs:

- Student.java – Creates a student object using a constructor.
- StopwatchExample.java – Measures how long a program takes to run.
- HistogramExample.java – Counts how often numbers appear.
- TurtleExample.java – Demonstrates basic movement using coordinates.
- ComplexExample.java – Displays a complex number.
- MandelbrotExample.java – Performs calculations using complex numbers.
- SalesExample.java – Calculates the total cost of a purchase.

### 3.3 – Designing Data Types

This section introduces how to design Java classes that are organized, reusable, and easy to understand. It includes the following Java programs:

- CalculatorAPI.java – Demonstrates a simple API.
- BankAccount.java – Uses encapsulation to protect data.
- ImmutableExample.java – Demonstrates immutable strings.
- VectorExample.java – Calculates the length of a vector.
- AnimalExample.java – Demonstrates interfaces.
- InheritanceExample.java – Demonstrates inheritance.
- DataMiningExample.java – Calculates an average.
- ContractExample.java – Checks method arguments.

### 3.4 – Case Study: N-Body Simulation

This section introduces how computer programs can simulate the movement of objects. It includes the following Java program:

- NBodyExample.java - A Java program that demonstrates basic movement by updating an object's position over time.

## Week 5 - Chapter 4: Algorithms and Data

### 4.1 – Performance

This section introduces how to measure and understand the performance of algorithms. It includes the following Java programs:

- PerformanceExample.java – Measures program execution time.
- LinearExample.java – Demonstrates linear processing.
- MemoryExample.java – Demonstrates array memory usage.

### 4.2 – Sorting and Searching

This section introduces algorithms used to find and organize information. It includes the following Java programs:

- BinarySearchExample.java – Searches a sorted array.
- InsertionSortExample.java – Sorts numbers using insertion sort.
- MergeSortExample.java – Sorts numbers using mergesort.
- FrequencyExample.java – Counts how often numbers appear.

### 4.3 – Stacks and Queues

This section introduces data structures used to store and process information. It includes the following Java programs:

- StackExample.java – Demonstrates stack operations.
- ArrayStackExample.java – Creates a stack using an array.
- LinkedListExample.java – Demonstrates linked lists.
- ResizingArrayExample.java – Uses a resizing array.
- GenericExample.java – Demonstrates generics.
- QueueExample.java – Demonstrates FIFO queues.
- PrintQueueExample.java – Processes printing jobs.

### 4.4 – Symbol Tables

This section introduces how programs store and retrieve information using keys and values. It includes the following Java programs:

- SymbolTableExample.java – Stores key-value pairs.
- ClientExample.java – Uses a symbol table.
- SimpleSymbolTable.java – Searches keys using arrays.
- HashTableExample.java – Demonstrates hash tables.
- BSTExample.java – Uses an ordered tree map.
- OrderedTableExample.java – Demonstrates ordered operations.
- SetExample.java – Stores unique values.

### 4.5 – Case Study: Small-World Phenomenon

This section introduces graphs and how they represent connections between objects. It includes the following Java programs:

- GraphExample.java – Creates a simple graph.
- ShortestPathExample.java – Finds shortest paths using BFS.

## Week 6 - Chapter 5: Theory of Computing

### 5.1 – Formal Languages

This section introduces how computers recognize patterns and process strings. It includes the following Java programs:

- RegularLanguageExample.java – Recognizes binary patterns.
- RegexExample.java – Uses regular expressions.
- EmailPatternExample.java – Checks a basic email pattern.
- DFAExample.java – Demonstrates a finite automaton.
- NFAExample.java – Demonstrates nondeterminism.
- KleeneExample.java – Recognizes a regular language.
- PatternExample.java – Validates a text pattern.

### 5.2 – Turing Machines

This section introduces Turing machines and how they represent computation. It includes the following Java programs:

- TuringMachineExample.java – Demonstrates reading and writing tape symbols.
- UniversalMachineExample.java – Demonstrates interpreting simple instructions.

### 5.3 – Universality

This section introduces how general-purpose computers can perform different computations. It includes the following Java programs:

- AlgorithmExample.java – Demonstrates a simple algorithm.
- InterpreterExample.java – Processes a basic instruction.

### 5.4 – Computability

This section introduces what computers can and cannot solve using algorithms. It includes the following Java programs:

- InfiniteLoopExample.java – Demonstrates a nonterminating loop.
- ReductionExample.java – Demonstrates a simple problem transformation.

### 5.5 – Intractability

This section introduces problems that can be difficult to solve efficiently. It includes the following Java programs:

- ExponentialExample.java – Demonstrates exponential growth.
- SATExample.java – Finds a satisfying Boolean assignment.
- SearchProblemExample.java – Searches for number combinations.
- PolynomialReductionExample.java – Demonstrates a simple problem transformation.
- SubsetSumExample.java – Searches for numbers that reach a target.
- VerifySolution.java – Checks a proposed solution.
- GreedyExample.java – Demonstrates a greedy approach.

## Week 7 - Chapter 6: A Computing Machine

### 6.1 – Representing Information
In progress.

### 6.2 – TOY Machine
In progress.

### 6.3 – Machine-Language Programming
In progress.

### 6.4 – TOY Virtual Machine
In progress.

## Purpose

The purpose of this repository is to create a simple computer science reference that I can continue adding to as I learn new concepts.