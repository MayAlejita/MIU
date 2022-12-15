package pencil_3;

public class CheckStatus {
	private double balance;
	private double recentPayment;
	private boolean phoneIsDisconnected;

	boolean checkStatus() {
		if (balance < 200.00 || hasOverdueFines() 
				|| (recentPayment < 30.00 && phoneIsDisconnected)) {

			notifyCollections();
			return false;
		}
		return true;
	}

	private void notifyCollections() {
		// . . .
	}

	private boolean hasOverdueFines() {
		return true;
	}

}
