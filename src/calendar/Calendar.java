package calendar;

import java.text.DateFormatSymbols;
import java.util.GregorianCalendar;

public class Calendar {
    public static void main(String[] args) {
        GregorianCalendar g= new GregorianCalendar();
        //本月
        int month = g.get(java.util.Calendar.MONTH);
        //当日
        int today = g.get(java.util.Calendar.DAY_OF_MONTH);

        //每周第一天
        int firstDayOfWeek = g.getFirstDayOfWeek();

        //将日期设为本月1号
        g.set(java.util.Calendar.DAY_OF_MONTH,1);
        int dayOfWeek = g.get(java.util.Calendar.DAY_OF_WEEK);

        int indent = 0;
        while(dayOfWeek != firstDayOfWeek){
            indent++;
            g.add(java.util.Calendar.DAY_OF_MONTH,-1);
            dayOfWeek = g.get(java.util.Calendar.DAY_OF_WEEK);
        }

       //打印星期
        String[] weekdaysNames = new DateFormatSymbols().getShortWeekdays();
        do{
            System.out.printf("%4s", weekdaysNames[dayOfWeek]);
            g.add(java.util.Calendar.DAY_OF_MONTH, 1);
            dayOfWeek = g.get(java.util.Calendar.DAY_OF_WEEK);
        }
        while(dayOfWeek != firstDayOfWeek);
        System.out.println();

        //打印缩进
        for(int i=1;i<=indent;i++){
            System.out.print("      ");
        }

        //再次将日期设为本月1号
        g.set(java.util.Calendar.DAY_OF_MONTH,1);

        //打印日期
        do {
            //打印每天
            int day = g.get(java.util.Calendar.DAY_OF_MONTH);
            System.out.printf("%6d", day);

            //日期为当日时，给日历打星号
            if(day == today) {
                System.out.println("*");
            }

            //加一天
            g.add(java.util.Calendar.DAY_OF_MONTH,1);
            dayOfWeek = g.get(java.util.Calendar.DAY_OF_WEEK);

            //换行
            if(dayOfWeek == firstDayOfWeek) {
                System.out.println();
            }
        }
        while(g.get(java.util.Calendar.MONTH) == month);
    }
}
