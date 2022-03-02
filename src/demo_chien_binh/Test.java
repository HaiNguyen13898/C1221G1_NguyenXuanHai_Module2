package demo_chien_binh;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
          //dietRong();
        // tổ chức thi hoa hậu
        ChienBinhDepTrai longDepTrai1 = new ChienBinhDepTrai("Long1", 18, 1.8f, 70, "Son", 10);
        ChienBinhDepTrai longDepTrai2 = new ChienBinhDepTrai("Long2", 18, 1.8f, 70, "Son", 6);
        ChienBinhDepTrai longDepTrai3 = new ChienBinhDepTrai("Long3", 18, 1.8f, 70, "Son", 8);
        ChienBinhDepTrai longDepTrai4 = new ChienBinhDepTrai("Long4", 18, 1.8f, 70, "Son", 7);
        ChienBinhDepTrai longDepTrai5 = new ChienBinhDepTrai("Long5", 18, 1.8f, 70, "Son", 9);
        ChienBinhDepTrai[] chienBinhDepTrais = new ChienBinhDepTrai[5];
        chienBinhDepTrais[0] = longDepTrai1;
        chienBinhDepTrais[1] = longDepTrai2;
        chienBinhDepTrais[2] = longDepTrai3;
        chienBinhDepTrais[3] = longDepTrai4;
        chienBinhDepTrais[4] = longDepTrai5;
        // liệt kê danh sách
        for (ChienBinhDepTrai cb : chienBinhDepTrais) {
            System.out.println(cb);
        }
        // sắp xếp theo độ đẹp trai
        Arrays.sort(chienBinhDepTrais);
        // liệt kê danh sách
        System.out.println("---------sau khi sắp xếp-------------");
        for (ChienBinhDepTrai cb : chienBinhDepTrais) {
            System.out.println(cb);
        }
        // sắp xếp theo tên
        CompaByName compaByName = new CompaByName();
        Arrays.sort(chienBinhDepTrais, compaByName);
        // sử dụng lớp nạc danh
//        Arrays.sort(chienBinhDepTrais, new Comparator<ChienBinhDepTrai>() {
//            @Override
//            public int compare(ChienBinhDepTrai o1, ChienBinhDepTrai o2) {
//                return o2.getTen().compareTo(o1.getTen());
//            }
//        });
        // liệt kê danh sách
        System.out.println("---------sau khi sắp xếp theo tên-------------");
        for (ChienBinhDepTrai cb : chienBinhDepTrais) {
            System.out.println(cb);
        }

    }

//    public static void dietRong() {
//        // khở tạo vua
//        Vua vua = new Vua();
//        ChienBinhDepTrai longDepTrai = new ChienBinhDepTrai("Long", 18, 1.8f,
//                70, "Son", 10);
//        ChienBinhThongThai chienBinhThongThai = new ChienBinhThongThai("Giang", 18, 1.7f,
//                60, "Quat hoa tiêu", 9);
//        ChienBinhAnhDung chienBinhAnhDung = new ChienBinhAnhDung("Nghĩa", 20, 1.9f,
//                90, "Gậy như ý", 100);
//        // rông tớ phá đát nước nước
//        vua.raLenh("Họp triều đình");
//        vua.raLenh(" chiến binh đẹp trai đi chiến ");
//        longDepTrai.chienDau();
//        // rồng không phải thíc sắc đẹp => không diện được
//        // thôi longDepTrai dẫn Uyên đi cafe
//        vua.raLenh("Long đưa uyên đi uongs cafe");
//        // ra lênh cho chiến binh thông thái
//        vua.raLenh("Chiến bình thông thái đi diệt rồng");
//        chienBinhThongThai.lamNhiemVu("Đi diệt rong thay cho Long");
//        chienBinhThongThai.hocHoMuaGoiGio();
//        chienBinhThongThai.chienDau();
//        // vẫn chưa diệt được
//        // vua ra lênh cho chiến binh anh dũng
//        vua.raLenh("Chiến bình thông thái đi diệt rồng");
//        chienBinhAnhDung.lamNhiemVu("Diệt rồng thay Giảng");
//        chienBinhAnhDung.luyenCong();
//        chienBinhAnhDung.hocHoMuaGoiGio();
//        chienBinhAnhDung.chienDau();
//        // Rồng bị diệt

//    }
}
