package gh;
import java.util.*;
class Program{
	 public static double findAngle(int hour1,int min1) {
		 double hour=(double)hour1;
		 double min=(double)min1;
		 double h = ((hour * 360) / 12) + ((min * 360) / (12 * 60));
		 
	        
	        double m = (min * 360) / (60);
	 
	        
	        double angle = Math.abs(h) - Math.abs(m);
	        //System.out.println(h+" "+m+" ");
	        
	        if (angle > 180) {
	            angle = 360 - angle;
	        }
	 
	        return angle;
	 }
	 
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int h=sc.nextInt();
		 int m=sc.nextInt();
		 System.out.println("Angle:"+findAngle(h,m));
	 }
 }

