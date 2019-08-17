package ro.itschool.mvnbase.homeWorkCurs21.ex2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random rnd=new Random();

        List<Document>documents=List.of(new Document("14eb5a4c-c0e4-11e9-9cb5-2a2ae2dbcce4","Document1",Status.NEW),
                new Document("0716378d-52e4-4eea-b579-9ab29b98e078","Document2",Status.IN_PROGRESS),
                new Document("b6268998-82da-4173-ab04-0b755e3b881b","Document3",Status.SUCCESS),
                new Document("2a9d09d4-1411-4d5c-8f6d-fc556676e0bc","Document4",Status.FAILED),
                new Document("53e65397-f3b1-4b72-b5dd-2e12ed7b76c9","Document5",Status.NEW),
                new Document("93cf2d0f-faa8-43e2-b542-f490ae8ba138","Document6",Status.IN_PROGRESS)
                );

        final List<String>successDocumentID =documents.stream()
                .filter(document -> document.getStatus().equals(Status.SUCCESS))
                .map(document -> document.getDocumentId())
                .collect(Collectors.toList());
        successDocumentID.forEach(document-> System.out.println(document));

        System.out.println("- - - - - - - - - - - - - - - ");


        final List<Job> jobDoc=documents.stream()
                .filter(document -> document.getStatus().equals(Status.IN_PROGRESS))
                .map(document -> new Job(document.getDocumentId(),rnd.nextInt(10)))
                .collect(Collectors.toList());
        jobDoc.forEach(doc-> System.out.println(doc));

        System.out.println("- - - - - - - - - - - - - - - ");

        final List<String>documentDaysRemaining=jobDoc.stream()
                .map(document->"<ID>='"+document.getDocumentId()+"'<Remaining days>='"+document.daysRemaining()+"'")
                .collect(Collectors.toList());
        documentDaysRemaining.forEach(doc-> System.out.println(doc));
    }
}
