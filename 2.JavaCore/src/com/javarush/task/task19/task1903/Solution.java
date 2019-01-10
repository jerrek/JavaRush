package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{


    public static Map<String, String> countries = new HashMap<String, String>();
    static  {
        Solution.countries.put("UA","Ukraine");
        Solution.countries.put("RU", "Russia");
        Solution.countries.put("CA", "Canada");

    }

    public static class IncomeDataAdapter implements Contact, Customer {

        private IncomeData data;

        IncomeDataAdapter(IncomeData incomeData)
        {
            this.data = incomeData;
        }

        public String getCompanyName()
        {
            return this.data.getCompany();
        }

        public String getCountryName()
        {
            return countries.get(this.data.getCountryCode());

        }

        public String getName()
        {
            return this.data.getContactLastName() + ", " + this.data.getContactFirstName();
        }

        public String getPhoneNumber()
        {
            String temp = "";
            String z = Integer.toString(this.data.getPhoneNumber());
            int count = z.length();
            for (int i = 0; i < 10 - count; i++)
            {
                temp = temp + 0;
            }
            temp = temp + z;

            return "+" + this.data.getCountryPhoneCode() +"(" + temp.substring(0,3) + ")" + temp.substring(3,6) + "-" + temp.substring(6,8) + "-" + temp.substring(8);
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}