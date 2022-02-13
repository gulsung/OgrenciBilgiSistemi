package ogrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int finlaNote =0;
    int vizeNote = 0;
    double note = 0.0;

    Course(String name, String code , String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
        }
    }

    void printTeacherInfo(){
        this.teacher.info();
    }
    }

