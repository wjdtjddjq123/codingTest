package inheritance;

public class TV {
    boolean power;
    int channer;
    void power(){ power = !power;}
    void channerUp() { channer++;}
    void channerDown(){ channer--;}

}
class CaptionTV extends TV{
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}
