
public class Accounts {
	private int amount;
	private int number;
	private static int numberOfAccounts;
	private final static String nameOfBank = "Super bank";
		
		public Accounts() {
			
			this.number = numberOfAccounts;
			numberOfAccounts++;
		}
		public void deposit(int amount) {
			this.amount += amount;
		}
		public void withdraw(int amount) {
			this.amount -= amount;
		}
		public int getAmount() {
			return this.amount;
		}
		public int getNumber() {
			return this.number;
		}
		public String toString() {
		return nameOfBank + " [ Number = " + number + "/" + numberOfAccounts + ", Amount = " + amount + "]";
		}
}
