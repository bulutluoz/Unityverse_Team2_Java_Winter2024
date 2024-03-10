package day22_collections_maps;

public class C07_NoIleSoyisimUpdate extends OgrenciMap{

    public static void main(String[] args) {

        // 104 numarali ogrencinin soyismini Aslan yapin

        // 1- once 104 numarali ogrencinin value'sunu kaydedelim

        String eskiValue = ogrenciMap.get(104); // Ayse-Can-10-H-MF

        // 2- value'de update yapabilmek icin split ile array'e cevirelim

        String[] eskiValueArr = eskiValue.split("-"); // [Ayse, Can, 10, H, MF]

        // 3- array'de istenen update'i yapalim

        eskiValueArr[1] = "Aslan"; // [Ayse, Aslan, 10, H, MF]

        // 4- array'in son halini ogrenci map'ine kaydetmek icin
        //    eskivalueArr'ini value formatinda String yapalim

        String yeniValue = String.join("-",eskiValueArr); // Ayse-Aslan-10-H-MF

        // 5- Key ve yeni value'yu kullanarak
        //    map'i update edelim

        ogrenciMap.put(104,yeniValue);

        System.out.println("Ogrenci map'in yeni hali : "+ ogrenciMap);
    }


}
