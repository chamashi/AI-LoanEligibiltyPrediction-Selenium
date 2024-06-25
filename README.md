# Loan Eligibility Application Selenium Tests

This repository contains Selenium-based automated tests for the Loan Eligibility Application, which is built using Flask for the backend and a frontend hosted on `localhost:3000`.

## Test Files

### `loan.java`

This test file contains the following tests for the login functionality:

1. **InvalidLogin**: Tests if a user can log in with incorrect credentials.
2. **NotRegisteredLink**: Tests the "Not Registered yet?" link on the login page.

### `register.java`

This test file contains the following tests for the registration and login functionality:

1. **ValidReg**: Tests if a user can register with valid credentials.
2. **ValidLogin**: Tests if a user can log in with correct credentials after registration.

### `Predict.java`

This test file contains a single test that fills out and submits a loan prediction form:

1. **Prediction**: Tests filling out the loan prediction form with various input fields and submitting it.

## Setup and Execution

### Prerequisites

- Java JDK
- Maven
- ChromeDriver
- TestNG
- Selenium WebDriver
- Chrome browser


