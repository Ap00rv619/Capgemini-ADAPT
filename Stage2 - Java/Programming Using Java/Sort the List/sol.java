import java.util.*;
public class Source {
    //CODE HERE
    public static List<String> sort(String wd){
            if(wd==null){
                return new ArrayList<String>();
            }
            String [] a=wd.split(" ");
            for(int i=1;i<a.length;i++){
                String t=a[i];
                int j=i-1;
                while(j>=0 && t.length()<a[j].length()){
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=t;
            }
            List<String> p=Arrays.asList(a);
            return p;
    }
    public static void main(String[] args) {
    //CODE HERE    
    }
}
