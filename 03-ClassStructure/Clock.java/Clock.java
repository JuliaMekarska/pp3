public class Clock {

    int hour;
    int minute;
    int alarmMinute;
    int alarmHour;

    Clock() {
        this.hour = 0;
        this.minute = 0;
    }

    Clock(int hour, int minute) {
        if ((hour >= 24) || (hour < 0)) {
            System.out.println("Set clock once again.");
        } else if ((minute >= 60) || (minute < 0)) {
            System.out.println("Set clock once again.");
        } else {
            this.hour = hour;
            this.minute = minute;
        }
    }

    public void setClock(int hour, int minute) {
        if ((hour >= 24) || (hour < 0)) {
            System.out.println("Set clock once again.");
        } else if ((minute >= 60) || (minute < 0)) {
            System.out.println("Set clock once again.");
        } else {
            this.hour = hour;
            this.minute = minute;
        }
        
    }

    public void setClock() {
        this.hour = 0;
        this.minute = 0;
    }

    public void displayTime() {
        String hours="";
        String minutes="";
        if (this.hour < 10) {
            hours = "0" + String.valueOf(this.hour);
        } else {
            hours = String.valueOf(this.hour);
        }

        if (this.minute < 10) {
            minutes = "0" + String.valueOf(this.minute);
        } else {
            minutes = String.valueOf(this.minute);
        }

        System.out.println("It is " + hours + ":" + minutes + " o'clock.");
    }

    public void addOneMinute() {
        this.minute = this.minute + 1;
        if (this.minute > 59) {
            this.hour = this.hour + 1;
            this.minute = 0;
            if (this.hour > 23) {
                this.hour = 0;
            }
        }

        if ((this.hour == this.alarmHour) && (this.minute == this.alarmMinute)) {
            runAlarm();
        }
    }

    public void setAlarm(int hour, int minute) {
        this.alarmHour = hour;
        this.alarmMinute = minute;
    }

    public static void runAlarm() {
        System.out.println("ALARM!");
    }


    public static void main(String[] args) {
        Clock clock1 = new Clock(12,47);
        clock1.displayTime();

        clock1.setAlarm(1, 2);

        clock1.setClock(18,14);
        clock1.displayTime();

        clock1.setClock(9,3);
        clock1.displayTime();

        clock1.setClock(00,58);
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        
        clock1.setClock();
        clock1.displayTime();

        
    }
}