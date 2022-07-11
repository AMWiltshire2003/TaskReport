package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] Developer = new String[1];
        Developer[0] = "Glenda Oberholzer";
        String[] TaskDuration = new String[1];
        TaskDuration[0] = "11";
        //the developer's name
        System.out.println(Developer[0]);
        //the longest duration
        System.out.println(TaskDuration[0]);

        System.out.println("------------------------------");

        ArrayList TaskNameList = new ArrayList();
        TaskNameList.add("Create Login");
        TaskNameList.add("Create Add Feature");
        TaskNameList.add("Create Reports");
        TaskNameList.add("Add Arrays");
        //display the task name
        System.out.println(TaskNameList.get(0));

        ArrayList DeveloperList = new ArrayList();
        DeveloperList.add("Mike Smith");
        DeveloperList.add("Edward Harrison");
        DeveloperList.add("Samantha Paulson");
        DeveloperList.add("Glenda Oberholzer");
        //display the developer
        System.out.println(DeveloperList.get(0));

        ArrayList TaskStatusList = new ArrayList();
        TaskStatusList.add("To Do");
        TaskStatusList.add("Doing");
        TaskStatusList.add("Doing");
        TaskStatusList.add("To Do");
        //display the task status
        System.out.println(TaskStatusList.get(0));

        System.out.println("------------------------------");

        System.out.println(DeveloperList.get(3));
        System.out.println(TaskNameList.get(3));
        System.out.println(TaskStatusList.get(3));

        System.out.println("------------------------------");

        ArrayList TaskNameList1 = new ArrayList();
        TaskNameList1.add("Create Login");
        TaskNameList1.add("Create Add Feature");
        TaskNameList1.add("Create Reports");
        TaskNameList1.add("Add Arrays");
        //delete/remove a task in the arraylist
        TaskNameList1.remove("Create Reports");
        //display task that was not deleted/removed
        System.out.println(TaskNameList1);

        System.out.println("------------------------------");

        //display all captured tasks
        ArrayList<String> DeveloperArrayList
                = new ArrayList<>(Arrays.asList("Mike Smith","Edward Harrison","Samantha Paulson","Glenda Oberholzer"));
        System.out.println(DeveloperArrayList);

        ArrayList<String> TaskNameArrayList
                = new ArrayList<>(Arrays.asList("Create Login","Create Add Feature","Create Reports","Add Arrays"));
        System.out.println(TaskNameArrayList);

        ArrayList<String> TaskDurationArrayList
                = new ArrayList<>(Arrays.asList("5","8","2","11"));
        System.out.println(TaskDurationArrayList);

        ArrayList<String> TaskStatusArrayList
                = new ArrayList<>(Arrays.asList("To Do","Doing","Doing","To Do"));
        System.out.println(TaskStatusArrayList);

    }
}

