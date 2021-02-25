public class Orghtech {
    private String firm;
    private int inkCount;
    public void setFirm(String firma){
        firm=firma;
    }
    public void setInkCount(int ink){
        inkCount = ink;
    }
    public int getInkCount(){
        return inkCount;
    }
    public String getFirm(){ return firm; }
    public Orghtech(){
        firm = "Без названия";
        inkCount = 0;
    }
    public Orghtech(String firma, int year){
        firm = firma;
        inkCount = year;
    }
}
