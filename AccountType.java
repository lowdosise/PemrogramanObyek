public enum AccountType {
    SAVINGS("SA", 0.03), 
    CREDIT("CR", 0.12), 
    DEPOSIT("DEP", 0.05);

    private String code;
    private double interestRate;


    private AccountType(String code, double interestRate) {
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode() {
        return code;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        switch (this) {
            case SAVINGS: return "Akun Tabungan (Savings)";
            case CREDIT: return "Akun Kredit (Credit)";
            case DEPOSIT: return "Akun Deposito Berjangka (Deposit)";
            default: return super.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Daftar Jenis Akun Bank ===");
        
        for (AccountType acc : AccountType.values()) {
            System.out.println("Nama : " + acc);
            System.out.println("Kode : " + acc.getCode());
            System.out.println("Bunga: " + (acc.getInterestRate() * 100) + "%");
            System.out.println("--------------------------------");
        }
    }
}
