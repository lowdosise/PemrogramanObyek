
public class Account {
    private AccountType type;
    public Account(AccountType type) { this.type = type; }
    public AccountType getType() { return type; }

    public static void main(String[] args) {
        for (AccountType t : AccountType.values()) {
            Account acc = new Account(t);
            System.out.println(acc.getType().name() + " -> " + acc.getType().toString());
        }
    }
} 
    
