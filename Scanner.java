public class Scanner extends Orghtech{
    private String model;
    private int a4Amount;

    public Scanner(){
        super();
        model = "";
        a4Amount = 2000;
    }
    public Scanner(String firm, String Model, int ink,  int amountOfA4){
        super(firm, ink);
        model = Model;
        a4Amount = amountOfA4;
    }
    public void setModel(String g){ model =g;}
    public String getModel(){ return model;}
    public void seta4Amount(int y){ a4Amount = y;}
    public int geta4Amount(){ return a4Amount;}

    public String toString(){
        return "\n\tСканнер"+"" +
                "\n\t"+"Фирма: "+getFirm()+
                "\n\t"+"Модель: "+model+
                "\n\t"+"Кол-во чернил: "+getInkCount()+
                "\n\t"+"Кол-во листов: "+a4Amount;
    }
}
