package weather;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class WeatherCollection {

    private ArrayList<String> data = new ArrayList<>();

    public ArrayList<String> getData() {
        return data;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }

    public void writeToFile(String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            BufferedWriter bf = new BufferedWriter(writer);

            for (String s : data) {
                bf.write(s);
            }
            bf.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
    }

    public void readFromFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bf = new BufferedReader(reader);

            String line = bf.readLine();
            System.out.println(line);
            while (line != null) {
                data.add(bf.readLine());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
    }
}
