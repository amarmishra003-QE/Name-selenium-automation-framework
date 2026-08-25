# Selenium Java Automation Framework

An enterprise-grade, scalable Test Automation Framework built with **Selenium WebDriver**, **Java**, and **TestNG**, designed following the **Page Object Model (POM)** and **Fluent Design Pattern**.

## Key Features
* **Design Pattern:** Page Object Model (POM) with Fluent Interface for readable test scripts.
* **Synchronization:** Explicit Waits implemented via `WebDriverWait` to eliminate flakiness.
* **Encapsulation:** Locators kept strict private within Page classes.
* **Build Tool:** Apache Maven for dependency management and execution.

## Tech Stack
* **Language:** Java 17+
* **Automation Library:** Selenium WebDriver (v4.x)
* **Test Runner:** TestNG
* **Build Management:** Maven

## Project Structure
```text
src/
 ├── main/java/pages/       # Page Object classes with Fluent Pattern
 └── test/java/tests/       # Test execution scripts (TestNG)

How to Run Tests
​Clone the repository:
git clone https://github.com/amarmishra003-QE/Name-selenium-automation-framework.git
​Execute tests via Maven:
mvn clean test
