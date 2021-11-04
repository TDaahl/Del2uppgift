public class Counter{
    private int Chars;
    private int Lines;

    public Counter(){
        Chars = 0;
        Lines = 0;
    }

    public void cAmount(int C){
        Chars = Chars + C;
    }
    public void lAmount(){
        Lines = Lines + 1;
    }

    public int getLines(){
        return Lines;
    }
    public int getChars(){
        return Chars;
    }
    public Boolean isStopWord(String Stop){
        return
        Stop.equalsIgnoreCase("stop");

    }

}