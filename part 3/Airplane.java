
import java.util.Scanner;

public class Airplane {
    int flightno, flighttimeinhour, flighttimeinmin, delayTime;
    String flightdest;

    public void getData() {
        System.out.println("Enter flight number:");
        Scanner s = new Scanner(System.in);
        flightno = s.nextInt();

        System.out.println("Enter flight destination");
        Scanner l = new Scanner(System.in);
        flightdest = l.next();

        System.out.println("Enter flight departure time in hour and min:");
        Scanner h = new Scanner(System.in);
        flighttimeinhour = h.nextInt();
        Scanner m = new Scanner(System.in);
        flighttimeinmin = m.nextInt();
    }

    public void setData() {
        System.out.println("Entered flight number is:" + flightno);
        System.out.println("Entered flight destination is " + flightdest);
        System.out.println("Enter flight departure time in hour and min:");
        System.out.println(flighttimeinhour + ":" + flighttimeinmin);
    }

    public void checkStatus() {
        System.out.println("Enter delay time in min:");
        Scanner d = new Scanner(System.in);
        delayTime = d.nextInt();

        if (delayTime > 0) {
            int x = flighttimeinmin + delayTime;
            if (x >= 60) {
                flighttimeinhour += x / 60;
                x %= 60;
            }
            System.out.println("New departure time is " + flighttimeinhour + ":" + x);
        } else {
            System.out.println(flighttimeinhour + ":" + flighttimeinmin);
        }
    }

    

    public static void main(String args[]) {
        Airplane A = new Airplane();
        A.getData();
        A.setData();
        A.checkStatus();
    }
}
