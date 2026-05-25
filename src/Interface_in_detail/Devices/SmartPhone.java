package Interface_in_detail.Devices;

//As we know java does not support multiple inheritance
//That's why interfaces come to solve this problem

public class SmartPhone implements Camera, MusicPlayer, Phone  {
    @Override
    public void takePhoto() {
        System.out.println("Taking photo with smartphone");

    }

    @Override
    public void recordVideo() {
        System.out.println("Recoding video with smartphone");

    }

    @Override
    public void PlayMusic() {

        System.out.println("Playing music on smartphone");

    }

    @Override
    public void StopMusic() {
        System.out.println("Stopping music on smartphone");


    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + " from smartphone");

    }

    @Override
    public void endCall() {
        System.out.println("Ending call on smartphone");

    }

}
