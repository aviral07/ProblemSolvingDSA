import java.util.ArrayList;
import java.util.List;

interface Observer {

    public void update(String weather);
}

interface Subject {


    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

class WeatherStation implements Subject{

 String weather;
 List<Observer> observerList=new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
   observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
  for(Observer observer:observerList){

      observer.update(weather);
  }
    }
    public void setWeather(String weather){
        this.weather=weather;
        notifyObservers();
    }
}

class Phonedisplay implements Observer{

  String weather;
    @Override
    public void update(String weather) {
        this.weather=weather;
    display();
    }

    void display(){
        System.out.println("Phone display weather updates  "+weather);
    }
}
class TVdisplay implements Observer{

    String weather;
    @Override
    public void update(String weather) {
        this.weather=weather;
   display();
    }
    void display(){
        System.out.println("Phone display weather updates"+" "+weather);
    }
}


public class WeatherAppWithObserverPattern {

    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation();
    Observer phoneDisplay=new Phonedisplay();
    Observer tvDisplay=new TVdisplay();
   weatherStation.addObserver(phoneDisplay);
   weatherStation.addObserver(tvDisplay);
   weatherStation.setWeather("Sunny");
    }
}
