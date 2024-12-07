public class AdapteeVLC {
    String vlcFileName;
    AdapteeVLC(String file){
        this.vlcFileName= file;
    }
    void playVLC(){
        System.out.println("Playing VLC "+vlcFileName);
    }
}
