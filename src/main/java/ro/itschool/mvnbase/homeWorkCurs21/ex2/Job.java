package ro.itschool.mvnbase.homeWorkCurs21.ex2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import static java.time.temporal.ChronoUnit.DAYS;

public class Job {
    private final String documentId;
    private final LocalDateTime startDate;
    private final LocalDateTime deadLine;
    private final Urgency urgency;

    public Job(String documentId, int days) {
        this.documentId = documentId;
        this.startDate = LocalDateTime.now();
        this.deadLine = setDeadline(days,startDate);
        this.urgency = setUrgency(startDate,this.deadLine);
    }

    private LocalDateTime setDeadline(int days,LocalDateTime startDate) {
        LocalDateTime deadLine=startDate.plusDays(days);
        return deadLine;
    }

    private Urgency setUrgency(LocalDateTime startDate, LocalDateTime deadLine) {
        long daysBetween = DAYS.between(startDate, deadLine);

         if (daysBetween<=1){
           return Urgency.HIGH;
        } else if(daysBetween<7){
            return Urgency.MEDIUM;
        }else {
            return Urgency.LOW;
        }
    }

    public long daysRemaining(){
        long daysBetween = DAYS.between(LocalDateTime.now(), deadLine);
        return daysBetween;
    }

    public String getDocumentId() {
        return documentId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getDeadLine() {
        return deadLine;
    }

    public Urgency getUrgency() {
        return urgency;
    }

    @Override
    public String toString() {
        return "Job{" +
                "documentId='" + documentId + '\'' +
                ", startDate=" + startDate +
                ", deadLine=" + deadLine +
                ", urgency=" + urgency +
                '}';
    }
}
