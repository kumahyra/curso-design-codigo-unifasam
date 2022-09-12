package osp.codesmell;

public class NotificationService {
	public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //escreve a lógica relacionada ao e-mail 
            // usa JavaMailSenderAPI
        }
        if (medium.equals("sms")) {
            //escreve a lógica relacionada ao e-mail 
            // usa JavaMailSenderAPI
        }
    }
}
