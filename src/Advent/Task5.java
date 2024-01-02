package Advent;

// Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту.

import java.time.Instant;

public class Task5 {

    public static void main(String[] args) {

        Instant now = Instant.now();
        long s = now.getEpochSecond();
        long sec;
        long m;
        long min;
        long h;
        long hours;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hours = h % 24;
        System.out.println(hours + " часов " + min + " минут " + sec + " секунд ");
    }
}
