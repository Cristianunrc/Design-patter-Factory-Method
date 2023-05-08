package trabajoAyDS;

public class EmailNotification implements Notification {
	@Override
	public void notificationUsuario() {
		System.out.println("La notificacion es por EMAIL.");
	}
}
