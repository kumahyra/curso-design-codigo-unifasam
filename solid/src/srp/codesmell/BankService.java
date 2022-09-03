package srp.codesmell;

public class BankService {
	public long deposit(long amount, String accountNo) {
		// depósito valor
		return 0;
	}

	public long withDraw(long amount, String accountNo) {
		// retirar valor
		return 0;
	}

	public void printPassbook() {
		// atualiza as informações da transação na caderneta
	}

	public void getLoanInterestInfo(String loanType) {
		if (loanType.equals("homeLoan")) {
			//faz algum trabalho
		}
		if (loanType.equals("personalLoan")) {
			//faz algum trabalho
		}
		if (loanType.equals("car")) {
			//faz algum trabalho
		}
	}

	public void sendOTP(String medium) {
		if (medium.equals("email")) {
            // escreve a lógica relacionada ao email 
            // usa JavaMailSenderAPI
		}
	}
}
