class Phone{
    void call(){
        System.out.println("Calling...");
    } 
    void sms(){
        System.out.println("Messaging...");
    }       
}

interface Camera{
    void click();
    void record();
}

interface MusicPlayer{
    void paly();
    void pause();
    void stop();
}

public class SmartPhone extends Phone implements Camera,MusicPlayer{
    void videoCall(){
        System.out.println("Video Calling ...");
    }
    @Override
    public void click() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void record() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void paly() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void pause() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void stop() {
        // TODO Auto-generated method stub
        
    }

    public static void main(String[] args) {
        SmartPhone s = new SmartPhone(); // it access all the methods.
        Phone p = s; //it access only phone class methods.
        Camera c = s; // it access only camera interface methods.
        MusicPlayer m = s; // it access only musicplayer interface methods.

    }
}
