import com.sun.tools.javac.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTest {

    public static String run(String input) {
        Scanner scanner = TestUtil.genScanner(input.stripIndent());

        ByteArrayOutputStream out = TestUtil.setOutToByteArray();
        System.out.println("명언 :");
        System.out.println("작가 :");
        System.out.println("1번 명언이 등록되었습니다.");
        TestUtil.clearSetOutToByteArray(out);
        System.out.println(out.toString());

        return out.toString();
    }

    public static void clear() {
        System.out.println("clear");
    }
}
