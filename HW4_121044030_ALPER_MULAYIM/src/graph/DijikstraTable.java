package graph;

/**
 * Created by Alper on 30.12.2016.
 */
public class DijikstraTable {
    private int v;
    private  int p;
    private double d;
    private  String username;

    public DijikstraTable(String username,int v, int p, double d) {
        this.v = v;
        this.p = p;
        this.d = d;
        this.username = username;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
