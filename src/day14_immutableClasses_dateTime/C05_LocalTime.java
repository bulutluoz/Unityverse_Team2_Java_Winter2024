package day14_immutableClasses_dateTime;

import java.time.LocalTime;

public class C05_LocalTime {

    public static void main(String[] args) throws InterruptedException {

        LocalTime saat = LocalTime.now();

        /*
            9.satirda olusturdugumuz saat variable'i
            bir kronometre gibi canli bir sayac degil,
            9.satir calistigi anda bilgisayarin, saat degerini alip saklayan,
            sabit degerli bir variable'dir
         */

        System.out.println(saat); // 18:24:01.488090

        Thread.sleep(2000); // kodlari 5000 milisaniye bekletir

        System.out.println(saat); // 18:24:01.488090

        // saat kronometre degildir, 9.satir calistigindaki saatin degerini saklayan bir variable'dir


        // get method'lari, kaydedilen saatin belirli bolumlerini bize getirir
        System.out.println(saat.getMinute()); // 27

        System.out.println(saat.getHour()+":"+saat.getMinute()); // 18:28


        // minus ve plus, kaydettigimiz zamani ilerletme veya geriye alma icin kullanilir

        System.out.println(saat.plusHours(4).plusMinutes(20)); // 22:49:25.228115
        System.out.println(saat.minusHours(15).minusMinutes(5).minusSeconds(20));


        // with()

        System.out.println(saat.withHour(20)); // 20:32:10.472887
        System.out.println(saat.withNano(0)); // 18:32:42
        System.out.println(saat.withNano(0).withSecond(0)); // 18:33

        // istedigimiz degerlere sahip, bir saat olusturup kaydedelim

        LocalTime istenenSaat = LocalTime.of(23,45);
        System.out.println(istenenSaat); // 23:45

        // gun baslangicindan istenen zamana kadar gecen saniye, nanosaniye yi yazdiralim

        System.out.println(saat.toSecondOfDay()); // 67055
        System.out.println(saat.toNanoOfDay()); // 67055573797000

    }
}
