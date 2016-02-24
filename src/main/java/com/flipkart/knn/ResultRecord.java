package com.flipkart.knn;


class ResultRecord {
    ResultRecord() {}
    ResultRecord(String id, double distance) {
        this.id = id;
        this.distance = distance;
    }

    public String id;
    public double distance;
}
