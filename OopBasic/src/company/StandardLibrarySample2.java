package company;

    public class StandardLibrarySample2 {
        public static void main(String[] args) {
            String str = " Hello World! ";
            System.out.println(str.length()); // 14
            System.out.println(str.substring(1, 4)); // "Hel"
            System.out.println(str.contains("llo")); // true
            System.out.println(str.replace('l', 'L')); // " HeLLo WorLd! "
            System.out.println(str.trim()); // "Hello World!"

            String name = "Alice";
            int age = 25;
            double height = 1.7;

            // ここを修正
            String formattedString = String.format("Name: %s, Age: %d, Height: %.2f", name, age, height);
            System.out.println(formattedString);
        }
    }
