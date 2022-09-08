package sample;

public class Data2 {
    int year;
    int  unitsForYear;
    double DValuePUB;

    public Data2(int year, int unitsForYear, double DValuePUB) {
        this.year = year;
        this.unitsForYear = unitsForYear;
        this.DValuePUB = DValuePUB;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getUnitsForYear() {
        return unitsForYear;
    }

    public void setUnitsForYear(int unitsForYear) {
        this.unitsForYear = unitsForYear;
    }

    public double getDValuePUB() {
        return DValuePUB;
    }

    public void setDValuePUB(double DValuePUB) {
        this.DValuePUB = DValuePUB;
    }
}
