public class StepTracker {
    private int steps;
    private int totalSteps;
    private int dailySteps;
    private int days;
    private int activeDays;

    public StepTracker(int steps){
        this.steps = steps;
    }

    public void addDailySteps (int st){
    dailySteps += st;
    totalSteps += st;

    days++;
    if(st>=steps){
        activeDays++;
     }
    }


    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
       if(days>0) {
           return totalSteps / days;
       }
       else
           return 0;
    }

    public int getDays(){
        return days;
    }

    public int getStepsForActiveDay(){
        return steps;
    }

    public int getTotalSteps(){
        return totalSteps;
    }

    public int getActiveDays(){
        return activeDays;
    }
}
