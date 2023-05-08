package trabajoAyDS;

public class SlackNotification implements Notification {

	@Override
	public void notificationUsuario() {
		System.out.println("La notificacion es por SLACK.");
	}
}
