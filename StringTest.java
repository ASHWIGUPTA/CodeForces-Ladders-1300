import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTest {

    public static void function(Integer[] a, int k, int l){
        int totalOfKAndL = 0;

        int max=Math.max(k, l);
        int min=Math.min(k, l);
        
        Integer[] maxAndStartingIndex = getMaxContiguosFromArray(a, max);
        totalOfKAndL+=maxAndStartingIndex[0];
        System.out.println(maxAndStartingIndex[0]);
        Integer[] leadingElements = Arrays.copyOfRange(a, 0, maxAndStartingIndex[1]);
        Integer[] trailingElements = Arrays.copyOfRange(a, (maxAndStartingIndex[1]+max), a.length);

        //List<Integer> mergedLeadingAndTrailingElements = new ArrayList(Arrays.asList(leadingElements));
        //mergedLeadingAndTrailingElements.addAll(Arrays.asList(trailingElements));
        //nteger[] mergedLeadingAndTrailingElementsArray =  mergedLeadingAndTrailingElements.toArray(new Integer[0]);

         int sum= Math.max(getMaxContiguosFromArray(leadingElements, l)[0],getMaxContiguosFromArray(trailingElements, l)[0]);;
        System.out.println(sum);
        if(sum!=0)
        {        totalOfKAndL+=sum;
        System.out.println(totalOfKAndL);
        }
        else{
        	System.out.println(-1);}
        }

    static Integer[] getMaxContiguosFromArray(Integer[] a, int numberOrElements){
        int sumForFirst = 0;
        int sumForFirstPrev = 0;
        int startingIndexForK = 0;
        Integer[] maxAndStartingIndex = new Integer[2];
        for(int i = 0; i < a.length; i++){
            if(i <= a.length - numberOrElements) {
                for (int j = i; j < i + numberOrElements; j++) {
                    sumForFirst += a[j];
                }
            }

            if(sumForFirst >  sumForFirstPrev) {
                sumForFirstPrev = sumForFirst;
                startingIndexForK = i;

            }
            sumForFirst = 0;
        }
        maxAndStartingIndex[0] = sumForFirstPrev;
        maxAndStartingIndex[1] = startingIndexForK;
        return maxAndStartingIndex;
    }

    public static void main(String[] args) {
        Integer a[] = {6, 11,4,6,3,2,7,4};

        function(a, 3,2);

    }
}