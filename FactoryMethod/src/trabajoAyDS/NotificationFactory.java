package trabajoAyDS;

public class NotificationFactory {
	/**
	 * Retorna un constructor de clase.
	 * @param servicio un mensaje o cadena ("EMAIL" o "SLACK" o "WHATSAPP")
	 * @return un constructor de clase.
	 */
	public Notification crearNotificaction(String servicio) {
		switch (servicio) {
		case "EMAIL":
			return new EmailNotification(); // referencia a EmailNotification()
		case "SLACK":
			return new SlackNotification(); // referencia a SlackNotification()
		case "WHATSAPP":
			return new WhatsAppNotification(); // referencia a WhatsAppNotification()
		default:
			throw new IllegalArgumentException ("No se conoce el servicio " + servicio);
		}
	}
}
