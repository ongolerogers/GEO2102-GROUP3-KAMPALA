package com.geo2102;

public class HostelMapping {

    static class Hostel {
        String group, hostelID, hostelName, accommodationType, occupancyStatus;
        double rentalPrice, latitude, longitude;

        Hostel(String group, String hostelID, String hostelName,
               String accommodationType, double rentalPrice,
               String occupancyStatus, double latitude, double longitude) {
            this.group = group;
            this.hostelID = hostelID;
            this.hostelName = hostelName;
            this.accommodationType = accommodationType;
            this.rentalPrice = rentalPrice;
            this.occupancyStatus = occupancyStatus;
            this.latitude = latitude;
            this.longitude = longitude;
        }
    }

    public static void main(String[] args) {

        Hostel[] hostels = {
            new Hostel("6","H24","Legacy Hostel","Self-contained (Single)",800000,"Occupied",0.60398557,32.47622200),
            new Hostel("6","H25","Divine Hostel","Self-contained (Single)",700000,"Occupied",0.60363355,32.47482400),
            new Hostel("6","H26","Vanessa Hostel","Not self-contained (Single)",500000,"Occupied",0.60272031,32.47546300),
            new Hostel("6","H27","Mwega Hostel","Not self-contained (Single)",500000,"Partially Occupied",0.60115667,32.47451400),
            new Hostel("7","H28","Ndagire Hostel","Not self-contained (Single)",650000,"Occupied",0.59956501,32.47472400),
            new Hostel("7","H29","Lisan Hostel","Self-contained (Single)",500000,"Occupied",0.59909215,32.47448900),
            new Hostel("7","H30","Moze Hostel (Twins Guest House)","Self-contained (Double)",1000000,"Occupied",0.59838342,32.47535000),
            new Hostel("7","H31","Peaches","Half self-contained (Single)",800000,"Partially Occupied",0.59806894,32.47610500),
            new Hostel("8","H32","Duncans Hostel","Self-contained (Single)",500000,"Occupied",0.60030780,32.47374200),
            new Hostel("8","H33","Badlands","Self-contained (Single)",700000,"Occupied",0.60133637,32.47352600),
            new Hostel("8","H34","Orange Hostel","Self-contained (Single)",700000,"Occupied",0.60510600,32.47449600),
            new Hostel("8","H35","Ministers' Village","Half self-contained (Double)",700000,"Occupied",0.60654727,32.47431000)
        };

        double totalRentalPrice = 0;
        int fullyOccupiedCount = 0;
        int notFullyOccupiedCount = 0;

        for (Hostel hostel : hostels) {

            boolean isOccupied =
                    hostel.occupancyStatus.equalsIgnoreCase("Occupied");

            System.out.println("----------------------------------------");
            System.out.println("Group: " + hostel.group);
            System.out.println("Hostel ID: " + hostel.hostelID);
            System.out.println("Hostel Name: " + hostel.hostelName);
            System.out.println("Accommodation Type: " + hostel.accommodationType);
            System.out.printf("Rental Price: UGX %,.0f%n", hostel.rentalPrice);
            System.out.println("Occupancy Status: " + hostel.occupancyStatus);
            System.out.println("Latitude: " + hostel.latitude);
            System.out.println("Longitude: " + hostel.longitude);
            System.out.println("isOccupied: " + isOccupied);

            if (isOccupied) {
                System.out.println("Report: Fully Occupied");
                fullyOccupiedCount++;
            } else {
                System.out.println("Report: Not Fully Occupied");
                notFullyOccupiedCount++;
            }

            totalRentalPrice += hostel.rentalPrice;
        }

        double averageRentalPrice = totalRentalPrice / hostels.length;

        System.out.println("\n========================================");
        System.out.println("HOSTEL MAPPING DATASET SUMMARY");
        System.out.println("========================================");
        System.out.println("Total Hostels: " + hostels.length);
        System.out.printf("Average Rental Price: UGX %,.2f%n", averageRentalPrice);
        System.out.println("Fully Occupied Hostels: " + fullyOccupiedCount);
        System.out.println("Not Fully Occupied Hostels: " + notFullyOccupiedCount);
        System.out.println("========================================");
    }
}
