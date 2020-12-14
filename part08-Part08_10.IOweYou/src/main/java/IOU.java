
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author be-krishna
 */
public class IOU {

    private HashMap<String, Double> record;

    public IOU() {
        this.record = new HashMap();
    }

    public void setSum(String toWhom, double amount) {
        double sumOwned = this.record.getOrDefault(toWhom, 0.0);
        sumOwned += amount;
        this.record.put(toWhom, sumOwned);
    }

    public double howMuchDoIOweTo(String toWhom) {
        double sumOwned = this.record.getOrDefault(toWhom, 0.0);
        return sumOwned;    
    }

}
