package Builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        if(line.equals("plain")){
            TextBuilder tb = new TextBuilder();
            Director d = new Director(tb);
            d.construct();
            String result = tb.getResult();
            System.out.println(result);
        }else if(line.equals("html")) {
            HTMLBuilder hb = new HTMLBuilder();
            Director d = new Director(hb);
            d.construct();
            String filename = hb.getResult();
            System.out.println(filename+"가 작성되었습니다.");
        }else {
            usage();
            return;
        }
    }
    public static void usage() {
        System.out.println("java Main plain 일반 텍스트로 문서 작성");
        System.out.println("java Main html HTML 파일로 작성");
    }
}
