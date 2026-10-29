
class Solution {
      public int countDays(String date) {

        
        String[] arr = date.split("-");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);
        int total = 0;
        for (int i = 1971; i < year; i++) {
            total += isLeap(i) ? 366 : 365;
        }
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeap(year)) days[1] = 29;
        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }
        total += day;
        return total;
    }
    
    public boolean isLeap(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }


    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(countDays(date1) - countDays(date2));
    }
}
