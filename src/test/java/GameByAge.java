import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GameByAge {
    @Test
    public void SortStudents() {
        char ch = 'A';
        int arr[] = {18, 20, 21, 21, 23};
        HashMap<Character, List<Integer>> hm = new HashMap();
        Arrays.sort(arr);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int difference = arr[i] - min;
            if (difference <= 2) {
                if (hm.containsKey(ch)) {
                    List<Integer> a1 = hm.get(ch);
                    a1.add(arr[i]);
                } else
                {
                    List<Integer> a1 = new ArrayList<Integer>();
                ch = (char) (ch + 1);
                a1.add(arr[i]);
                hm.put(ch, a1);
            }
        }
        else
        {
            ch = (char) (ch + 1);
            min = arr[i];
            List<Integer> a1 = new ArrayList();
            a1.add(arr[i]);
            hm.put(ch, a1);
        }
    }
    for (char c: hm.keySet())
    {
        System.out.println("Groups "+hm.get(c));

        }
    }
}
