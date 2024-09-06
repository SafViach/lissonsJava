package tasks28dz.tast04.model;

import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class CollectionWorkers {
     static private Set<Worker> workers = new HashSet<>() ;



    static public void add (Worker worker){
        workers.add(worker);
    }

    static public int size(){
        return workers.size();
    }

    static public void printWorkers(){
        for (Worker work : workers) {
            System.out.println(work);
        }
    }
    static public Worker findMaxYear(){
        Worker maxYearWorker = workers.iterator().next();
        int maxYear = 0;
        for (Worker worker : workers) {
            Period period =Period.between(worker.getDate(),maxYearWorker.getDate());
            if (period.getYears() > maxYear){
                maxYearWorker = worker;
            }
        }
        return maxYearWorker;
    }
}
