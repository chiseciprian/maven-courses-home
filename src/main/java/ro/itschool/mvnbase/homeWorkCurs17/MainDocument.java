package ro.itschool.mvnbase.homeWorkCurs17;

import java.util.ArrayList;
import java.util.List;

public class MainDocument {
    public static void main(String[] args) throws DocumentAlreadyFinishedException {
        Document doc1=new Document("1","TestDoc1",Status.NEW);
        Document doc2=new Document("2","TestDoc2",Status.IN_PROGRESS);
        Document doc3=new Document("3","TestDoc3",Status.SUCCESS);
        Document doc4=new Document("4","TestDoc4",Status.FAILED);
        Document doc5=new Document("5","TestDoc5",Status.NEW);
        List<Document>documents=new ArrayList<>();
        documents.add(doc1);
        documents.add(doc2);
        documents.add(doc3);
        documents.add(doc4);
        documents.add(doc5);

        DocumentService documentService=new DocumentService(documents);
        System.out.println(documentService.getFailedDocuments());

       try {
           documentService.startDocument("5");
           documentService.startDocument("4");
       } catch (DocumentAlreadyFinishedException dafe){
           System.out.println(dafe);
       }

        System.out.println(documentService.getInProgressDocuments());

       try{
           documentService.completeDocument("1");
           documentService.completeDocument("2");
       }catch (DocumentAlreadyFinishedException dafe){
           System.out.println(dafe);
       }

        try{
            documentService.failDocument("1");
            documentService.failDocument("2");
        }catch (DocumentAlreadyFinishedException dafe){
            System.out.println(dafe);
        }

    }

}
