class Course {
    String code;
    String name;

    String getCode() {
        return this.code;
    }
    String getName() {
        return this.name;
    }

    Course(String code, String name) {};
}

class OnlineCourse extends Course {
    @Override
    public String toString() {
        return "Code : " + code + ", Name : " + name + ", Type: Online";
    }
    OnlineCourse(String code, String name) {
        super(code, name);
        this.code = code;
        this.name = name;
    }
}

class OfflineCourse extends Course {
    @Override
    public String toString() {
        return "Code : " + code + ", Name : " + name + ", Type: Offline";
    }
    OfflineCourse(String code, String name) {
        super(code, name);
        this.code = code;
        this.name = name;
    }
}


public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println (course1);
        System.out.println (course2);
    }
}