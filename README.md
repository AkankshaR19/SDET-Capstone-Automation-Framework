# SDET Capstone Automation Framework

## Overview

This project is a Selenium Automation Framework developed using Java, Selenium WebDriver, TestNG, Maven, and the Page Object Model (POM) design pattern.

The framework automates multiple web applications and demonstrates end-to-end test automation, reusable framework design, reporting, and test execution through TestNG suites.

---

## Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Maven
* WebDriverManager
* Extent Reports
* Git & GitHub

---

## Framework Design

The project follows the Page Object Model (POM) design pattern to improve maintainability, reusability, and readability.

### Project Structure

```text
src/test/java

├── base
│   └── BaseTest.java
│
├── pages
│   ├── GUI Element Pages
│   ├── ParaBank Pages
│   └── BlazeDemo Pages
│
├── testcases
│   ├── GuiElementsTest.java
│   ├── ParaBankRegistrationTest.java
│   └── BlazeDemoTest.java
│
├── utilities
│   └── WaitUtils.java
│
├── reports
│   └── ExtentManager.java
│
└── listeners
    └── TestListener.java
```

---

## Automated Scenarios

### 1. GUI Elements Automation

Automated various web elements and user interactions including:

* Text Fields
* Radio Buttons
* Checkboxes
* Dropdowns
* Date Pickers
* File Uploads
* Alerts
* New Tab Handling
* Popup Window Handling
* Mouse Hover
* Double Click
* Drag and Drop
* Slider
* Pagination Table
* Wikipedia Search
* Dynamic Button
* Laptop Links
* Footer Links
* Broken Links Validation
* Shadow DOM Elements

---

### 2. ParaBank User Registration and Login

Automated the complete user registration and login workflow:

* User Registration
* Dynamic Username Generation
* Registration Verification
* Logout
* Login Using Registered Credentials
* Login Verification

---

### 3. BlazeDemo Flight Booking

Automated the end-to-end flight booking process:

* Select Departure City
* Select Destination City
* Search Flights
* Choose Flight
* Enter Passenger Details
* Enter Payment Details
* Purchase Flight
* Verify Booking Confirmation

---

## Framework Features

* Page Object Model (POM)
* Reusable Page Classes
* Base Test Setup
* TestNG Integration
* Extent Report Generation
* WaitUtils for Reusable Scrolling Operations
* Test Suite Execution using testng.xml
* Git Version Control

---

## Reporting

Execution reports are generated using Extent Reports.

```text
test-output/
└── ExtentReport.html
```

The report includes:

* Test Execution Summary
* Pass/Fail Status
* Execution Time
* Test Details

---

## How to Execute

1. Clone the repository.
2. Import as a Maven Project.
3. Update Maven Dependencies.
4. Open `testng.xml`.
5. Run as **TestNG Suite**.

---

## Test Execution

The framework executes the following test suites:

* GUI Elements Automation
* ParaBank Registration and Login
* BlazeDemo Flight Booking

All tests can be executed together using the TestNG suite file.

---

## Author

Akanksha Rath

SDET Automation Testing Capstone Project
