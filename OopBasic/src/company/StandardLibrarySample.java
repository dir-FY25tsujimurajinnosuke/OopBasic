package company;

public class StandardLibrarySample {

    public static void main(String[] args) {
        String a = new String("Hello"); 
        String b = new String("Hello"); 
        String c = a; 
        // == 演算子の使用
        System.out.println(a == b); 
        // false, a と b は異なるオブジェクトを参照
        System.out.println(a == c); // true, a と c は同じオブジェクトを参照
        // equals()メソッドの使用
        System.out.println(a.equals(b)); // true, a と b の内容（文字列）は同じ
        // toString()メソッド
        Double d = 3.14; 
        System.out.println(d.toString()); 
        // hashCode()メソッド
        System.out.println(d.hashCode());


    }

}
