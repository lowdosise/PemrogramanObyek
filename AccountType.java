public enum AccountType {
    SAVINGS, CREDIT, DEPOSIT;

    @Override
    public String toString() {
        switch (this) {
            case SAVINGS: return "Akun Tabungan (Savings)";
            case CREDIT:  return "Akun Kredit (Credit)";
            case DEPOSIT: return "Akun Deposito Berjangka (Deposit)";
            default:      return super.toString();
        }
    }
}
