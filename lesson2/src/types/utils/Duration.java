package types.utils;

public class Duration {
    private int hours;
    private int minutes;
    private int seconds;

    Duration(int hours, int minutes, int seconds) {
        if (hours < 0 || minutes < 0 || seconds <= 0 || minutes >= 60 || seconds >= 60) {
            throw new IllegalArgumentException(String.format("Неверные значения длительности для файла\n Получено: часы %s" +
                    " Минуты %s Секунды %s", hours, minutes, seconds));
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (hours > 0) {
            if (hours < 10) {
                sb.append("0");
            }
            sb.append(hours);
            sb.append(":");
        } else if (hours == 0) {
            sb.append("00");
            sb.append(":");
        } else if (minutes > 0) {
            if (minutes < 10) {
                sb.append("0");
            }
            sb.append(minutes);
            sb.append(":");
        } else if (minutes == 0) {
            sb.append("00");
            sb.append(":");
        } else if (seconds > 0) {
            if (seconds < 10) {
                sb.append("0");
            }
            sb.append(seconds);
            sb.append(".");
        }
        return sb.toString();    }
}
