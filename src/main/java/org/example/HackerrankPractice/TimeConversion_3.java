package org.example.HackerrankPractice;

public class TimeConversion_3 {
    /**
     * Given a time in
     * -hour AM/PM format, convert it to military (24-hour) time.
     *
     * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
     * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
     *
     * Example
     * Return '12:01:00'.
     *
     * Return '00:01:00'.
     * @param time string value of format- hh:mm:ssAM or hh:mm:ssPM
     */
    public static String timeConversion(String time) {
        // Write your code here
        int hour;
        char[] chararray=time.toCharArray();
        StringBuilder MinutesSeconds= new StringBuilder();
        for (int i = 2; i < chararray.length-2; i++) {
            MinutesSeconds.append(chararray[i]);
        }
        System.out.println("Rest Of Time: "+MinutesSeconds);


        if(chararray[chararray.length-2]=='A') {
            String hrs= String.valueOf(chararray[0]);
            String hr=String.valueOf(chararray[1]);
            if (Integer.parseInt(hrs)!=0){
                hour = Integer.parseInt(hrs.concat(hr));
            }else {
                hour = Integer.parseInt(hr);
            }
            if(hour==12){
                return "00".concat(MinutesSeconds.toString());
            }
            if(hour>0 & hour<10){
                return "0"+ hour + MinutesSeconds;
            }
            if(hour>9 & hour<12){
                return hour + MinutesSeconds.toString();
            }

        }else {
            String hrs= String.valueOf(chararray[0]);
            String hr=String.valueOf(chararray[1]);
            if (Integer.parseInt(hrs)!=0){
                hour = Integer.parseInt(hrs.concat(hr));
            }else {
                hour = Integer.parseInt(hr);
            }
            if(hour>0 & hour<12){
                hour=hour+12;

            }
        }

        return (String.valueOf(hour)+MinutesSeconds);
    }
    public static void main(String[] args) {
        System.out.println("Testing Time Conversion...");
        String time = TimeConversion_3.timeConversion("12:05:59AM");
        System.out.println(time);
    }
}
