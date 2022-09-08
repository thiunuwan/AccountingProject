package sample;

public class Data {
    private int year;
    private double CValueRBB;
    private double DValueRBB;

    public Data(int year, double CValueRBB, double DValueRBB) {
        this.year = year;
        this.CValueRBB = CValueRBB;
        this.DValueRBB = DValueRBB;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCValueRBB() {
        return CValueRBB;
    }

    public void setCValueRBB(double CValueRBB) {
        this.CValueRBB = CValueRBB;
    }

    public double getDValueRBB() {
        return DValueRBB;
    }

    public void setDValueRBB(double DValueRBB) {
        this.DValueRBB = DValueRBB;
    }
}
