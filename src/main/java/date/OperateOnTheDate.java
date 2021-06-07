package date;

import java.util.Calendar;
import java.util.Date;

/**
 * 此Demo用于对日期、时间等操作的简单演示.
 *
 * @author Wang Guanfei
 * @version V2.0.1
 * @date 2021/6/2 9:53
 * @Package date
 */
public class OperateOnTheDate {

    private OperateOnTheDate() {
    }

    public static void main(final String[] args) {
        //日期计算
        dateCalculation();
    }

    /**
     * 日期计算.
     */
    private static void dateCalculation() {
        //获取日历实例
        Calendar instance = Calendar.getInstance();
        //通过计算方法传入计算等级（年、月、日）以及加或减的时间
        instance.add(Calendar.DAY_OF_YEAR, -6);
        getCalendar(instance);
    }

    /**
     * 获取当前日期.
     * @param cal 日期实例
     * @author PIANLI
     * @date 2021/6/2 11:06
     */
    private static void getCalendar(final Calendar cal) {
        int y = cal.get(Calendar.YEAR);
        int m = cal.get(Calendar.MONTH);
        int d = cal.get(Calendar.DATE);
        int h = cal.get(Calendar.HOUR_OF_DAY);
        int mi = cal.get(Calendar.MINUTE);
        int s = cal.get(Calendar.SECOND);

        Date time = cal.getTime();
        System.out.println("现在时刻是" + y + "年" + (m + 1) + "月" + d + "日" + h + "时" + mi + "分" + s + "秒");
        
    }


}
