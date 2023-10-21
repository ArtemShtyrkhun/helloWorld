public class psvm {
    public static void main(String[] args) {
       int days = 10000;
       int year = days / 365;
       int months = (days - (year*365))/30;
       int leftdays = (days - (year * 365) - (months*30));
        System.out.println(year);
        System.out.println(months);
        System.out.println(leftdays);
    }


}
