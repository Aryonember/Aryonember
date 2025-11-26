import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;



public class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> info = new HashMap<String, String>();
        info.put("myId", "myPass");
        info.put("myId2", "myPass2");
        info.put("myId3", "myPass3");

        String userId;
        String userPass;

        System.out.println("id와 password를 입력해주세요.");

        while (true) {
            System.out.print("id : ");
            userId = sc.next();
            userId = userId.trim();
            for(Map.Entry<String, String> entry : info.entrySet()) {
                while (info.containsKey(userId)) {
                    System.out.print("password : ");
                    userPass = sc.next();
                    userPass = userPass.trim();
                    if (userPass.equals(info.get(userId))) {
                        System.out.println("id와 비밀번호가 일치합니다.");
                        return;
                    }
                    else {
                        System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                    }
                }
            }
            System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
        }


    }
}