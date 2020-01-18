package design;

public class AbstractClass {

    final String empName = "John Smith";
    static String resignationDate = "01/01/2010";
    int rateing;

    //Methgod overloading
    public void performance (){}
    public void performance (String rating) {}

    //Method overloading
    public void farewell(){}
    public void farewell (int date){}
}
