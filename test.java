import java.util.Scanner; //подключаем класс для ввода данных с клавиатуры в консоли

public class test {
    public static void main(String[] args) {
        Auto myAuto1=new Auto("Ford",180, "Г013КС"); // создаем объект типа нашего класса
        System.out.println(myAuto1.getFirm()+" "+myAuto1.getMaxSpeed() + "\n");//вывод сведений в

        Auto myAuto2=new Auto(); //создаем объект типа нашего класса
        Scanner in = new Scanner(System.in); //создаем сканер для ввода данных из консоли
        System.out.print("Введите фирму: ");
        String nazv=in.next(); //считываем название из консоли !!!только 1 слово
        //т.к. in.next() считывает только символы до пробела, остальные символы отправляет
        //следующему оператору, связанному с консольным вводом
        myAuto2.setFirm(nazv); //задаем значение для параметра нашего класса
        System.out.print("Введите максимальную скорость: ");
        int s=in.nextInt();
        myAuto2.setMaxSpeed(s);
        System.out.print("Введите госномер авто: ");
        nazv=in.next();
        myAuto2.setGosnomer(nazv);
        System.out.println(myAuto2.getFirm()+" "+myAuto2.getMaxSpeed() + " " + myAuto2.getGosnomer() +"\n");

        Auto myAuto3=new Auto();
        System.out.print("Введите фирму: ");
        nazv=in.next();
        myAuto3.setFirm(nazv);
        System.out.print("Введите максимальную скорость: ");
        s=in.nextInt();
        myAuto3.setMaxSpeed(s);
        System.out.print("Введите максимальную скорость: ");
        nazv=in.next();
        myAuto3.setGosnomer(nazv);
        System.out.println("Какой-то автомобиль: "+myAuto3.getFirm()+" "+myAuto3.getMaxSpeed() + " " + myAuto3.getGosnomer());
        System.out.println();
        Car myCar1=new Car("Ford", 200,"kek","Mustang",2,false);
        Car myCar2=new Car();
        System.out.print("Введите фирму-производитель легкового авто: ");
        nazv=in.next();
        myCar2.setFirm(nazv);
        System.out.print("Введите максимальную скорость легкового авто: ");
        s=in.nextInt();
        myCar2.setMaxSpeed(s);
        System.out.print("Введите госномер легкового авто: ");
        nazv=in.next();
        myCar2.setGosnomer(nazv);
        System.out.print("Введите модель легкового авто: ");
        nazv=in.next();
        myCar2.setModel(nazv);
        System.out.print("Введите кол-во дверей легкового авто: ");
        s=in.nextInt();
        myCar2.setNumDoors(s);
        System.out.print("Введите признак полного привода легкового авто (true/false): ");
        Boolean f=in.nextBoolean();
        myCar2.setFullTime(f);
        System.out.println();
        System.out.println("Первый легковой автомобиль: "+myCar1.toString());
        System.out.println("Второй легковой автомобиль: "+myCar2.toString());
        Truck myTruck=new Truck();
        myTruck.setAllInfo();
        System.out.println(myTruck.toString());
    }
}
