package Homework.lesson1.HomeWorkApp;

public class Main {
    public static void main(String[] args) {
        JumpableRunnable[] members = {
                new Human(3, 3, "Sergri1"),
                new Human(2, 3, "Sergei2"),
                new Cat(4, 5, "Barsik1"),
                new Cat(2, 2, "Barsik2"),
                new Robot(0, 10, 10),
                new Robot(4,7,12)
        };

        Obstaclable[] obstacles = {
                new RunningTrack(1),
                new RunningTrack(4),
                new Wall(1),
                new Wall(3)
        };

        for (JumpableRunnable member : members) {
            System.out.println("К прохождению препятствий приступает " + member);
            boolean winner = true;
            for (Obstaclable obstacle : obstacles) {
                System.out.println(member + " пробует пройти " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("И у него получается!");
                } else {
                    winner = false;
                    System.out.println("И у него не получается.");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " прошёл дистанцию!");
            } else {
                System.out.println(member + " проиграл.");
            }
            System.out.println();
        }
    }
}