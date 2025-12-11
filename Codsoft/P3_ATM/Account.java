 class Account {
    private double Balance;

    public Account(double initialBalance){
        this.Balance=initialBalance;
    }
    public void deposit(double amount){
        Balance=Balance+amount;
    }
    public boolean withdraw(double amount){
        if(amount<=Balance){
            Balance=Balance-amount;
            return true;
        }else{
            return false;
        }
    }
    public Double getBalance(){
        return Balance;
    }
}
