package java101.javaClass.ornekler;

class car {
    String type;
    String model;
    int speed;
    int speedLimit = 180;

    car(String model , int speed , String type){
        this.model = model;//this kullanmamızın sebebi methodun içine tanımladığımız fonksiyonu sınıfın içine tanımladıgımız fonksiyonla
        this.speed = speed;//aynı olmuyor sınıfın içindeki değişkenleri gösterebilmek için this sozcugunu kullanırız bu this sözcügü
        //değişken ismi ile aynı olup hangi değişkenden alubdugını gösterir
        this.type = type;
        this.speedLimit= 180;
    }


    void incraseSpeed(int increment) {
        if (speed < speedLimit) {
            speed += increment;
        }}


    void decreaseSpeed (int decrease){
            if (speed > 0) {
                speed -= decrease;
            }
        }
    void printspeed(){
        System.out.println("Hızınız : " +speed);
    }
}




