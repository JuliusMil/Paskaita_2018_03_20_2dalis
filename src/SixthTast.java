import java.util.Arrays;

public class SixthTast {
    public static void main(String[] args) {
        String[] masyvas1= {"1","2","3","4"};
        String[] masyvas2= {"a","b","c","d"};
        System.out.println(Arrays.toString(mixMasyvas(masyvas1,masyvas2)));
    }
    private static String[] mixMasyvas(String[] masyvas1, String[] masyvas2){
        String[] masyvas3= new String[masyvas1.length+masyvas2.length];
        int a=0;
        int b=1;
        for (int i= 0; i<masyvas1.length; i++){
            masyvas3[a]= masyvas1[i];
            masyvas3[b]= masyvas2[i];
            a=a+2;
            b=b+2;
        }
        return masyvas3;
    }
}
