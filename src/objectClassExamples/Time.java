package objectClassExamples;

//calculate time difference between two object time in method and return value in object of time class
public class Time {
    int second;
    int minute;
    int hour;

    public Time() {
    }

    public Time(int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public static Time timeDifference(Time t1, Time t2) {
        Time diff = new Time();
        if (t1.second > t2.second) {
            t2.minute--;
            t2.second += 60;
        }
        diff.second = t2.second - t1.second;
        if (t1.minute > t2.minute) {
            t2.hour--;
            t2.minute += 60;
        }
        diff.minute = t2.minute - t1.minute;
        diff.hour = t2.hour - t1.hour;

        if (diff.hour < 0) {
            diff.hour = 24 + diff.hour;
        }
        return diff;
    }

    public static void main(String[] args) {
        Time t1 = new Time(11, 34, 25);
        Time t2 = new Time(11, 30, 56);
        Time diff = timeDifference(t1, t2);
        System.out.println("Difference : " + diff.hour + ":" + diff.minute + ":" + diff.second);



/*        System.out.println(diff.getClass().getName());     //returns the class name
        System.out.println(Time.class.isInstance(diff));    //return true if diff is object of Time otherwise false
        System.out.println(diff instanceof Time);      //return true if diff is object of Time otherwise false
 */
    }
}
