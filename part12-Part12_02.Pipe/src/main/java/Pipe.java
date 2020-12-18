
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author be-krishna
 */
public class Pipe<T> {

    private List<T> contents;

    public Pipe() {
        this.contents = new ArrayList();
    }

    public void putIntoPipe(T value) {
        this.contents.add(0, value);
    }
    
    public T takeFromPipe(){
        if(this.contents.isEmpty()){
            return null;
        }
        
        int lastIndex = this.contents.size()-1;
        
        T temp = this.contents.get(lastIndex);
        
        this.contents.remove(lastIndex);
        
        return temp;
    }
    
    public boolean isInPipe(){
        if(this.contents.isEmpty()){
            return false;
        }
        return true;
    }
}
