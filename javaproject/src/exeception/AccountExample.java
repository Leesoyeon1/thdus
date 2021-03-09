package exeception;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
//		try {
		account.withdraw(20000);//runtime을 상속하면 withdraw예외처리를 안해줘도됨.
//		}catch(BalanceInsufficientException e) {
//			e.printStackTrace();
//		}
		System.out.println("end of prog");
	}
}
