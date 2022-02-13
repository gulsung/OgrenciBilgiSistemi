package ogrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String ogrenciNo;
    String classes;
    Double avarage;
    boolean isPass;

    Student(String name , String ogrenciNo, String classes , Course c1 , Course c2 , Course c3){
        this.name = name;
        this.ogrenciNo = ogrenciNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNoteC1(int finlaNote , int vizeNote){
        this.c1.note = ( (double) finlaNote*0.8) + ( (double) vizeNote*0.2);
        System.out.println("Tarih dersine vize sözlü notunun ortalamaya etkisi %20 , final notunun etkisi %80'dir.");
        System.out.println("Tarih not ortalamanız : " + this.c1.note);
        System.out.println("");
    }

    void addBulkExamNoteC2(int finlaNote , int vizeNote){
        this.c2.note = ( (double) finlaNote*0.7) + ( (double) vizeNote*0.3);
        System.out.println("Fizik dersine ait vize notunun ortalamaya etkisi %30 , final notunun etkisi %70'dir.");
        System.out.println("Fizik not ortalamanız : " + this.c2.note);
        System.out.println("");
    }

    void addBulkExamNoteC3(int finlaNote , int vizeNote){
        this.c3.note = ( (double) finlaNote*0.6) + ( (double) vizeNote*0.4);
        System.out.println("Biyoloji dersine ait sözlü notunun ortalamaya etkisi %40 , final notunun etkisi %60'dir.");
        System.out.println("Tarih not ortalamanız : " + this.c3.note);
        System.out.println("");
    }



    void isPass(){
        this.avarage = (this.c1.note + this.c2.note + this.c3.note ) / 3.00;
        if (this.avarage > 55){
            System.out.println("Sınıf başarılı sekilde geçtiniz ");
        }
        else{
            System.out.println("Sınıfta kaldınız ");
        }

        printNote();
    }

    void printNote(){
        System.out.println(c1.name + " Notu : " + c1.note);
        System.out.println(c2.name + " Notu : " + c2.note);
        System.out.println(c3.name + " Notu : " + c3.note);
        System.out.println("Ortalamanız : " + this.avarage + "\n \n");
    }
}
