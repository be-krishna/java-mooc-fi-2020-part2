

public class Checker {
    public boolean isDayOfWeek(String string){
        
        if(string.matches("[a-z]{3}")){
            return true;
        }
        
        return false;
    }
    
    public boolean allVowels(String string){
        if(string.matches("(a|e|i|o|u)+")){
            return true;
        }
        return false;
    }
    
    public boolean timeOfDay(String string){
        if(string.matches("([01][0-9]|2[0-3])(:[0-5][0-9]){2}")){
            return true;
        }
        return false;
    }
}
