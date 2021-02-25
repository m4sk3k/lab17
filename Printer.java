public class Printer extends Orghtech{
    private String model;
    private int a4Amount;
    private int colorAmount;

    public Printer(){
        super();

        model = "";
        a4Amount = 100;
        colorAmount = 2000;
    }
    public Printer(String firm, String Model, int ink, int amountOfA4, int colors){
        super(firm, ink);
        model = Model;
        a4Amount = amountOfA4;
        colorAmount = colors;
    }
    public void setModel(String a){ model = a;}
    public String getModel(){ return model;}
    public void setA4Amount(int p){ a4Amount = p;}
    public int getA4Amount(){ return a4Amount;}
    public void setColorAmount(int y){ colorAmount = y;}
    public int getColorAmount(){ return colorAmount;}

    public String toString(){
        return "\n\tПринтер"+
                "\n\t"+"Фирма: "+getFirm()+
                "\n\t"+"модель: "+model+
                "\n\t"+"Кол-во чернил: " +getInkCount()+
                "\n\t" +"Кол-во листов: "+a4Amount+"" +
                "\n\t"+"Кол-во цветов: "+colorAmount;
    }
}
