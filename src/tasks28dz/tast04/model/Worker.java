package tasks28dz.tast04.model;

import lesson016.dzTask3.exseption.NullNameExseption;
import tasks28dz.tast04.exceptions.InvalidTXTLine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Worker {
    private String name;
    private LocalDate date;
    private double salary;

    public Worker(String name, LocalDate date, double salary) {
        this.name = name;
        this.date = date;
        this.salary = salary;
        CollectionWorkers.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void getWorkers() {
        CollectionWorkers.printWorkers();
    }

    public void addCollectionWork(Worker worker){
        CollectionWorkers.add(worker);
    }

    private Worker creationObject(String strFile)throws InvalidTXTLine{
        Worker worker = null;
        String regex = "(\\w+);(\\d{2}\\.\\d{2}\\.\\d{4});(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(strFile);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        if (matcher.find()){
            // System.out.println(matcher.group(1)+" "+ matcher.group(2)+ " "+ matcher.group(3)+" sout ");
            LocalDate date = LocalDate.parse(matcher.group(2),formatter);
            worker = new Worker(matcher.group(1),date,Double.valueOf(matcher.group(3)));
        }else new InvalidTXTLine("по данному формату:"+ regex + " не нашлось значения");
        return worker;
    }

    public void readerFail(String file ){
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String fileLine = null;
            while((fileLine = br.readLine())!=null){
                creationObject(fileLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (InvalidTXTLine e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", salary=" + salary +
                '}';
    }
}
