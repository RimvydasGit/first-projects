import java.util.ArrayList;
import java.util.Scanner;
public class Registratura {
    ArrayList<Person> persons = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void start() {   
        while(true) {
            spausdintiMenu();
            int pasirinkimas = getUserResponse();
            if( apdoroti(pasirinkimas) ) {
                break;
            }
        }
        System.out.println("Aciu. Darba baigiau");
    }
    private boolean apdoroti(int pasirinkimas) {
        switch(pasirinkimas) {
            case 0: //baigti darba
                return true;
            case 1: 
                pridetiAsmeni();
                return false;
            case 2: 
                spausdintiSarasa();
                return false;
            case 3: 
                trintiAsmeni();
                return false;
        }       
        return true;
    }       
    private void trintiAsmeni() {
        System.out.println("Iveskite asmens koda trynimui");
        int ak = getUserResponse();
        Person asmuo = null;
        for(Person p : persons) {
            if( p.getAk() == ak)
                asmuo = p;
        }
        if( asmuo == null ) {
            System.out.println("Asmens su kodu " + ak + " neradome");
            return;
        }
        persons.remove(asmuo);
        System.out.println("Asmuo su kodu " + ak + " buvo pasalintas");
    }
    private void spausdintiSarasa() {
        for(Person p : persons) {
            System.out.println(p);
        }
    }
    private void pridetiAsmeni() {
        persons.add( sukurtiAsmeni() );     
    }
    private Person sukurtiAsmeni() {
        System.out.println("Iveskite asmens varda");
        String vardas = sc.nextLine();
        while(true) {
            System.out.println("Iveskite asmens koda");
            String text = sc.nextLine();
            if( Utils.isNumeric( text )) {
                int ak = Integer.parseInt(text);
                return new Person(vardas, ak );
            }
            System.out.println("Ivestas blogas asmens kodas.");
        }
    }   
    private int getUserResponse() {
        while(true) {
            String text = sc.nextLine();
            if( Utils.isNumeric( text )) {
                return Integer.parseInt(text);              
            }
            System.out.println("Ivesti blogi duomenys.");
        }           
    }   
    private void spausdintiMenu() {
        System.out.println( "1. Prideti i sarasa nauja asmeni" );
        System.out.println( "2. Spausdinsime sarasa" );
        System.out.println( "3. Pasirinkti asmeni istrynimui" );
        System.out.println( "0. Baigti darba" );
    }
}
