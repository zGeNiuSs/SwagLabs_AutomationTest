# Test Automation for Swag Labs

🛠 Automated testing for Swag Labs website

📢 This repository contains an automated testing project for Swag Labs using Java, Cucumber, BDD, Selenium, Gherkin, ChromeDriver, JUnit 4, Maven, and IntelliJ IDEA. The tests are designed to cover various scenarios on the Sauce Demo website (https://www.saucedemo.com).

## Table of Contents
- [Introduction](#introduction)
- [Scope](#scope)
- [Features](#features)
- [Tools and Technologies Used](#tools-and-technologies-used)
- [Test Cases](#test-cases)
- [Installation](#installation)
- [Usage](#usage)


## Introduction
Test automation is the process of using software tools and frameworks to automate test execution, compare actual outcomes to expected outcomes, and generate test reports. This helps to increase efficiency, accuracy, and repeatability of testing processes, as well as reducing the time and costs associated with manual testing.

In this project, we are going to test SWAG Labs (Sauce Demo - https://www.saucedemo.com). We are going to use tools and frameworks like Cucumber BDD (Behavior-driven development) with Selenium for the automation. This project focuses on automating tests for the Swag Labs website using Cucumber BDD and Selenium.

Sure, here's an improved version of the scope section without using the terms "negative" or "happy" scenarios:

---

## Scope
The project covers the following areas of the Swag Labs website:
- **Login Page**: Testing for all accepted users and error scenarios.
- **Product Page**: Including sorting features, product detailed view, and verifying the accuracy of product images.
- **Cart Page**: Testing functionalities for adding and removing items, and ensuring the cart behaves as expected.
- **Checkout Process**: Ensuring the checkout process works correctly, including handling various user inputs and scenarios.

## Features
- Utilizes Cucumber for behavior-driven development (BDD) to write tests in a human-readable format.
- Uses Selenium for interacting with web elements and performing automated actions.
- Organizes test scenarios using Gherkin syntax.
- Includes a wide range of test cases covering login, product features, cart functionality, and more.
- Provides easy-to-understand bug reports and test outcomes.

## Tools and Technologies Used
This test automation project for Swag Labs utilizes a variety of tools and technologies to streamline the testing process and ensure efficient and accurate results.
- **Java**: The primary programming language used for writing the test automation code.
- **Cucumber**: A Behavior-Driven Development (BDD) tool that allows writing test scenarios in a human-readable format.
- **Selenium**: A popular open-source framework for automating web browser interactions and testing.
- **Gherkin**: A plain-text language that uses keywords to define test scenarios in a structured way, making them easy to read and understand.
- **ChromeDriver**: The WebDriver implementation for Google Chrome, enabling Selenium to automate Chrome browser actions.
- **JUnit 4**: A widely-used testing framework for Java applications, used to run and manage test cases.
- **Maven**: A build and dependency management tool that simplifies project setup and maintenance.
- **IntelliJ IDEA**: An integrated development environment for Java that provides a workspace for coding, testing, and debugging.

These technologies are combined to create an effective testing framework that automates test cases, performs comparisons between expected and actual outcomes, and generates detailed test reports.

## Test Cases
The test cases are written in the Gherkin syntax, which offers a clear representation of the test scenarios. Each test case covers various aspects of the Swag Labs website, ensuring comprehensive coverage.

![image](https://github.com/zGeNiuSs/SwagLabs_AutomationTest/assets/72147140/8f5e9cd7-e4b0-4cc9-b845-49cc02921f92)


## Installation
Ensure that you have the following tools and technologies installed on your machine:
- Java
- Maven
- IntelliJ IDEA
- Selenium
- Cucumber
- ChromeDriver

Note: Make sure to download the relevant ChromeDriver version for your Chrome browser match, and put it in the ChromeDriver folder, and set the relevant path in the `resources` file.

## Usage
1. Open the project in IntelliJ IDEA or your preferred IDE.
2. Navigate to the `src/test/java/runner` directory.
3. Locate the runner file with the `.java` extension.
4. Run the test files using JUnit to execute the automated test scenarios.


