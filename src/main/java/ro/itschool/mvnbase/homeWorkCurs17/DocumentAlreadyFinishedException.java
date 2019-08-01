package ro.itschool.mvnbase.homeWorkCurs17;

public class DocumentAlreadyFinishedException extends Exception {
    private final Document document;
    public DocumentAlreadyFinishedException(Document document){
        super("Document "+ document.getName()+ " is already finished or has a bad status");
         this.document=document;
    }
}
