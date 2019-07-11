package ro.itschool.mvnbase.homeWorkCurs11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Markups> markups1 = new ArrayList<>();
        markups1.add(new Markups(1, 5, "mere"));
        markups1.add(new Markups(2, 3, "pere"));

        List<Markups>markups2=new ArrayList<>();
        markups2.add(new Markups(1, 12, "fructe"));
        markups2.add(new Markups(2, 10, "fructele"));

        List<Document> documents = new ArrayList<>();
        documents.add(new Document(1, "Merele", "Marul este sanatos", markups1));
        documents.add(new Document(2, "Perele", "Para este dulce", markups1));
        documents.add(new Document(3, "Merele Noi", "Marul este si mai sanatos", markups2));

        DocumentService documentService = new DocumentService(documents);

        System.out.println(documentService.getAllDocuments());
        System.out.println("- - - - - - - - - - - - - - - - ");
        System.out.println(documentService.getDocumentWithName("Merele"));
        System.out.println("- - - - - - - - - - - - - - - - ");
        System.out.println(documentService.getMarkupsForDocument(1));
        System.out.println("- - - - - - - - - - - - - - - - ");
        System.out.println(documentService.addMarkupForDocument(3,3,"legume",3));
        System.out.println("- - - - - - - - - - - - - - - - ");
        System.out.println(documentService.getMarkupsForDocument(3));

    }
}
