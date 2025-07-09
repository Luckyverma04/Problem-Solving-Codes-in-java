public class AM_PM {
    public static String Time(String s){
        String period=s.substring(s.length()-2);
        String parts[]=s.substring(0,8).split(":");
        int hours=Integer.parseInt(parts[0]);
        String minutes=parts[1];
        String seconds=parts[2];
        if(period.equals("AM")){
            if(hours==12){
                hours=0;

            }
        }
        else{
            if(hours!=12){
                hours+=12;

            }
        }

      return String.format("%02d:%s:%s", hours, minutes, seconds);


    }
    public static void main(String args[]){
        String s="07:05:45 PM";
        System.out.println(Time(s));
        s="12:00:00 AM";
        System.out.println(Time(s));
        s="12:00:00 PM";
        System.out.println(Time(s));
        s="01:00:00 AM";
        System.out.println(Time(s));
        s="01:00:00 PM";
        System.out.println(Time(s));
    }
}
