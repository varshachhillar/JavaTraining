package JavaBasics.arraypractise;

import java.util.ArrayList;
import java.util.List;

/**
 * [1,3],[2,6],[8,12],[10,18] => [1,6],[8,18]
 * Definition for an interval.
 **/

public class OverlapInterval {
    static  class Interval{
        int start;
        int end;
        public Interval (int a , int b){
            this.start = a;
            this.end = b;
        }
    }

    public static List<Interval> overlap(List<Interval> listInterval){
        List<Interval> overlapIntervals = new ArrayList<Interval>();
        int start = listInterval.get(0).start;
        int end = listInterval.get(0).end;
        for(int i =0;i<listInterval.size()-1;i++){
            if(listInterval.get(i).end < listInterval.get(i+1).start){
                overlapIntervals.add(new Interval(start, end));
                start= listInterval.get(i+1).start;
                end= listInterval.get(i+1).end;
            }
            else {
                end= listInterval.get(i+1).end;
            }
        }
        overlapIntervals.add(new Interval(start, end));
        return overlapIntervals;
    }


    public static void  main(String[] args){
        List<Interval> listOfIntervals = new ArrayList<Interval>();
        listOfIntervals.add(new Interval(1,3));
        listOfIntervals.add(new Interval(2,6));
        listOfIntervals.add(new Interval(8, 11));
        listOfIntervals.add(new Interval(10, 18));

        List<Interval> overlapIntervals = new ArrayList<Interval>();
        overlapIntervals = overlap(listOfIntervals);
        for (int j =0; j<overlapIntervals.size();j++){
            System.out.print(overlapIntervals.get(j).start+ "   ");
            System.out.print(overlapIntervals.get(j).end);
            System.out.println();

        }

    }

}
