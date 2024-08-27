package leetCodeContest;

public class FirstQuestionWeek404 {
    public static void main(String[] args) {
        int red = 10;
        int blue = 1;
        System.out.println(maxHeightOfTriangle(red, blue));
    }
    public static int maxHeightOfTriangle(int red, int blue) {
        int blueCount= 0;
        int redCount = 0;
        int count = 0;
        for(int i = 1 ; i <= blue; i += 2)
        {
            if(i <= blue)
            {
                blueCount ++;
            }
        }

        for(int i = 2 ; i <= red; i += 2)
        {

            if(blueCount > redCount)
            {
                if(i <= red)
                {
                    redCount++;
                }
            }


        }
        count=redCount+blueCount;
        return count;
    }
}
