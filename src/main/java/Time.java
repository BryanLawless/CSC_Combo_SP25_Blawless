public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }
    
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public void increment(int secondsToAdd) {
    	int totalSeconds = this.hours * 3600 + this.minutes * 60 + this.seconds + secondsToAdd;
    
    	this.hours = (totalSeconds / 3600) % 24;
    	this.minutes = (totalSeconds % 3600) / 60;
    	this.seconds = totalSeconds % 60;
    }
    
    public void print(boolean military) {
        if (military) {
            System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
        } else {
            int displayHour = hours % 12;
            if (displayHour == 0) displayHour = 12;
            
            String period = (hours < 12) ? "AM" : "PM";
            
            System.out.printf("%02d:%02d:%02d %s\n", displayHour, minutes, seconds, period);
        }
    }
}