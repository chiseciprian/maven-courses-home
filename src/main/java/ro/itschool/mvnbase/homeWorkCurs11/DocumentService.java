package ro.itschool.mvnbase.homeWorkCurs11;

import java.util.ArrayList;
import java.util.List;

public class DocumentService {
    List<Document> documents;

    public DocumentService(List<Document> documents) {
        this.documents = documents;
    }

    public List<Document> getAllDocuments() {
        return new ArrayList<>(documents);
    }

    public List<Document> getDocumentWithName(String name) {
        List<Document> documentsByName = new ArrayList<>();
        for (Document document : documents) {
            if (document.getName().contains(name)) {
                documentsByName.add(document);
            }
        }
        return documentsByName;
    }

    public List<Markups> getMarkupsForDocument(int id) {
        List<Markups> markups = new ArrayList<>();
        for (Document document:documents){
            if (document.getDocumentId()==id){
                markups=document.getMarkups();
            }
        }
        return markups;
    }

    public String addMarkupForDocument(int id,int position,String content,int documentId){
        List<Markups> markups = new ArrayList<>();
        for (Document document:documents){
            if (document.getDocumentId()==documentId){
                markups=document.getMarkups();
                markups.add(new Markups(id,position,content));
                document.setMarkups(markups);
                return "Succes";
            }
        }
        return "Faild";
    }
}
