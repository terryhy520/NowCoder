/*
 * Copyright (c) 2021. Terry All Rights Reserved.
 * FileName: Merge.java
 * @author: terryhy520@gmail.com
 * @date: 8/16/21, 9:55 PM
 * @version: 1.0
 */

package bytedance;

import java.util.ArrayList;

/**
 * @Author: Terry
 * @Date: 8/16/2021 9:55 PM
 */
public class Merge {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return new ArrayList<>();
        }

        ArrayList<Interval> result = new ArrayList();
        Interval current = null;
        for (int i = 0; i < intervals.size();i++) {
            if (current == null) {
                current = new Interval(intervals.get(i).start, intervals.get(i).end);
            } else {
                if (intervals.get(i).start <= current.end) {
                    current.end = intervals.get(i).end;
                } else {
                    result.add(current);
                    current = new Interval(intervals.get(i).start, intervals.get(i).end);
                }
            }
        }
        result.add(current);
        return result;
    }
}
