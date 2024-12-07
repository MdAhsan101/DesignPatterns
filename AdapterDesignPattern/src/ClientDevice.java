public class ClientDevice implements IMediaAdapter
{
    String audioType;

    ClientDevice(String audioType){
        this.audioType= audioType;
    }
    @Override
    public void play(String file) {
        if(this.audioType.equalsIgnoreCase("MP3")){
            System.out.println("Playing MP3 "+file);
        } else if (this.audioType.equalsIgnoreCase("MP4") || this.audioType.equalsIgnoreCase("VLC")) {
            MediaAdapter media= new MediaAdapter(audioType);
            media.play(file);
        }else{
            System.out.println("Media file not supported");
        }
    }
}
