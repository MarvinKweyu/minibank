import java.util.HashMap;

// ? bank should extend account
// TODO: WIP program
class Account {
    /*
     * Contains methods that affect the bank account in question
     * 
     */
    int accountNumber;
    String accountHolder;
    double balance;

    // default contructor
    Account(int accountId, String holderName) {
        accountNumber = accountId;
        accountHolder = holderName;
        balance = 0;
    }

    Account(int accountId, String holderName, double deposit) {
        accountNumber = accountId;
        accountHolder = holderName;
        balance = deposit;
    }

    HashMap<String, String> showAccountDetail() {
        HashMap<String, String> accountDetails = new HashMap<String, String>();
        accountDetails.put("account number", Integer.toString(accountNumber));
        accountDetails.put("account holder", accountHolder);
        accountDetails.put("account balance", String.valueOf(balance));

        return accountDetails;

    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

}

class StateBank extends Account {
    /*
     * Contains the bank information including bank name, branch details(name,
     * location) for a Bank of a given State/ county
     */

    String bankName, branchName, location;

    // declare default constructor
    StateBank(int accountId, String holderName) {
        super(accountId, holderName);
        bankName = "Bank of Africa";
        branchName = "Africanus";
        location = "Kenya";
    }

    StateBank(String name, String branch, String loc, int accountId, String holderName) {
        super(accountId, holderName);
        bankName = name;
        branchName = branch;
        location = loc;

    }

    void getAccountDetails(int accountId) {

    }

}

public class miniBank {
    /*
     * displays the menu and performs operations on the Account
     */

}
