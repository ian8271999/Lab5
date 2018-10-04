import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    public enum BankAccountType {
        /** Checkings */
        CHECKINGS,
        /** Savings. */
        SAVINGS,
        /** Student. */
        STUDENT,
        /** Workplace. */
        WORKPLACE
    }


     /** The account number. */
    private int accountNumber;
    /** The type of account. */
    private BankAccountType accountType;
    /** The balance of the account. */
    private double accountBalance;
    /** The owner's name. */
    private String ownerName;
    /** The interest rate. */
    private double interestRate;
    /** The interest earned. */
    private double interestEarned;

    /** Constructor for BankAccount class.
     *
     * @param name the name.
     * @param accountCategory the category.
     * @param balance the balance.
     * @param earned the interest earned.
     * @param number the account number.
     * @param rate the interest rate.
     */
    public BankAccount(final String name, final BankAccountType accountCategory, final int number,
                       final double balance, final double rate, final double earned) {
         ownerName = name;
         accountType = accountCategory;
         accountNumber = number;
         accountBalance = balance;
         interestRate = rate;
         interestEarned = earned;
    }
    /** gets account number. */
    public int getAccountNumber() {
        return accountNumber;
    }

}
