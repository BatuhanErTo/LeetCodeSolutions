package ArraysHashing.Top_K_Frequent_Elements;

import java.util.*;
import java.util.stream.Collectors;
/*
       This solution time complexity is O(nlogn)
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> maps = new HashMap<>();
        for (int a : getElementsAsKey(nums)) {
            maps.put(a, 0);
        }
        for (int b : nums) {
            int val = maps.get(b);
            val++;
            maps.put(b, val);
        }
        List<Integer> orderedByFrequencyKeyList = maps.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(integerIntegerEntry -> integerIntegerEntry.getKey())
                .collect(Collectors.toList());
        int[] res = new int[k];
        for (int i = orderedByFrequencyKeyList.size() - 1; i >= 0 && k > 0; i--) {
            res[(orderedByFrequencyKeyList.size() - 1 - i)] = orderedByFrequencyKeyList.get(i);
            k--;
        }
        return res;
    }

    private Set<Integer> getElementsAsKey(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toCollection(HashSet::new));
    }
}
