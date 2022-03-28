package ru.netology.sqr;

public class SQRService {
    public int calculateSqr(int underLimit, int overLimit) {

        int count = 0;
        for (int i = 10;
             i <= 99; i++) {
            int sqrt = i * i;
            if (underLimit <= sqrt && sqrt <= overLimit) {
                count++;
            }
        }
        return count;
    }
}
