package ro.itschool.mvnbase.homeWorkCurs11;

import java.util.Objects;

public class Markups {
    private final int markupid;
    private final int position;
    private final String conent;


    public Markups(int markupid, int position, String conent) {
        this.markupid = markupid;
        this.position = position;
        this.conent = conent;
    }

    @Override
    public String toString() {
        return "Markups{" +
                "markupid=" + markupid +
                ", position='" + position + '\'' +
                ", conent='" + conent + '\'' +
                '}';
    }

    public int getMarkupid() {
        return markupid;
    }

    public int getPosition() {
        return position;
    }

    public String getConent() {
        return conent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Markups markups = (Markups) o;
        return markupid == markups.markupid &&
               position == markups.position &&
                Objects.equals(conent, markups.conent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markupid, position, conent);
    }
}
