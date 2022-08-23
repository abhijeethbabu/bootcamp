package newton.contests;

public class WeirdSeries {
    public static void main(String[] args) {

    }

    static int weridSeries(int n) {
        int r = 7, rc = 7;
        int c = 0;
        while(true) {
            while (rc >= 0) {
                rc -= n;
                c++;
            }
            if (rc == 0) {
                return c;
            } else {
                r = r*10 + r;
                rc = r;
            }
        }
    }
}
