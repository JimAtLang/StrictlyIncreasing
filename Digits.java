import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digits;
    public Digits(int number){
        digits= new ArrayList<>();
        while(number>0){
            digits.add(number%10);
            number=number/10;

        }
    }
    public ArrayList<Integer> getDigits() {
        return digits;
    }
    public void setDigits(ArrayList<Integer> digits) {
        this.digits = digits;
    }
    public int getDigit(int n){
        return digits.get(n);
    }
    public boolean isStrictlyIncreasing(){
        int n=digits.size()-1;
        int biggest=0;
        while(n>=0){
            if(digits.get(n)>biggest){
                biggest=digits.get(n);
                n-=1;
            } else{ return false;}
        }
        return true;

    }
}
