/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ailatrieuphu;

import javax.swing.JLabel;

public class Clock  extends Thread{
    JLabel lblTime;
    public static int i=600;
    public static int j=0;
    public Clock(JLabel lblTime){
        this.lblTime = lblTime;
    }
    @SuppressWarnings("static-access")
public Clock(int a){
  this.i = a;
}
   
    @Override
        public void run()
        {
      
        while(i>0){
            i--;
           int minute = i/60;
          int Second = i -minute*60;
          String time  =  minute+":"+Second;
          if(Second<10){
          time =minute+":0"+Second;
          }
         // System.out.println(j);
          lblTime.setText(time);
          try {
                   j++;
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

              }
            }
        }
        
   public void reset(){
   i =600;
   j=0;
   }
    public static String TimePlay(){
          int minute = j/60;
          int Second = j -minute*60;
          //String time  =  minute+":"+Second;
          String time  =  minute+":"+Second;
          if(Second<10){
          time =minute+":0"+Second;
          }
          return time;
    }
     

     

}
