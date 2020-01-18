public class SpeedConverter {
    
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1L;
        } else {
            return (long) Math.round(kilometersPerHour/1.609);
        }
    }
    
    public static void printConversion(double kilometersPerHour){
        float XX = (float) kilometersPerHour;
        long YY = toMilesPerHour(kilometersPerHour);
        if(YY<0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(XX+" km/h = "+YY+" mi/h");    
        }
    }
}