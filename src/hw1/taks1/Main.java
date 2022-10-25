package hw1.taks1;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;


        Human maxim  = new  Human(" Максим ",35,"Минск"," Бренд-Менеджер");


        Human anya  = new  Human("Аня", 29,"Москва"," Медотист образовательных программ");


        Human katya  = new  Human("Катя", 28, "Калининград", " Продакт-менеджер");


        Human artem  = new  Human("Артем", 27,"Москва"," Директор по развитию бизнес");

        Human vladimir  = new  Human("Владимир", 21,"Казань",null);

        printInfo(maxim);
        printInfo(anya);
        printInfo(katya);
        printInfo(artem);
        printInfo(vladimir);
    }
   private static void printInfo(Human human){
       System.out.println(" Привет! Меня зовут "+human.name+" Я из города "+human.getTown()+" Я родился в "+
               human.getYearOfBirth()+" году. Я работаю на должности "+human.specialist+". Будем знакомы!");
   }


}

