import java.net.*;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            // 获取本机的 InetAddress 对象
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host: " + localHost);

            // 获取指定主机的 InetAddress 对象
            InetAddress google = InetAddress.getByName("www.google.com");
            System.out.println("Google IP Address: " + google.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}