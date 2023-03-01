package org.example;

public class DnsServer {
    String ip1;
    String ip2;

    public DnsServer(String ip1, String ip2) {
        this.ip1 = ip1;
        this.ip2 = ip2;
    }

    @Override
    public String toString() {
        return "DnsServer: \n" +
                "ip_1: " + ip1 + "\n" +
                "ip_2: " + ip2 ;
    }
}
