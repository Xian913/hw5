import java.net.*;

public class URLExample {
    public static void main(String[] args) {
        try {
            // 创建 URL 对象
            URL url = new URL("https://www.example.com");

            // 获取 URL 的各个部分
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}