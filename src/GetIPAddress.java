import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPAddress {

	@SuppressWarnings("unused")
	private static void main (String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getLocalHost();
		System.out.println(ip);dsds
	}
}
