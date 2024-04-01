package com.javaex.api.objectclass.ex04;

public class ScoreboardApp {
    public static void main(String[] args) {
        Scoreboard sc1 = new Scoreboard();
        sc1.setScores(new int[] {1, 2, 3, 5, 4});
        System.out.println("sc1: " + sc1);

        /* 얕은 복사 */
        System.out.println("-------얕은 복사-------");
        Scoreboard sc2 = sc1.getClone();
        System.out.println("sc2: " + sc2);
        System.out.println("sc1 == sc2 ?? : " + (sc1 == sc2));

        sc1.getScores()[0] = 50000;
        System.out.println("sc2 (after sc1 setting): " + sc2);
        System.out.println("------sc2 초기화--------");

        sc2 = null;
        System.out.println("sc2 (initialize): " + sc2);
        System.out.println("-------깊은 복사-------");

        sc2 = (Scoreboard)sc1.clone();
        System.out.println("sc2 (after cloning): " + sc2);
        sc1.setScores(new int[] {100, 200, 500, 300});
        System.out.println("sc2 (after sc1 setting): " + sc2);
        System.out.println("--------------");
    }
}
