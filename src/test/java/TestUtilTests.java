import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class TestUtilTests {

    @Test
    @DisplayName("Scanner 생성 테스트")
    public void t1() {
        Scanner sc = TestUtil.genScanner("1\n2\n");
        String val1 = sc.nextLine();
        String val2 = sc.nextLine();
        System.out.println(Integer.parseInt(val1) + Integer.parseInt(val2));
    }

    @Test
    @DisplayName("System.out 출력 테스트")
    public void t2() {
        ByteArrayOutputStream output = TestUtil.setOutToByteArray();
        System.out.println("hihi");
        System.out.println("byebye");

        TestUtil.clearSetOutToByteArray(output);
        System.out.println(output.toString());
        System.out.println("bbbb");

    }

    @Test
    @DisplayName("Scanner와 System.out 출력 테스트")
    public void t3() {
        Scanner sc = TestUtil.genScanner("""
                add
                안녕하세요
                다함께 화이팅 해봅시다!
                """.stripIndent());

        String cmd = sc.nextLine();
        if(cmd.equals("add")) {
            System.out.println("title: ");
            String title = sc.nextLine();
            System.out.println("content: ");
            String content = sc.nextLine();
        } else {
            System.out.println("잘못된 명령어입니다.");
        }

        ByteArrayOutputStream output = TestUtil.setOutToByteArray();
        TestUtil.clearSetOutToByteArray(output);
        System.out.println(output.toString());
    }

}
