package OOP.StopWatch;

import java.util.Random;

public class hihi {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.startTime();
        stopWatch.getStartTime();
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            array[i] = random.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[i] = array[min];
            array[min] = temp;
        }
        stopWatch.endTime();
        stopWatch.getEndTime();
        System.out.println(stopWatch.getElapsedTime());
    }
}
