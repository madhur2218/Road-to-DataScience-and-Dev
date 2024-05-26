 interface Camera {

    void takeSnap();
    void recordVideo();

}

 interface Wifi{
    String [] getNetworks();
    void connectToNetwork(String network);


}


class MyCellPhone {

    void callNumber() {
        System.out.println("calling");
    }

    void takeSnap(){
        System.out.println("taking snaps");
    }

}