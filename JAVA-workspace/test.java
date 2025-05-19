import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

    public static void main(String[] args) throws IOException {
        System.out.println("hi");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String res = br.readLine();

        System.out.println(res);
    }
}