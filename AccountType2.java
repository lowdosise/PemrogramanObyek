enum AccountType2 {
    SAVINGS("SA", 0.02),
    CREDIT("CR", 0.15),
    DEPOSIT("DP", 0.05);

    private String code;
    private double interestRate;

    private AccountType2(String code, double interestRate) {
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode() { return code; }
    public double getInterestRate() { return interestRate; }

    public static void main(String[] args) {
        for (AccountType2 type : AccountType2.values()) {
            System.out.println("Nama: " + type.name() + 
                               "  Kode: " + type.getCode() + 
                               "  Bunga: " + (type.getInterestRate() * 100) + "%");
        }
    }
}