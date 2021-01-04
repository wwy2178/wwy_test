package com.example.mynewtest;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test() throws ParseException {
        String dataStr = "20201225";
        Calendar c = Calendar.getInstance();
        System.out.println("1年：" + c.get(Calendar.YEAR) + " , 1月：" +c.get(Calendar.MONTH) + " , 1日：" + c.get(Calendar.DATE));
//        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date strtodate = format.parse(dataStr);
        c.setTime(strtodate);
        boolean isToday = isToday(c);
        System.out.println("年：" + c.get(Calendar.YEAR) + " , 月：" +c.get(Calendar.MONTH) + " , 日：" + c.get(Calendar.DATE) + " , ==>isToday: " + isToday);
    }

    private boolean isToday(Calendar calendar) {

        Calendar c = Calendar.getInstance();
        if (c.get(Calendar.YEAR)==calendar.get(Calendar.YEAR) && c.get(Calendar.MONTH)==calendar.get(Calendar.MONTH)
                && c.get(Calendar.DATE)==calendar.get(Calendar.DATE)){
            return true;
        }else return false;

    }

    // 根据当前手机电量，实时更新电池视图的高度
    @Test
    public void divider() {

        int double1 = 6752, double2 = 10000;
//        try {
//
//
//            BigDecimal bg1 = new BigDecimal(double1);
//            BigDecimal bg2 = new BigDecimal(double2);
//            BigDecimal bg = bg1.divide(bg2,2,RoundingMode.FLOOR);
//            System.out.println(" 计算结果：  " + bg.toString() );
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        double2 = double2 == 0?10000:double2;
        try {
            BigDecimal num1 = new BigDecimal((double)double1);
            BigDecimal num2 = new BigDecimal((double)double2);
            BigDecimal bg = num1.divide(num2,2,RoundingMode.FLOOR);
            System.out.println("userLoginService --divider--计算对应的钱-> " + bg.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}