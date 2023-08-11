import java.util.Scanner;

public class hipotenus{

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int dikKenar1, dikKenar2;
        System.out.println("Lütfen dik üçgenin dik kenarlarından bir tanesinin uzunluğunu giriniz: ");
        dikKenar1=input.nextInt();
        System.out.println("Lütfen dik üçgenin dik kenarlarından diğerinin uzunluğunu giriniz:  ");
        dikKenar2=input.nextInt();
        double hipotenusUzunlugu=Math.sqrt(dikKenar1*dikKenar1+dikKenar2*dikKenar2);
        System.out.println("Hipotenüs uzunluğu: "+hipotenusUzunlugu);


        
    }


}