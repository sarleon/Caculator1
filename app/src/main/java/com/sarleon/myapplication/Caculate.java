package com.sarleon.myapplication;

import android.widget.TextView;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by root on 16-3-8.
 */
public class Caculate {
    public static String getResult(String formula){


        String cal="";
        String regex="(\\+|-|×|÷|\\^)";
        Pattern pattern=Pattern.compile(regex);
        System.out.println(pattern);
        Matcher matcher=pattern.matcher(formula);
        if(matcher.find())
             cal=matcher.group();

        String [] temp=formula.split("\\+|\\-|×|÷|\\^");

        if (temp.length!=2)
            return "不合法的表达式";

        BigDecimal num1=new BigDecimal(temp[0]);
        BigDecimal num2=new BigDecimal(temp[1]);
        switch (cal){
            case "+":return num1.add(num2).toPlainString();
            case "-":return num1.add(num2.negate()).toPlainString();
            case "×":return num1.multiply(num2).toPlainString();
            case "÷":return num1.divide(num2,11,BigDecimal.ROUND_DOWN).toPlainString();
            case "^":return num1.pow(num2.intValue()).toPlainString();
            default:return "不合法的表达式";
        }


    }

    public static void transform(TextView textView,OutputList<Character> outputList){
        try{
        String result=Caculate.getResult(outputList.toString());
        char[] temp=result.toCharArray();
        outputList.clear();
        textView.setText(result);
        if(!result.equals("不合法的表达式") ){
            for (int i = 0; i < temp.length; i++) {
                outputList.add(temp[i]);

            }
        }
        } catch (Exception e){
            System.out.println("la");
            e.printStackTrace();
        }


    }
}
