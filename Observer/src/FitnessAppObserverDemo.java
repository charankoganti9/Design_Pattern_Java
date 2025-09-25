
public class FitnessAppObserverDemo {
    public static void main(String[] args) {

        FitnessData fitnessData = new FitnessData();

        LiveActivityDisplay liveActivityDisplay = new LiveActivityDisplay();
        ProgressLogger progressLogger = new ProgressLogger();
        GoalNotifier goalNotifier = new GoalNotifier();

        fitnessData.registerObserver(liveActivityDisplay);
        fitnessData.registerObserver(progressLogger);
        fitnessData.registerObserver(goalNotifier);

        fitnessData.newFitnessDataPushed(500, 5, 20);
        fitnessData.newFitnessDataPushed(9800, 85, 350);
        fitnessData.newFitnessDataPushed(10100, 90, 380);

        goalNotifier.reset();
        fitnessData.dailyReset();
    }
}