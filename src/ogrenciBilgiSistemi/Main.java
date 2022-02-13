package ogrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) throws Exception {
        Teacher t1 = new Teacher("Ozan", "05370000000", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "05370000000", "FZK");
        Teacher t3 = new Teacher("Safiye", "05370000000", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);


        Student s1 = new Student("Mehmet Ali", "131", "4", tarih,fizik,biyo);
        s1.addBulkExamNoteC1(50, 80);
        s1.addBulkExamNoteC2(60, 70);
        s1.addBulkExamNoteC3(80, 90);
        s1.isPass();

    }

    }
