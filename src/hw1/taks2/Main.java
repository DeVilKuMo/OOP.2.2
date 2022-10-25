package hw1.taks2;

public class Main {
    public static void main(String[] args) {
        flower rosa = new flower(null, "голандия", 35.59);
        flower hrizantema = new flower(null, null, 15);
        hrizantema.lifeSpan = 5;
        flower pion = new flower(null, "Англия ", 69.9);
        pion.lifeSpan = 1;
        flower gypsophila = new flower(null, "Турция", 19.5);
        gypsophila.lifeSpan = 10;


        printInfo(rosa);
        printInfo(hrizantema);
        printInfo(pion);
        printInfo(gypsophila);
    }
    private static void printInfo(flower flower){
        System.out.println(
                "Цвет: " + flower.getFlowerColor()+
                        ", страна: "+flower.getCountry()+
                        ", стоимость: "+flower.getCost()+
                        ", срок: "+flower.lifeSpan
        );

    }
}