package Quiz;

public class Remote {
    private String language;
    private int batteryNumber;

    public Remote(){

    }

    public Remote(String lang, int battnum){
        language = lang;
        batteryNumber = battnum;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public String getLanguage(){
        return language;
    }

    public void setBatteryNumber(int batteryNumber){
        this.batteryNumber = batteryNumber;
    }
}
