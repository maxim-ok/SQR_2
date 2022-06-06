package ru.netology;


public class CounterSQR {
    public int counter(int startBoard, int endBoard) {

        int counterNum = 0;

        for (int i = 10; i <= 99; i++) {

            int x = i * i;

            if ((x >= startBoard) && (x <= endBoard)) {
                counterNum++;
            }
        }

        return counterNum;
    }


}









