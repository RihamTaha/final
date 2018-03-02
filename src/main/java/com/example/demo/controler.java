package com.example.demo;

import Dot.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;

@RestController
public class controler {

    @RequestMapping(value="/find/{country}",method = RequestMethod.GET)
    public  Application_1 find(@PathVariable ("country") String country )
    {
        final String url="http://api.openweathermap.org/data/2.5/weather?q="+country+"&appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate  tr=new RestTemplate();
        Application_1 r = tr.getForObject(url,Application_1.class);
        return r;
    }

    @RequestMapping(value="/Name/{country}",method = RequestMethod.GET)
    public  Application_1 f(@PathVariable ("country") String country )
    {
        final String url="http://api.openweathermap.org/data/2.5/weather?q="+country+",uk&appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate  tr=new RestTemplate();
        Application_1 r = tr.getForObject(url,Application_1.class);
        return r;
    }

    @RequestMapping(value="/ID/{CityID}",method = RequestMethod.GET)
    public  Application_1 f1(@PathVariable ("CityID") int ID )
    {
        final String url="http://api.openweathermap.org/data/2.5/weather?id="+ID+"&appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate  tr=new RestTemplate();
        Application_1 r = tr.getForObject(url,Application_1.class);
        return r;
    }


    @RequestMapping(value="/geographic_coordinates/{num1}/{num2}",method = RequestMethod.GET)
     public  Application_1 f2(@PathVariable ("num1") int num1,@PathVariable ("num2") int num2)

    {
        final String url="http://api.openweathermap.org/data/2.5/weather?lat="+num1+"&lon="+num2+"&appid=f09cd168ee19b4943e8841a6ad89a042";

        RestTemplate  tr=new RestTemplate();
        Application_1 r = tr.getForObject(url,Application_1.class);
        return r;
    }


    @RequestMapping(value="/Zip/{ZipCode}",method = RequestMethod.GET)
    public  Application_1 f3(@PathVariable ("ZipCode") int ZipCode )
    {
        final String url="http://api.openweathermap.org/data/2.5/weather?zip="+ZipCode+"&appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate  tr=new RestTemplate();
        Application_1 r = tr.getForObject(url,Application_1.class);
        return r;
    }

    @RequestMapping(value="/Multilingual_support/{id}/{lang}",method = RequestMethod.GET)
    public  Application_1 f4(@PathVariable ("id") int id,@PathVariable ("lang") String lang)
    {
        final String url="http://api.openweathermap.org/data/2.5/weather?id="+id+"&lang="+lang+"&appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate  tr=new RestTemplate();
        Application_1 r = tr.getForObject(url,Application_1.class);
        return r;
    }
  /*  @RequestMapping(value="/find/{num1}/{num2}/{num3}",method = RequestMethod.GET)
    public  Application_1 f5(@PathVariable ("num1") int num1,@PathVariable ("num2") int num2,@PathVariable ("num3") int num3)
    {
        final String url="http://api.openweathermap.org/data/2.5/weather?lat="+num1+"&lon="+num2+"&cnt="+num3+"&appid=f09cd168ee19b4943e8841a6ad89a042";

        RestTemplate  tr=new RestTemplate();
        Application_1 r = tr.getForObject(url,Application_1.class);
        return r;
    }
*/
    // @RequestMapping (value="/hello", method = RequestMethod.GET )
   // public String  getHello(){return "Hello World";}
    //@RequestMapping(value = "/legaues")
    //public String getHello(){
      //  return "Hello World";
    }

