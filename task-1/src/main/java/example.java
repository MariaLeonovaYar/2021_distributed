
import java.net.*;
import java.util.*;

public class example {
    public static void main(String[] args) throws SocketException {
        ArrayList<NetworkInterface> interfaces = Collections.list(NetworkInterface.getNetworkInterfaces());
        for (NetworkInterface iface : interfaces) {
            System.out.println("Interface name: " + iface.getName());

            System.out.println("Mac address: " + iface.getHardwareAddress());

            ArrayList<InetAddress> ip = Collections.list((iface.getInetAddresses()));
            for (InetAddress x : ip) {
                System.out.println("Ip address: " + x.getHostAddress());
            }

        }
    }
}
