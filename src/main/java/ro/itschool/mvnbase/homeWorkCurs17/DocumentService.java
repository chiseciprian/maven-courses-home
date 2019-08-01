package ro.itschool.mvnbase.homeWorkCurs17;

import java.util.ArrayList;
import java.util.List;

public class DocumentService {
    private final List<Document> documents;

    public DocumentService(List<Document> documents) {
        this.documents = documents;
    }

    public List<Document> getInProgressDocuments() {
        List<Document> inProgress = new ArrayList<>();
        for (Document document : documents) {
            if (document.getStatus().equals(Status.IN_PROGRESS)) {
                inProgress.add(document);
            }
        }
        return inProgress;
    }

    public List<Document> getFailedDocuments() {
        List<Document> failedDocuments = new ArrayList<>();
        for (Document document : documents) {
            if (document.getStatus().equals(Status.FAILED)) {
                failedDocuments.add(document);
            }
        }
        return failedDocuments;
    }

    public void startDocument(String id) throws DocumentAlreadyFinishedException {
        for (Document document : documents) {
            if (document.getDocumentId().equals(id)) {
                if (!document.getStatus().equals(Status.SUCCESS) && !document.getStatus().equals(Status.FAILED)) {
                    document.setStatus(Status.IN_PROGRESS);
                } else {
                    throw new DocumentAlreadyFinishedException(document);
                }
            }
        }
    }

    public void completeDocument(String documentId) throws DocumentAlreadyFinishedException {
        for (Document document : documents) {
            if (document.getDocumentId().equals(documentId)) {
                if (!document.getStatus().equals(Status.IN_PROGRESS)) {
                    document.setStatus(Status.SUCCESS);
                } else {
                    throw new DocumentAlreadyFinishedException(document);
                }
            }
        }
    }

    public void failDocument(String documentId) throws DocumentAlreadyFinishedException {
        for (Document document : documents) {
            if (document.getDocumentId().equals(documentId)) {
                if (!document.getStatus().equals(Status.IN_PROGRESS)) {
                    document.setStatus(Status.FAILED);
                } else {
                    throw new DocumentAlreadyFinishedException(document);
                }

            }
        }
    }


}
