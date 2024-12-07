public class AdpterDSProgram {
    public static void main(String[] args) {
        ClientDevice device= new ClientDevice("MP3");
        device.play("Song1");
        device= new ClientDevice("MP4");
        device.play("Song2");
        device= new ClientDevice("VLC");
        device.play("Song3");
        device= new ClientDevice("xyz");
        device.play("Song3");
    }
}