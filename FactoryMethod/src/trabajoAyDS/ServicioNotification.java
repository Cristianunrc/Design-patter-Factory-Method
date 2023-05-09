package trabajoAyDS;

public class ServicioNotification {
	public static void main(String[] args) {
		NotificationFactory nf = new NotificationFactory();
		Notification n = nf.crearNotificaction("WHATSAPP"); // new WhatsAppNotification();
		n.notificationUsuario(); // invoca al metodo de WhatsAppNotification()
	}
}
