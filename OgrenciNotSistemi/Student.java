package OgrenciNotSistemi;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = c1;
        this.course2 = c2;
        this.course3 = c3;
        this.avarage =0.0;
        this.isPass =false;
    }

    void addBulkExamNote(int c1,int c2,int c3){
        if(c1>=0 && c1<=0){
            course1.note = c1;
        }
        if(c2>=0 && c2<=0){
            course2.note = c2;
        } 
        if(c3>=0 && c3<=0){
            course3.note = c3;
        }
    }

    void isPass(){
        this.avarage = (this.course1.note+this.course2.note+this.course3.note)/3.0;
        if(this.avarage>=55){
            System.out.println("Geçtiniz Sınıfı: ");
        }else{
            System.out.println("Hababam sınıfı sınıfta kaldı başkan");
        }
    }

    void printNote(){
        System.out.println(course1.name + " Notu\t" + course1.note);
        System.out.println(course2.name + " Notu\t" + course2.note);
        System.out.println(course3.name + " Notu\t" + course3.note);
        System.out.println("Ortalamanız: " + this.avarage);
    }

}
