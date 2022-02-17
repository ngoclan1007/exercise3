import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        bài 1
      String str = "hello every one";
      int count = 0;
      int daiChuoi = str.length();
      for(int i = 0; i<daiChuoi; i++){
          if(str.charAt(i) == 'e'){
              count++;
              System.out.println("ký tự e xuất hiện ở vị trí thứ " + i);
          }
      }
        System.out.println("Tổng số lần xuất hiện ký tự e là: " + count);

//      Bài 2

        Scanner sc = new Scanner(System.in);
        System.out.println("NHẬP CHUỖI BÀI 2");
        String str1 = sc.nextLine();
        char kytu;
        int daiChuoi2 = str1.length();
        for(int j= 0; j<daiChuoi2; j++){
            kytu = str1.charAt(daiChuoi2-j-1);
            if(str1.charAt(j) == kytu){
                System.out.println("đây là chuỗi nghịch đảo");
                break;
            } else {
                System.out.println("đây không phải là chuỗi nghịch đảo");
                break;
            }
        }
    }
}
