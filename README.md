# Bank Management System

A simple console-based bank management system built in Java that allows users to perform basic banking operations.

## Features

- **Account Creation**: Create a new account with account holder name
- **Deposit Money**: Add funds to your account
- **Withdraw Money**: Withdraw funds from your account (with insufficient balance check)
- **View Balance**: Check current account balance
- **Transaction History**: View all deposit and withdrawal transactions
- **User-friendly Menu**: Interactive console menu for easy navigation

## Project Structure

```
src/
└── com/elevateLabs/
    ├── Account.java          # Account class with banking operations
    └── BankManagement.java   # Main class with user interface
```

## Classes Overview

### Account.java
- **Purpose**: Handles all account-related operations
- **Key Methods**:
  - `deposit(double amount)`: Adds money to account
  - `withdraw(double amount)`: Withdraws money from account
  - `getBalance()`: Displays current balance
  - `TransactionHistory()`: Shows all transactions
- **Data Members**:
  - `accountHolder`: Name of the account holder
  - `balance`: Current account balance
  - `history`: ArrayList storing transaction history

### BankManagement.java
- **Purpose**: Main class providing user interface
- **Features**: Console-based menu system for user interaction

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or command line

### Running the Application

#### Using Command Line:
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd bank-management-system
   ```

2. Compile the Java files:
   ```bash
   javac com/elevateLabs/*.java
   ```

3. Run the application:
   ```bash
   java com.elevateLabs.BankManagement
   ```

#### Using IDE:
1. Import the project into your IDE
2. Run the `BankManagement.java` file

## Usage

1. **Start the Application**: Run the program and enter the account holder's name
2. **Choose Operations**: Select from the menu options:
   - `1` - Deposit money
   - `2` - Withdraw money
   - `3` - View transaction history
   - `4` - View current balance
   - `5` - Exit the application

### Sample Interaction

```
Enter the account holder name: John Doe
Welcome, John Doe

****Bank Menu****
1. Deposit
2. Withdraw
3. View trasaction history
4. View total balance
5. Exit.!
*****************

Enter the choice: 1
Enter the amount to deposite: 1000
$1000.0 Deposited

Enter the choice: 4
Total balance is 1000.0
```

## Input Validation

- **Deposit**: Only positive amounts are accepted
- **Withdrawal**: Checks for sufficient balance before processing
- **Menu**: Handles invalid menu choices gracefully

## Features in Detail

### Deposit Functionality
- Validates positive amounts only
- Updates account balance
- Records transaction in history
- Provides confirmation message

### Withdrawal Functionality
- Checks for sufficient funds
- Updates balance if funds available
- Records successful transactions
- Shows appropriate error messages

### Transaction History
- Maintains chronological record of all transactions
- Displays "No transaction yet" for new accounts
- Shows detailed transaction information

## Future Enhancements

- [ ] Add account number generation
- [ ] Implement multiple account support
- [ ] Add interest calculation
- [ ] Include account types (Savings, Checking)
- [ ] Add data persistence (file/database storage)
- [ ] Implement transfer between accounts
- [ ] Add authentication/PIN functionality

---

**Note**: This is a basic implementation intended for learning purposes. For production use, additional security measures and error handling should be implemented.
