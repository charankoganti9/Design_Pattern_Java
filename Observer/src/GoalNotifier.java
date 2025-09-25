public class GoalNotifier implements FitnessDataObserver{

    private int stepGoal = 10000;
    private boolean goalReached = false;

    public void update(FitnessData data)
    {
        if(data.getSteps()> stepGoal && !goalReached)
        {
            System.out.println("Notifier → 🎉 Goal Reached! You've hit " + stepGoal + " stepGoal!");
        }
    }

    public void reset()
    {
        goalReached = false;
    }
}
