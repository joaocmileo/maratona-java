package academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain;


//Infelizmente minha cachorrinha passou mal enquanto eu estava estudando, agora ela está internada
//Por isso só foi uma aula, vou tentar seguir amanhã

public class Car {
    private String name = "Fiat";
    private String color;
    private int year;

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
