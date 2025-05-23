package company;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StandardLibrarySample4 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
     // 日付：今日、指定日
        System.out.println(LocalDate.now()); 
        System.out.println(LocalDate.of(2023, Month.DECEMBER, 5)); 
        // 時刻：今、指定時刻
        System.out.println(LocalTime.now()); 
        System.out.println(LocalTime.of(13, 45)); 
        // 日時：現在、指定日時
        System.out.println(LocalDateTime.now()); 
        System.out.println(LocalDateTime.of(2023, Month.DECEMBER, 5, 
        13, 45)); 
        // 日付差と時刻差
        System.out.println(Period.between(LocalDate.of(2023, 1, 1), 
        LocalDate.of(2023, 12, 31))); 
        System.out.println(Duration.between(LocalTime.of(9, 0), 
        LocalTime.of(17, 0)));
     // 日時から文字列への変換
        DateTimeFormatter formatter = 
        DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
        System.out.println(LocalDateTime.now().format(formatter)); 
        // 文字列から日時への変換
        try { 
        System.out.println(LocalDateTime.parse("2023/12/05 15:30:45", 
        formatter)); 
        } catch (DateTimeParseException e) { 
        System.out.println("Error" + e.getMessage()); 
        } 
        // タイムゾーン付日時の扱い
        // 日本タイムゾーンで現在の日時を取得
        var tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo")); 
        // UTCに変換
        var utcTime = tokyoTime.withZoneSameInstant(ZoneOffset.UTC); 
        // 結果を表示
        System.out.println("Tokyo Time: " + tokyoTime); 
        System.out.println("UTC Time: " + utcTime);

    }

}
