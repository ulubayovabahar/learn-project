package lesson7polindrom;

public class Polindrom {
    public static void main(String[] args) {

        String soz = "ammam" ;
        String tersi = "";

        for(int i=soz.length()-1; i>=0; i--){
            tersi+=soz.charAt(i);
        }

        if(tersi.equals(soz)){
            System.out.println("Polidromdur");
            System.out.println(tersi);
        }else{
            System.out.println("Polidrom deyil");
        }



    }
}
