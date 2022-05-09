/*
Abdallah Bilal
java Course Project
10/04/22

 */




public class GuessingGame {

    private String firstName;
    public int age;

    public GuessingGame(){

    }


    public GuessingGame(String firstName,int age) {

        this.firstName = firstName;
        this.age = age;

    }
    //This is the setter and getter for the name and age of the contestant
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAge(int age){
        this.age=age;
    }


    public int getAge() {
        return age;
    }


}



