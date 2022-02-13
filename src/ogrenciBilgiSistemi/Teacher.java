package ogrenciBilgiSistemi;

public class Teacher {
    String name;
    String telNO;
    String branch;

    Teacher(String name , String telNo , String branch){
        this.name = name;
        this.telNO = telNo;
        this.branch = branch;
    }

    void info(){
        System.out.println("Adı : " + this.name + "\nTelefon Numarası : " + this.telNO + "\nBransı : " + this.branch );
    }
}
