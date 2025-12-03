/*
* Name: Group Team Project 
* Purpose: Creating a theme park management system with rides and taking inputted data
* Programmer: Parth Thite, Angel Carmichael, Lucas Campbell, and Sham Nemer
* Date: 12 / 07 / 2025
*/ 

/**
 * Name: park.java
 * Purpose: Parent abstract class, setting up genera; variables and methods to be used in child classes
 */

public abstract class park {
    // Intial
    private int maxRiders;
    private String nameOfRide;
    private double ticketCost;
    private double rideDuration;
    private int attendants;
    private double utilityCostPerHour;
    private double hoursPerDay;
    private double speed;
    
//Constructor
    public park (int maxRiders, String nameOfRide, double ticketCost, double rideDuration, int attendants, double utilityCostPerHour, double hoursPerDay, double speed) {
        this.maxRiders = maxRiders;
        this.nameOfRide = nameOfRide;
        this.ticketCost = ticketCost;
        this.rideDuration = rideDuration;
        this.attendants = attendants;
        this.utilityCostPerHour = utilityCostPerHour;
        this.hoursPerDay = hoursPerDay;
        this.speed = speed;
    }

// Creating all the getters and setters for each variable
    public String getNameOfRide() {
        return nameOfRide;
    }

    public void setNameOfRide(String nameOfRide) {
        this.nameOfRide = nameOfRide;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

    public int getMaxRiders() {
        return maxRiders;
    }
    
    public void setMaxRiders(int maxRiders){
        this.maxRiders = maxRiders;
    }

    public double getRideDuration(){
        return rideDuration;
    }

    public void setRideDuration(double duration){
        this.rideDuration = duration;
    }
    
    public int getAttendants() {
        return attendants;
    }
    
    public void setAttendants(int attendants){
        this.attendants = attendants;
    }
        
    public double getUtilityCostPerHour(){
        return utilityCostPerHour;
    }

    public void setUtilityCostPerHour(double utilityCostPerHour){
        this.utilityCostPerHour = utilityCostPerHour;
    }

    public double gethoursPerDay(){
        return hoursPerDay;
    }

    public void sethoursPerDay(double hoursPerDay){
        this.hoursPerDay = hoursPerDay;
    }
    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    
    //  Methods to calculate daily revenue, cost, and profit

    public double calculateDailyRevenue(){
        double ridesPerHour = hoursPerDay / rideDuration;
        double totalRidersPerDay = ridesPerHour * maxRiders;
        return totalRidersPerDay * ticketCost;
    }

    public double calculateDailyCost(){
        double totalUtilityCost = utilityCostPerHour * hoursPerDay;
        double attendantWages = attendants * 15 * hoursPerDay; // Might need to change the wage rate!
        return totalUtilityCost + attendantWages;
    }

    public double calculateDailyProfit(){
        return calculateDailyRevenue() - calculateDailyCost();
    }
    
    // Abstract methods to calculate pukefactor and outcome of the ride
    
    public abstract double calculatePukeFactor();
    
    public abstract String rideOutcome();
}

