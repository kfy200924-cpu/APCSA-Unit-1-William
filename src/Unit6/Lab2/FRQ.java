package Unit6.Lab2;

public class FRQ {
    //Question 1
    public int getPossibleAssemblies() {
        int totalWheels = 0;
        int totalAxles = 0;
        for (Shelf shelf : shelfArray) {
            totalWheels += shelf.getWheels();
            totalAxles += shelf.getAxles();
        }
        int possibleByWheels = totalWheels / 2;
        int possibleByAxles = totalAxles;
        return Math.min(possibleByWheels, possibleByAxles);
    }

    //Question 2
    public boolean isEnoughPaint(int gallons) {
        double totalArea = 0.0;
        for (Surface s : surfaceArray) {
            totalArea += s.getArea();
        }
        double paintNeeded = totalArea / 350.0;
        return gallons >= paintNeeded;
    }

    //Question 3
    //Part a
    public double computeBonusThreshold() {
        if (itemsSold.length < 2) {
            return 0.0;
        }
        int min = itemsSold[0];
        int max = itemsSold[0];
        int sum = 0;
        for (int items : itemsSold) {
            sum += items;
            if (items < min) {
                min = items;
            }
            if (items > max) {
                max = items;
            }
        }
        sum = sum - min - max;
        return (double) sum / (itemsSold.length - 2);
    }

    //Part b
    public void computeWages(double fixedWage, double perItemWage) {
        if (wages == null || wages.length != itemsSold.length) {
            wages = new double[itemsSold.length];
        }
        double threshold = computeBonusThreshold();
        for (int i = 0; i < itemsSold.length; i++) {
            double wage = fixedWage + (itemsSold[i] * perItemWage);
            if (itemsSold[i] > threshold) {
                wage *= 1.10;
            }

            wages[i] = wage;
        }
    }

    //Question 4
    //Part a
    public String getRating() {
        if (allQuestions.length < 3) {
            return "Beginner";
        }
        TriviaQuestion least = getLeastDifficult();
        TriviaQuestion most = getMostDifficult();
        int sum = 0;
        int count = 0;
        boolean skippedLeast = false;
        boolean skippedMost = false;
        for (TriviaQuestion q : allQuestions) {
            if (!skippedLeast && q == least) {
                skippedLeast = true;
                continue;
            }
            if (!skippedMost && q == most) {
                skippedMost = true;
                continue;
            }

            sum += q.getDifficultyLevel();
            count++;
        }
        double adjustedAverage = (double) sum / count;
        if (adjustedAverage < 50) {
            return "Beginner";
        } else if (adjustedAverage < 80) {
            return "Intermediate";
        } else {
            return "Expert";
        }
    }

    //Part b
    public boolean isDifficultyIncreasing() {
        if (allQuestions.length < 2) {
            return true;
        }
        for (int i = 0; i < allQuestions.length - 1; i++) {
            int currentDifficulty = allQuestions[i].getDifficultyLevel();
            int nextDifficulty = allQuestions[i + 1].getDifficultyLevel();
            if (currentDifficulty > nextDifficulty) {
                return false;
            }
        }
        return true;
    }
}
