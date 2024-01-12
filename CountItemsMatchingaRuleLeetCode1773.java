import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingaRuleLeetCode1773 {


    public static void main(String[] args) {
        int count;
        List<List<String>> items = new ArrayList<>();
        items.add(new ArrayList<>(Arrays.asList("phone", "blue", "pixel")));
        items.add(new ArrayList<>(Arrays.asList("computer", "silver", "lenovo")));
        items.add(new ArrayList<>(Arrays.asList("phone", "gold", "iphone")));
        System.out.println(items);
        count = countMatches(items, "color", "silver");
        System.out.println(count);
    }


    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;
        int ruleNo;
        if (ruleKey == "type") {
            ruleNo = 0;
        } else if (ruleKey == "color") {
            ruleNo = 1;
        } else {
            ruleNo = 2;
        }

        for (List<String> item : items) {
            if (item.get(ruleNo) == ruleValue) {
                count++;
            }
        }
        return count;
    }
}