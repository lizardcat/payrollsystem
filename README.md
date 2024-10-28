# Payroll System

## Project Overview

This payroll system is a class project built using **Java** for the backend, **JavaFX** for the graphical user interface, and **Oracle Apex** for the database. It is designed to manage employee payroll and provide functionalities for multiple actors, including Employees, Administrators, Human Resources, and Finance. This project is also intended to serve as a learning experience in Java and associated technologies.

## Technologies Used

- **Java** (Backend Logic)
- **JavaFX** (Graphical User Interface)
- **Oracle Apex** (Database)
- **IntelliJ IDEA** (Development Environment)
- **GitHub** (Version Control)

## Project Structure

The project uses a structured package organization as follows:

```
src
└── com
    └── payrollsystem
        ├── models         # Data classes (Employee, Position, Payroll, TaxBracket)
        ├── controllers    # Controllers to manage input and logic
        ├── services       # Core business logic (e.g., PayrollService)
        ├── database       # Database connections and operations
        ├── views          # JavaFX UI components and main entry point
        └── utils          # Helper classes, constants
```

## Features

### Actors and Their Roles

- **Employee**:
  - Input hours worked.
  - View and update personal information (e.g., bank details, KRA PIN, contact info).
  - View salary information, calculate net pay, and print payslips.
  - Log out of the system.

- **Administrator**:
  - Manage tax brackets, set tax rates, and confirm employee roles.
  - Generate overall payroll reports and manage salary structures.

- **Human Resources**:
  - Define employment positions, hourly rates, and basic salaries.
  - Add or remove employees and generate employee reports.

- **Finance**:
  - Handle payroll calculations, including PAYE tax.
  - Generate financial reports and manage benefits and deductions.

### Payroll Calculations

- **Gross Pay**: Based on basic salary and hours worked.
- **Deductions**: Including taxes (PAYE), loans, retirement contributions, and healthcare deductions.
- **Net Pay**: Calculated by applying tax brackets and statutory deductions.

## Setup Instructions

### Prerequisites

1. **Java**: Ensure you have Java JDK 17 or later installed.
2. **JavaFX**: Download and set up the JavaFX SDK.
3. **Oracle Apex**: Install Oracle Apex for database management.
4. **Git**: Install Git for version control, and clone this repository.

### Project Setup in IntelliJ

1. **Clone Repository**: Clone the GitHub repository and open it in IntelliJ.
2. **Set Up Project SDK**: Go to `File > Project Structure > Project SDK` and select the Java JDK.
3. **Add JavaFX Library**:
   - Go to `File > Project Structure > Libraries`, add the path to the JavaFX SDK.
4. **Configure JavaFX VM Options**:
   - Go to `Run > Edit Configurations` and add:
     ```
     --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml
     ```
5. **Set Up Database**:
   - Configure `DatabaseConnector.java` in the `database` package to connect to Oracle Apex.

## Usage

1. **Run the Application**:
   - Use the `Main.java` class in the `views` package to start the application.
2. **Log In**:
   - Log in with the appropriate user role to access different functionalities.
3. **Use Functionalities**:
   - Each role (Employee, Admin, HR, Finance) has access to specific features like payroll calculation, report generation, and employee management.

## Future Enhancements

- Expand payroll calculation functionalities to include more detailed reporting.
- Add role-based authentication for better security.
- Enhance the user interface with JavaFX custom controls.

## Contributing

If you’d like to contribute, please fork the repository, create a feature branch, and submit a pull request. All contributions are welcome!
