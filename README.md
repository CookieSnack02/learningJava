# Java Learning Journey

This repository documents my progress in learning the Java programming language. It contains implementations of mathematical algorithms and exercises focused on Object-Oriented Programming (**OOP**) concepts.

## 📚 Study Reference
The code and concepts applied here are based on the study of **"Java: The Complete Reference"** by _Herbert Schildt_.

### Chapter 1 

#### History of the Java language
**Java** emerged as an heir to the C and C++ languages.

The **C** language was created to be efficient and replace assembly language in systems development. The C language was a watershed moment in conquering the space between abandoning one language in favor of another; for example, **FORTRAN** was used to write scientific programs efficiently, but it wasn't good for coding systems. **BASIC** was easy to learn, but not very powerful. **Assembly** was the high-level production language for programs, but it wasn't easy to learn or very efficient.

The **C++** language was created to meet the needs of C in the 1980s. The word that defines the creation of the C++ language is complexity. Complexity was what led to its creation, mainly due to the necessary modularity resulting from large lines of code for the programmer to work with; thus, the external language of object-oriented programming was created.

Java, on the other hand, was created in **1991** by _Sun Microsystems_, Inc. with the intention of fulfilling another apparent need: **platform independence**.

Java changed the internet by solving problems such as portability and security. However, Java was always created with the idea of ​​embedded systems in mind, that is, the _Internet of Things_ (IoT) technology, later leading to the slogan: _Write Once, Run Anywhere_.

## 🚀 Projects & Algorithms

### Zeller's Congruence Implementation
A Java program that calculates the day of the week for any given date using **_Zeller's Congruence_** formula.

**Key Logic:**
- **Input:** Takes day, month, and year from the user via `Scanner`.
- **Algorithm:** Adjusts the formula for the Gregorian calendar (treating January and February as months 13 and 14 of the previous year).
- **Output:** Returns the specific day of the week (e.g., Saturday, Sunday, Monday).

