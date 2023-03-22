package ch07;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel; // previous channel 이전 채널

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setChannel(int channel) {
        if (channel < MIN_CHANNEL || channel > MAX_CHANNEL)
            return;

        // 정답지
        prevChannel = this.channel; // 현재 채널을 이전 채널에 저장한다.
        this.channel = channel;

        /* 내가 작성한 거
        int tmp = this.channel;
        this.channel = channel;
        prevChannel = tmp;
         */
    }

    public void setVolume(int volume) {
        if (volume < MIN_VOLUME || volume > MAX_VOLUME)
            return;

        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void gotoPrevChannel() {
        setChannel(prevChannel); // 현재 채널을 이전 채널로 변경한다.
    }
}

public class Practice7_5 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: "+t.getChannel());
        t.setChannel(20);
        System.out.println("CH: "+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: "+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: "+t.getChannel());
    }
}
