public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var totalWeight = firstFighterWeight + secondFighterWeight;
        System.out.println("Общий вес двух бойцов - " + totalWeight + " кг.");
        var weightDifference = secondFighterWeight - firstFighterWeight;
        System.out.println("Разница весов двух бойцов - " + weightDifference + " кг.");
        weightDifference = secondFighterWeight % firstFighterWeight;
        System.out.println("Разница весов двух бойцов - " + weightDifference + " кг.");

        var workingHours = 640;
        var hoursPerWorker = 8;
        var numberOfWorkers = workingHours / hoursPerWorker;
        System.out.println("Всего работников в компании - " + numberOfWorkers + " человек.");

        numberOfWorkers = numberOfWorkers + 94;
        workingHours = numberOfWorkers * hoursPerWorker;
        System.out.println("Если в компании работает " + numberOfWorkers + " человек, то всего " + workingHours + " часов работы может быть поделено между сотрудниками.");

    }
}