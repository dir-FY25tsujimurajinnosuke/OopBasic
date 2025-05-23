package company;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.nio.charset.StandardCharsets;

public class StandardLibrarySample5 {
    public static void main(String[] args) {
        String content = "これは最初の行です。\nこれは次の行です。\nそして、これが最後の行です。";
        try {
            // ファイルの書き込み
            Files.write(Paths.get("example.txt"), content.getBytes(StandardCharsets.UTF_8));

            // ファイルの読み込み（全体を表示）
            List<String> lines = Files.readAllLines(Paths.get("example.txt"), StandardCharsets.UTF_8);
            for (String line : lines) {
                System.out.println(line);
            }

            // ファイルを行ごとに番号付きで表示
            int lineNumber = 1;
            for (String line : lines) {
                System.out.println(String.format("%d行目：%s", lineNumber, line));
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}