package OgrenciNotSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "0505 555 55 55", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "0505 555 55 55", "FZK");
        Teacher t3 = new Teacher("Kül yutmaz", "0505 555 55 55", "BIO");
        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","101","FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "101", "BIO");
        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(90, 200, 50);
        s1.printNote();

    }
}
