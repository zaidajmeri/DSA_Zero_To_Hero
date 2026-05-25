package enum_in_java;

import java.lang.classfile.instruction.SwitchCase;
import java.sql.SQLOutput;

public class main {
    public static void main(String[] args){
        Day monday =Day.MONDAY;
        System.out.println(monday); //monday

        Day day = Day.MONDAY;
        switch (day){
            case WEDNESDAY:{
                System.out.println("Today is Wednesday");
                break;
            }
            default:
                System.out.println("Weekend Monday Tuesday");
        }


        //new way to declare switch after java12
        Day day2 = Day.WEDNESDAY;
        String result = switch (day2){
            case FRIDAY -> "F";
            case MONDAY -> "M";
            default -> "Today is Weekend";
        };
        System.out.println(result);





        //printing index of enums
//       int ordinal = monday.ordinal();
//       System.out.println(ordinal); //1
//
//        //.name print exact name of enum constant
//        System.out.println(monday.name());
//
//
//        //for converting to string
//        Day enumDay = Day.valueOf("monday");
//        System.out.println(enumDay); //but we type different string character like MonDay so it will give exception
//
//        //printing sunday to saturday
//        Day[] values = Day.values();
//        for(Day i : values){
//            System.out.println(i);
//            monday.display();

            //string operation
            System.out.println(monday.getLower());



    }

    }
