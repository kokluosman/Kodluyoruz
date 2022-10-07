package Collections.TreeSet;

public class Student {
    private String name;
    private int note;


    public Student() {
    }

    public Student(String name, int note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return this.note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Student name(String name) {
        setName(name);
        return this;
    }

    public Student note(int note) {
        setNote(note);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", note='" + getNote() + "'" +
            "}";
    }



}
