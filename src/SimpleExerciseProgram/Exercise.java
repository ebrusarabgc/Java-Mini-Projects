package SimpleExerciseProgram;

public class Exercise {
    protected int burpeeNum;
    protected int pushUpNum;
    protected int sitUpNum;
    protected int squatNum;

    public Exercise(int burpeeNum, int pushUpNum, int sitUpNum, int squatNum) {
        this.burpeeNum = burpeeNum;
        this.pushUpNum = pushUpNum;
        this.sitUpNum = sitUpNum;
        this.squatNum = squatNum;
    }

    public void doExercise(String exerciseType, int num) {
        switch (exerciseType) {
            case "Burpee" -> doBurpee(num);
            case "Push up" -> doPushUp(num);
            case "Sit up" -> doSitUp(num);
            case "Squat" -> doSquat(num);
            default -> System.out.println("Invalid exercise type...");
        }
    }

    public void doBurpee(int num) {
        if (burpeeNum == 0) {
            System.out.println("There is no need to do burpee...");
            return;
        } if (burpeeNum - num <= 0) {
            System.out.println("You achieved the burpee number you aim... Congratulations!");
            burpeeNum = 0;
        } else {
            burpeeNum -= num;
        }
        System.out.println("There are " + burpeeNum + " burpees left.");
    }

    public void doPushUp(int num) {
        if (pushUpNum == 0) {
            System.out.println("There is no need to do push up...");
            return;
        } if (pushUpNum - num <= 0) {
            System.out.println("You achieved the push up number you aim... Congratulations!");
            pushUpNum = 0;
        } else {
            pushUpNum -= num;
        }
        System.out.println("There are " + pushUpNum + " push ups left.");
    }

    public void doSitUp(int num) {
        if (sitUpNum == 0) {
            System.out.println("There is no need to do sit up...");
            return;
        } if (sitUpNum - num <= 0) {
            System.out.println("You achieved the sit up number you aim... Congratulations!");
            sitUpNum = 0;
        } else {
            sitUpNum -= num;
        }
        System.out.println("There are " + sitUpNum + " sit ups left.");
    }

    public void doSquat(int num) {
        if (squatNum == 0) {
            System.out.println("There is no need to do squat...");
            return;
        } if (squatNum - num <= 0) {
            System.out.println("You achieved the squat number you aim... Congratulations!");
            squatNum = 0;
        } else {
            squatNum -= num;
        }
        System.out.println("There are " + squatNum + " squats left.");
    }

    public boolean isOver() {
        return (burpeeNum == 0) && (pushUpNum == 0) && (sitUpNum == 0) && (squatNum == 0);
    }
}
