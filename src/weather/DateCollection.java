package weather;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DateCollection {

    private ArrayList<Date> dates = new ArrayList<>();

    public ArrayList<Date> getDates() {
        return dates;
    }

    public void setDates(ArrayList<Date> dates) {
        this.dates = dates;
    }

    public void writeToFile(String fileName) {
        try (ObjectOutputStream fout = new ObjectOutputStream(
                new FileOutputStream(fileName))) {
            fout.writeObject(dates);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
    }

    public void readFromFile(String fileName) {
        try (ObjectInputStream fin = new ObjectInputStream(
                new FileInputStream(fileName))) {
            dates = (ArrayList<Date>) fin.readObject();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
    }
}
