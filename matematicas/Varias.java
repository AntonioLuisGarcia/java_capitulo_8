package matematicas;

public class Varias{

    public static int voltea(int x){
        int volteado=0;
        while(x>0){
            volteado=(volteado*10)+x%10;
            x/=10;
        }

        return volteado;
    }

    public static boolean esCapicua(int x){
        if(voltea(x)==x){
            return true;
        }else{
            return false;
        }
    }


}