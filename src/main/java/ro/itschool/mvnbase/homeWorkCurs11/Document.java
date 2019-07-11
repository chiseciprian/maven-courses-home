package ro.itschool.mvnbase.homeWorkCurs11;

import java.util.List;
import java.util.Objects;

public class Document {
    private final int documentId;
    private final String name;
    private final String content;
    List<Markups> markups;

    public Document(int documentId, String name, String content, List<Markups> markups) {
        this.documentId = documentId;
        this.name = name;
        this.content = content;
        this.markups = markups;
    }

    public int getDocumentId() {
        return documentId;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return documentId == document.documentId &&
                Objects.equals(name, document.name) &&
                Objects.equals(content, document.content) &&
                Objects.equals(markups, document.markups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, name, content, markups);
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId='" + documentId + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public List<Markups> getMarkups() {
        return markups;
    }

    public void setMarkups(List<Markups> markups) {
        this.markups = markups;
    }
}
