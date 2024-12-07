public class MediaAdapter implements IMediaAdapter {
    String audioType;
    AdapteeMp4 mp4Device;
    AdapteeVLC vlcDevice;

    MediaAdapter(String audioType){
        this.audioType= audioType;
    }
    @Override
    public void play(String file) {
        if(audioType.equalsIgnoreCase("MP4")){
            mp4Device= new AdapteeMp4(file);
            mp4Device.playMP4();
        }else if(audioType.equalsIgnoreCase("VLC")){
            vlcDevice= new AdapteeVLC(file);
            vlcDevice.playVLC();
        }
    }
}
