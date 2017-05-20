package weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class ReadData {

    String address;

    Scanner scan = new Scanner(System.in);

    public void readData() {
        System.out.print("Enter date: ");
        address = scan.nextLine();

        try {
            URL url = new URL("https://www.wunderground.com/history/airport/EFVA/" + address + "/DailyHistory.html?req_city=Vaasa+Airport&req_state=&req_statename=Finland&reqdb.zip=00000&reqdb.magic=&reqdb.wmo=&format=1");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ReadData r = new ReadData();
        r.readData();
    }
}