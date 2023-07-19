package Java8;


import java.time.Period;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Ngày hiện tại: " + currentDate);

        // Get the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Thời gian hiện tại: " + currentTime);

        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Thời gian định dạng: " + formattedTime);

        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Ngày và thời gian hiện tại: " + currentDateTime);

        // Create a date format pattern
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Parse a date string using the format pattern
        String dateString = "19/07/2023";
        LocalDate date = LocalDate.parse(dateString, dateFormatter);
        System.out.println("Ngày sau khi định dạng: " + date);

        // Create a time format pattern
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Parse a time string using the format pattern
        String timeString = "15:30:45";
        LocalTime time = LocalTime.parse(timeString, timeFormatter);
        System.out.println("Thời gian sau khi định dạng: " + time);

        // Combine the date and time into a LocalDateTime object
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("Hiển thị ngày và giờ: " + dateTime);

        // Get the current date/time in a specific time zone
        ZoneId zoneId = ZoneId.of("Europe/London");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println("Ngày giờ hiện tại ở London: " + zonedDateTime);

        // Format the date/time as a string with a specific format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Định dạng ngày giờ: " + formattedDateTime);

        // Create two LocalTime objects
        LocalTime start = LocalTime.of(12, 03, 25);
        LocalTime end = LocalTime.of(15, 0, 0);

        // Calculate the duration between the two times
        Duration duration = Duration.between(start, end);

        // Output the duration in seconds and minutes
        System.out.println("Thời lượng tính bằng giây: " + duration.getSeconds());
        System.out.println("Thời luợng tính bằng phút: " + duration.toMinutes());

        // Create two LocalDate objects
        LocalDate startdate = LocalDate.of(2001, 3, 25);
        LocalDate enddate = LocalDate.now();

        // Calculate the period between the two dates
        Period period = Period.between(startdate, enddate);

        // Output the period in years, months, and days
        System.out.println("Thời gian tính bằng năm: " + period.getYears());
        System.out.println("Thời gian tính bằng tháng: " + period.getMonths());
        System.out.println("Thời gian tính bằng ngày: " + period.getDays());
    }
}
