package OgrenciNotSistemi;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    Course(String name,String code,String prefix){

        this.code = code;
        this.name = name;
        this.note = 0;
        this.prefix = prefix;

    }

    void addTeacher(Teacher teacher){
        this.teacher = teacher; 
    }

    void printTeacherInfo(){
        this.teacher.print();
    }
}
