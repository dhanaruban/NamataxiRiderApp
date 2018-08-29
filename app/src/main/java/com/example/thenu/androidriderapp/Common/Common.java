package com.example.thenu.androidriderapp.Common;

import com.example.thenu.androidriderapp.Remote.FCMClient;
import com.example.thenu.androidriderapp.Remote.GoogleMapAPI;
import com.example.thenu.androidriderapp.Remote.IFCMService;
import com.example.thenu.androidriderapp.Remote.IGoogleAPI;

public class Common {
    public  static final String driver_tb1 = "Drivers";
    public  static final String user_driver_tb1 = "DriversInformation";
    public  static final String user_rider_tb1 = "RidersInformation";
    public  static final String pickup_request_tb1 = "PickupRequest";
    public  static final String token_tb1 = "Tokens";
    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com/";
    public static final String googleAPIUrl = "https://maps.googleapis.com/";
    public static double base_fare = 2.55;
    public static double time_rate = 0.35;
    public static double distance_rate = 1.75;

    public static double getPrice(double km,int min)
    {
        return (base_fare+(time_rate*min)+(distance_rate*km));
    }

    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
    public static IGoogleAPI getGoogleService()
    {
        return GoogleMapAPI.getClient(googleAPIUrl).create(IGoogleAPI.class);
    }

}
