import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] products = {"Хлеб", "Масло", "Сметана"};
        int[] prices = {40, 253, 56};

        int[] counts = new int[3]; //лучше counts назвать basket
        
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Введите номер товара и кол-во или End");
            String line = scan.nextLine();
            if("end".equals(line)) {
                break;
            }
            String[] parts = line.split(" "); // "1 5" -> ["1", "5"]
            int productNum = Integer.parseInt(parts[0]) -1;
            int count = Integer.parseInt(parts[1]);

            counts[productNum] += count;
        }
        //TODO вывод корзины
        int sum = 0;
        for (int i = 0; i < counts.length; i++) {
            if(counts[i] > 0) {
                System.out.println(products[i] + " " + prices[i] + "руб./шт." +
                        (prices[i] * counts[i]) + " руб.");
                sum += prices[i] * counts[i];
            }
        }
        System.out.println("Итого " + sum + " руб.");
    }
}