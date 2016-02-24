package com.flipkart.knn;

import java.util.Comparator;

/**
 * Created by akshay.us on 2/24/16.
 */
public class ResultRecordComparator implements Comparator<ResultRecord> {

    public static final ResultRecordComparator INSTANCE =  new ResultRecordComparator();

    private ResultRecordComparator(){}

    @Override
    public int compare(ResultRecord a, ResultRecord b) {
        if (a.distance == b.distance)
            return 0;
        else {
            if (a.distance < b.distance)
                return 1;
            else
                return -1;
        }
    }
}
