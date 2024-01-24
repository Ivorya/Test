public class Test {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + '\t');//在这里使用了'\t'
            }
            System.out.println();//在内循环外面加上换行
        }
    }
}
