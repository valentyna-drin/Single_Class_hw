package com.company;

public class Course {
    private String name;
    private String topic;
    private String nameOfTeacher;
    private int numberOfParticipants;

    Course (String name, String topic, String nameOfTeacher, int numberOfParticipants){
        this.name = name;
        this.topic = topic;
        this.nameOfTeacher = nameOfTeacher;
        this.numberOfParticipants = numberOfParticipants;
    }

    public String getName() {
        return name;
    }

    public String getTopic() {
        return topic;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public int getNumberOfParticipants() {
        if (numberOfParticipants < 0)
            System.out.println("Number of participants is negative! Put zero or positive value!");
        return numberOfParticipants;
    }
    public boolean hasParticipants(int numOfPart){
        if(this.numberOfParticipants > 0)
            return true;
        else return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

}
