package Arrays;

    class Bank{
        String bankId;
        String bankName;
        String bankAddress;
        Account[] accounts;


        Bank(String bankId, String bankName, String bankAddress, Account[] accounts) {
            this.bankId = bankId;
            this.bankName = bankName;
            this.bankAddress = bankAddress;
            this.accounts = accounts;
        }
        public void displayBankDetails(){
            System.out.println("Bank Details");
            System.out.println("-----------------------");
            System.out.println("Bank Id       : " + this.bankId);
            System.out.println("Bank Name     : " + this.bankName);
            System.out.println("Bank Address  : " + this.bankAddress);
            System.out.println("ACCNO\tACCNAME\tACCTYPE\tACCBALANCE");
            System.out.println("----------------------------------------");
            for (Account account : accounts) {
                System.out.print(account.accountNumber+"\t");
                System.out.print(account.accountHolderName+"\t");
                System.out.print(account.accountType+"\t");
                System.out.print(account.accountBalance+"\n");
            }
        }
        public static void main(String[] args){
            Account account  = new Account("a111", "Durga", "Savings", 10000);
            Account account2 = new Account("a222", "Anil ", "Savings", 20000);
            Account account3 = new Account("a333", "Raju ", "Savings", 30000);
            Account account4 = new Account("a444", "Ramu ", "Savings", 40000);
            Account[] accounts = {account, account2, account3, account4};




            Bank bank = new Bank("B111", "ICICI Bank", "Ameerpet, Hyderabad", accounts);
            bank.displayBankDetails();
        }
    }