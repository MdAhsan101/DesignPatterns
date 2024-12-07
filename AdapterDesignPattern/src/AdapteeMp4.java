public class AdapteeMp4 {
    String mp4FileName;
    AdapteeMp4(String file){
        this.mp4FileName= file;
    }
    void playMP4(){
        System.out.println("Playing MP4 "+mp4FileName);
    }
}
