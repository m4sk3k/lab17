import java.util.ArrayList;

public class Office {
    private ArrayList<Orghtech> mag = new ArrayList<Orghtech>();
    public void addOffice(Orghtech m){ mag.add(m); }
    public Office(){}
    public Office(ArrayList<Orghtech> n){ mag = n;}

    public void printMagazine(){
        System.out.println("В офисе: ");
        for (Orghtech a:mag){
            System.out.println("\t"+a.toString());
        }
    }
    public void kolAll(){
        int b = 0;
        int j = 0;
        for (Orghtech a:mag){
            if(a instanceof Printer){
                b++; }
            else if (a instanceof Scanner){
                j++; }
        }
        System.out.println("\nКоличество принтеров в офисе: "+b
                +"\nКоличество сканеров в офисе: "+j);
    }
}