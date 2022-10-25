package hw1.taks1;

public class Human {
    public String name;
    private int yearOfBirth;
    private String town;
    public String specialist;



    public Human(String name, int yearOfBirth, String town, String specialist) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;

        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (specialist == null) {
            this.specialist = "Информация не указана";
        } else {
            this.specialist = specialist;
        }
    }



    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }public String getTown(){
        return town;
    }

    public void setTown(String town){
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
    }
    }

}
