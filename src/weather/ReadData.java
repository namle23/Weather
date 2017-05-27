//package weather;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.util.ArrayList;
//
//public class ReadData {
//
//    ArrayList<String> listTime = new ArrayList<String>();
//
//    public void readData() {
//        String[] parts;
//        try {
//            for(Date d:collection)
//            URL url = new URL("https://www.wunderground.com/history/airport/EFVA/" + yearValue.getText() + "/" + monthValue.getText() + "/" + dayValue.getText()
//                    + "/DailyHistory.html?req_city=Vaasa+Airport&req_state=&req_statename=Finland&reqdb.zip=00000&reqdb.magic=&reqdb.wmo=&format=1"
//            );
//            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
//            String line;
//            while ((line = in.readLine()) != null) {
//                //System.out.println(line);
//                parts = line.split(",");
//                for (int i = 1; i < parts.length; i++) {
//                    System.out.println(parts[1]);
//                }
//            }
//            in.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        ReadData r = new ReadData();
//        r.readData();
//    }
//}
