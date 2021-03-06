package com.example.safe_eats;

import java.util.Date;

enum InspectionType {Routine, Followup};

enum HazardRating {Low, Medium, High}

public class Inspection {
    public Inspection(String trackingNumber, int id) {
        setTrackingNumber(trackingNumber);
        setId(id);
    }

    private int numCritical;
    private HazardRating hazardRating;
    private int numNonCritical;
    private Date inspectionDate;
    private float rank;
    private int count;
    private InspectionType inspectionType;
    private String description;
    private String trackingNumber;
    private int id;

    public int getNumCritical() {
        return numCritical;
    }

    public void setNumCritical(int numCritical) {
        this.numCritical = numCritical;
    }

    public HazardRating getHazardRating() {
        return hazardRating;
    }

    public void setHazardRating(HazardRating hazardRating) {
        this.hazardRating = hazardRating;
    }

    public int getNumNonCritical() {
        return numNonCritical;
    }

    public void setNumNonCritical(int numNonCritical) {
        this.numNonCritical = numNonCritical;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public float getRank() {
        return rank;
    }

    public void setRank(float rank) {
        this.rank = rank;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public InspectionType getInspectionType() {
        return inspectionType;
    }

    public void setInspectionType(InspectionType inspectionType) {
        this.inspectionType = inspectionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public int getId() {
        return id;
    }

    private void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    private void setId(int id) {
        this.id = id;
    }
}
