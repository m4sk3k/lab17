public class testing {
    public static void main(String[] args) {
        Office newOff = new Office();
        Printer prent = new Printer("Xerx", "Fax",228, 322, 128);
        newOff.addOffice(prent);
        newOff.addOffice(new Printer("Sasung","Gaylaxy print 7",257,50,256));
        newOff.addOffice(new Printer("Panasoanic","Yes",1023,25,1024));

        Scanner scan = new Scanner("Why","Do",2077,2077);
        newOff.addOffice(scan);
        newOff.addOffice(new Scanner("You","Cum",2077, 2077));
        newOff.printMagazine();
        newOff.kolAll();
    }
}
