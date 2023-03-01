package lt.codeacademy.learn.orai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpHelper {
    private static final String USER_AGENT = "Mozilla/5.0";
    public static String sendGET(URL url) throws IOException {
        URL obj = url;
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            if (!response.isEmpty()) System.out.println("Reading successful!");
            return response.toString();
        } else {
            System.out.println("GET request did not work.");
        }
        return null;
    }

}
