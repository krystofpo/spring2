package kry.spring1.biz;

/**
 * Created by Mario on 11.12.2017.
 */
public class Note {

    private String message;
    private String label;

    public Note() {
    }

    public Note(String message, String label) {
        this.message = message;
        this.label = label;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (getMessage() != null ? !getMessage().equals(note.getMessage()) : note.getMessage() != null) return false;
        return getLabel() != null ? getLabel().equals(note.getLabel()) : note.getLabel() == null;
    }

    @Override
    public int hashCode() {
        int result = getMessage() != null ? getMessage().hashCode() : 0;
        result = 31 * result + (getLabel() != null ? getLabel().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Note{" +
                "message='" + message + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
