package lesson4;

public class Task {
    public static void main(String[] args) {
        byte tonna = 1;
        short kilo = (short)(tonna * 1000);
        int gramm = kilo * 1000;
        int mgramm = gramm * 1000;
        System.out.println(" в " + tonna + " тонне " + kilo + " килограмм, " + gramm + " грамм, " + mgramm + " миллиграмм.");
        byte year = 1;
        short mounth = (short) (year * 12);
        short day = (short)(year * 365);
        int hourse =  day * 24;
        int minute = hourse * 60;
        int second = minute * 60;
        long msec = (long)second * 1000;
         System.out.println(("В " + year + " году " + mounth + " месяцев, " + day + " дней, " + hourse + " часов, " + minute + " минут, " +second + " секунд, " + msec + " милисекунд"));
    }
}
