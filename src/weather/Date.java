package weather;

public class Date {

    private String dayValue, monthValue, yearValue;

    public Date(String yearValue, String monthValue, String dayValue) {
        this.yearValue = yearValue;
        this.monthValue = monthValue;
        this.dayValue = dayValue;
    }

    public String getDayValue() {
        return dayValue;
    }

    public void setDayValue(String dayValue) {
        dayValue = dayValue;
    }

    public String getMonthValue() {
        return monthValue;
    }

    public void setMonthValue(String monthValue) {
        monthValue = monthValue;
    }

    public String getYearValue() {
        return yearValue;
    }

    public void setYearValue(String yearValue) {
        yearValue = yearValue;
    }

    public String toString() {
        return getYearValue() + "/" + getMonthValue() + "/" + getDayValue();
    }
}
