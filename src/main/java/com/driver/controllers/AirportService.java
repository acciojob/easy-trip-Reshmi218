package com.driver.controllers;


import com.driver.model.Airport;
import com.driver.model.City;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AirportService {


    private AirportRepository repo  = new AirportRepository();

    public void addairport(Airport a){
        repo.addAirport(a);
    }

    public String getlargestAirport(){
        return repo.getLargestAirport();
    }

    public double getshortestTimeTravel(City from , City to){
        return repo.getShortestTimeTravel(from, to);
    }

    public int getNumberOfPeopleHavingfight(Date date , String airPortName){
        return repo.getNumberOfPeopleHavingFight(date , airPortName);
    }

    public int getfare(Integer flightId){
        return repo.getFare(flightId);
    }

    public String bookticket(Integer fightId  , Integer passengerId){
        return repo.bookTicket(fightId , passengerId);
    }

    public String cancelticket(Integer fId , Integer pId){
        return repo.cancelTicket(fId , pId);
    }

    public int countOfbookingDoneByaPassenger(Integer pId){
        return repo.countOfBookingDoneByaPassenger(pId);
    }

    public String  addflight(Flight f){
        return repo.addFlight(f);
    }

    public String getAirportNamefromFlightId(Integer fId){
        return repo.getAirportNameFromFlightId(fId);
    }

    public int getrevenueOfAFlight(Integer fId){
        return repo.getRevenueOfAFlight(fId);
    }

    public String addpassenger(Passenger p){
        return repo.addPassenger(p);
    }

}
