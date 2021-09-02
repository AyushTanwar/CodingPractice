import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        
        String [][] s = {{"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike", "55"}, {"Jessica", "99"}};
        System.out.println(hishestAverage(s));
    }

    public static int hishestAverage(String[][] scores) {
         if(scores == null || scores.length == 0) {
             return -1;
         }
         double highestAve = 0;
         Map<String, List<Integer>> map = new HashMap<>();
         
         for(int i = 0; i < scores.length; i++) {
             List<Integer> scoreList = map.get(scores[i][0]);
             if(scoreList == null) {
                 ArrayList<Integer> valuePart = new ArrayList<>();
                 int currentScore = Integer.valueOf(scores[i][1]);
                 valuePart.add(currentScore);
                 valuePart.add(1);
                 map.put(scores[i][0], valuePart);
             } else {
                 int currentScore = Integer.valueOf(scores[i][1]);
                 scoreList.set(1,scoreList.get(1)+1);
                 scoreList.set(0,currentScore + scoreList.get(0));
                 map.put(scores[i][0], scoreList);
             }
         }
         
         //go through the map. find the largest ave
         for(Map.Entry<String, List<Integer>> entry : map.entrySet()) {
             double currentAveScore = (double)(entry.getValue().get(0))/((double)entry.getValue().get(1));
             
             highestAve = Math.max(highestAve, currentAveScore);
         }
         
         return (int)highestAve;
     }
     
     private static int aveCalculate(List<Integer> scores) {
         int len = scores.size();
         int sum = 0;
         for(int score : scores) {
             sum += score;
         }
         
         float ave = sum / len;
         return (int) ave;
     }
}
