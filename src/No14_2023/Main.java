package No14_2023;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        long num = 1;

        while (count < 2023) {
            if (isLuckyNumber(num)) {
                count++;
            }
            num++;
        }

        System.out.println("第2023个幸运数字是：" + (num - 1));
    }

    // 判断一个数是否在二进制、八进制、十进制、十六进制下均为哈沙德数
    private static boolean isLuckyNumber(long num) {
        return isHarshad(num, 2) && isHarshad(num, 8) && isHarshad(num, 10) && isHarshad(num, 16);
    }

    // 判断一个数是否是哈沙德数
    private static boolean isHarshad(long num, int base) {
        String str = Long.toString(num, base);
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return num % sum == 0;
    }
}
