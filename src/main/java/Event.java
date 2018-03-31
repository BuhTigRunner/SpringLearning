import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class Event {
    private static Random random = new Random();
    private int id;
    private String msg;
    private Date date;
    private DateFormat dateFormat;

    public Event(Date date, DateFormat dateFormat) {
        this.date = date;
        this.dateFormat = dateFormat;
        id = random.nextInt();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + dateFormat.format(date) +
                '}';
    }


    public static boolean isDay() {
        Date date = new Date();
        int hours = date.getHours();
        boolean res = hours > 8 && hours < 17;
        System.out.println("isDay: " + res);
        return res;
    }

}
