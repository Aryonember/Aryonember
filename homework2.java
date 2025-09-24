import java.util.Scanner;

class Student {
    int stuCode;
    String name;
    String major;
    int phone;

    void setCode(int code) {
        stuCode = code;
    }
    void setName(String str1){
        name = str1;
    }
    void setMajor(String str2){
        major = str2;
    }
    void setPhone(int num){
        phone = num;
    }
    int getCode() {
        return stuCode;
    }
    String getName() {
        return name;
    }
    String getMajor() {
        return major;
    }
    int getPhone() {
        return phone;
    }
}

class Homework2 {
    static int square (int i, int j)
    {
        if (j > 1) {
            return i * square(i, j - 1);
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        System.out.println("학생의 학번 이름 전공 전화번호 입력 : ");
        s1.setCode(sc.nextInt());
        s1.setName(sc.next());
        s1.setMajor(sc.next());
        s1.setPhone(sc.nextInt());

        Student s2 = new Student();
        System.out.println("학생의 학번 이름 전공 전화번호 입력 : ");
        s2.setCode(sc.nextInt());
        s2.setName(sc.next());
        s2.setMajor(sc.next());
        s2.setPhone(sc.nextInt());

        Student s3 = new Student();
        System.out.println("학생의 학번 이름 전공 전화번호 입력 : ");
        s3.setCode(sc.nextInt());
        s3.setName(sc.next());
        s3.setMajor(sc.next());
        s3.setPhone(sc.nextInt());

        int num;
        System.out.println("입력된 학생 정보");


        System.out.printf("첫번째 학생 : " + s1.getCode() + " " + s1.getName() + " " + s1.getMajor() + " 0");

        num = s1.getPhone()/100000000;
        System.out.printf("%d-", num);

        num = (s1.getPhone() % 100000000)/10000;
        if(num < 1000) {
            System.out.printf("0");
        }
        System.out.printf("%d-", num);

        num = s1.getPhone() % 10000;
        if(num < 1000) {
            System.out.printf("0");
        }
        System.out.printf("%d\n", num);



        System.out.printf("두번째 학생 : " + s2.getCode() + " " + s2.getName() + " " + s2.getMajor() + " 0");

        num = s2.getPhone()/100000000;
        System.out.printf("%d-", num);

        num = (s2.getPhone() % 100000000)/10000;
        if(num < 1000) {
            System.out.printf("0");
        }
        System.out.printf("%d-", num);

        num = s2.getPhone() % 10000;
        if(num < 1000) {
            System.out.printf("0");
        }
        System.out.printf("%d\n", num);



        System.out.printf("세번째 학생 : " + s3.getCode() + " " + s3.getName() + " " + s3.getMajor() + " 0");

        num = s3.getPhone()/100000000;
        System.out.printf("%d-", num);

        num = (s3.getPhone() % 100000000)/10000;
        if(num < 1000) {
            System.out.printf("0");
        }
        System.out.printf("%d-", num);

        num = s3.getPhone() % 10000;
        if(num < 1000) {
            System.out.printf("0");
        }
        System.out.printf("%d\n", num);
    }
}