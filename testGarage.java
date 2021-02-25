import java.util.Scanner;

public class testGarage {

    public static void main(String[] args) {
        GarageCar myGarage=new GarageCar(); //создаем новый гараж
        Car myCar1=new Car("Ford", 200,"sad","Mustang",2,true); //создаем легковую машину
        myGarage.addCar(myCar1); // добавляем ее в гараж

        myGarage.addCar(new Car("LADA", 140, "dsa","Kalina", 4, false));//добавляем еще одну машину

        Truck myTruck=new Truck("Dove",160,"asd","BTS",700,true);//создаем грузовик
        myGarage.addCar(myTruck); //добавляем его в гараж
        myGarage.printGarage(); //выводи на экран содержимое гаража

        System.out.println("Вы хотите удалить какую нибудь машину? (да/нет)");
        Scanner sc = new Scanner(System.in);
        sc.reset();
        String choose = sc.nextLine();
        try {
            if ((choose.contains("Да")) || (choose.contains("да"))) {
                System.out.println("Какую машину вы хотите удалить?");
                int m = sc.nextInt();
                myGarage.remove(--m);
                System.out.println("Машина номер " + ++m + " была удалена");
                myGarage.printGarage();
            } else {
                System.out.println("Конец");
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Такой машины нет");
        }
    }
}
