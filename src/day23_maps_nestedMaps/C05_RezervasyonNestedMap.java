package day23_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C05_RezervasyonNestedMap {

    public static void main(String[] args) {

        /*

       {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2024-07-21",
                   "checkout" : "2024-08-10"
                      },
            "additionalneeds" : "wi-fi"
            }
       */

        Map<String, Object> rezervasyonMap = new HashMap<>();

        rezervasyonMap.put("firstname","Ahmet");
        rezervasyonMap.put("lastname","Bulut");
        rezervasyonMap.put("totalprice",500);
        rezervasyonMap.put("depositpaid",false);

        Map<String,String> bookingDatesmap = new HashMap<>();
        bookingDatesmap.put("checkin","2024-07-21");
        bookingDatesmap.put("checkout","2024-08-10");

        rezervasyonMap.put("bookingdates",bookingDatesmap);
        rezervasyonMap.put("additionalneeds","wi-fi");


        System.out.println(rezervasyonMap);

        /*
                {
                firstname=Ahmet,
                additionalneeds=wi-fi,
                bookingdates= {
                        checkin=2024-07-21,
                        checkout=2024-08-10
                        },
                totalprice=500,
                depositpaid=false,
                lastname=Bulut
                }
         */

    }
}
