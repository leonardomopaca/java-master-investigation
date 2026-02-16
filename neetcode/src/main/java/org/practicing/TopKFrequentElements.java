package org.practicing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> [] freq = new List[nums.length + 1];

        for(int i =0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        return null;
    }
}
