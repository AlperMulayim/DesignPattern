package com.company;



import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Created by Alper on 8.02.2017.
 */
public class MoneyConvert {

    private String baseMoneyType;
    private double convertValue;
    private String convertMoneyType;
    private String responseDate;
    private  double baseValue;
    private double rate;

    public  MoneyConvert(String moneyType, String convertMoneyType,double value ){
        this.baseMoneyType = moneyType;
        this.convertMoneyType = convertMoneyType;
        this.baseValue = value;
        convertValue = -1;


    }
    public  void getMoneyValFromNet() throws ParseException, IOException {
        /*
        Scanner inputScan = new Scanner(System.in);

        System.out.println("-----STUDENT-----");
        System.out.print("Student Name >> ");
        String name = inputScan.nextLine();
        System.out.print("Student Course1  >> ");
        String course1 = inputScan.nextLine();
        System.out.print("Grade >> ");
        int grade1 =  inputScan.nextInt();


        //creating json
        JSONObject root =  new JSONObject();
        root.put("name",name);

        JSONObject courseObj = new JSONObject();
        courseObj.put("course",course1);
        courseObj.put("grade",grade1);


        JSONArray courseList = new JSONArray();
        courseList.add(courseObj);

        root.put("courses",courseList);


        System.out.println(root.toJSONString());

        JSONParser parser = new JSONParser();
        parser.parse(root.toJSONString());

        */

        URL url = new URL("http://api.fixer.io/latest?base=" + baseMoneyType);
        HttpURLConnection httpConnect =  (HttpURLConnection) url.openConnection();
        httpConnect.setDoOutput(true);
        httpConnect.setRequestMethod("GET");

        System.out.println("Response Code ::" +  httpConnect.getResponseCode());

        InputStreamReader reader  = new InputStreamReader(httpConnect.getInputStream());


        // reading the response
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(reader);
        if (bufferedReader != null) {
            int cp;
            while ((cp = bufferedReader.read()) != -1) {
                sb.append((char)cp);
            }
            bufferedReader.close();
        }
        //System.out.println("Response mes ::" + sb.toString());

        //string to json object
        String str = sb.toString();
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(str);

        //getting values in json object
        String base = (String) jsonObject.get("base");
        String date = (String) jsonObject.get("date");


       // System.out.println("BASE : " + base + "\tDATE : " +date);

        responseDate = date;
        JSONObject rateObject = (JSONObject) jsonObject.get("rates");

        double responsRate=(double) rateObject.get(convertMoneyType);
        //System.out.println("TRY : " + turkishlira);

        convertValue = responsRate * baseValue;
        rate = responsRate;

    }

    public String toString()
    {
        StringBuilder strB  = new StringBuilder();

        strB.append(" ..... Convert ....\n");
        strB.append("Date : ");
        strB.append(responseDate);
        strB.append("\n");
        strB.append(baseMoneyType);
        strB.append( " : ");
        strB.append(baseValue);
        strB.append("\t");
        strB.append(convertMoneyType);
        strB.append( " : ");
        strB.append(convertValue);
        strB.append("\n");

        return  strB.toString();
    }


    public static void main(String[] args) throws IOException, ParseException {
        MoneyConvert moneyConvert = new MoneyConvert("EUR","TRY",1);
        moneyConvert.getMoneyValFromNet();

        System.out.println(moneyConvert.toString());
        moneyConvert = new MoneyConvert("USD","EUR",10);
        moneyConvert.getMoneyValFromNet();
        System.out.println(moneyConvert.toString());

        moneyConvert = new MoneyConvert("TRY","EUR",1);
        moneyConvert.getMoneyValFromNet();
        System.out.println(moneyConvert.toString());

        moneyConvert = new MoneyConvert("TRY","JPY",1);
        moneyConvert.getMoneyValFromNet();
        System.out.println(moneyConvert.toString());



    }

}
