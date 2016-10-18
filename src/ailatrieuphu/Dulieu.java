/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ailatrieuphu;

//import java.util.Scanner;
public class Dulieu {
    public String[] quest=new String[5];
    public int dung;
    public void CauHoi(int a) {
        
        //System.out.print("Nhap vao a: ");
        //Scanner sc=new Scanner(System.in);
        //a=sc.nextInt();
        switch(a)
                {
                    case(1):
                    {
                        quest[0]="Trong các con vật sau con vật nào được xem là cậu ông trời?";
                        quest[1]="Nhái";
                        quest[2]="Ếch";
                        quest[3]="Cóc";
                        quest[4]="Ếch ương";
                        dung=3;
                        break;
                    }
                    case(2):
                    {
                        quest[0]="Điền tiếp vào câu tục ngữ : Chết ... còn hơn sống nhục?";
                        quest[1]="Trong";
                        quest[2]="Xanh";
                        quest[3]="Vinh";
                        quest[4]="Sướng";
                        dung=3;
                        break;
                    }
                    case(3):
                    {
                        quest[0]="Trong các loài cây sau đây loài cây nào cho mủ để sản xuất săm xe?";
                        quest[1]="Cây me tây";
                        quest[2]="Cây bưởi";
                        quest[3]="Cây bạch đàn";
                        quest[4]="Cây cao su";
                        dung=4;
                        break;
                    }
                    case(4):
                    {
                        quest[0]="Điền tiếp vào chỗ trống :Cây muốn lặng mà ... chẳng ngừng?";
                        quest[1]="Gió";
                        quest[2]="Nắng";
                        quest[3]="Mưa";
                        quest[4]="Lũ";
                        dung=1;
                        break;
                    }
                    case(5):
                    {
                        quest[0]="Điền vào chỗ trống: Bán... cho đất, bán lưng cho trời?";
                        quest[1]="Mặt";
                        quest[2]="Đầu";
                        quest[3]="Người";
                        quest[4]="Chân";
                        dung=1;
                        break;
                    }
                    case(6):
                    {
                        quest[0]="Trong các nhân vật sau nhân vật nào là con trai?";
                        quest[1]="Xuka";
                        quest[2]="Chaiko";
                        quest[3]="Chaien";
                        quest[4]="Đoremi";
                        dung=3;
                        break;
                    }
                    case(7):
                    {
                        quest[0]="Người ta hay gọi: Kẻ... mỏ?";
                        quest[1]="Tưới";
                        quest[2]="Chăm";
                        quest[3]="Trồng";
                        quest[4]="Đào";
                        dung=4;
                        break;
                    }
                    case(8):
                    {
                        quest[0]="Thị xã Vĩnh Yên thuộc tỉnh nào?";
                        quest[1]="Tuyên Quang";
                        quest[2]="Vĩnh Phúc";
                        quest[3]="Nghệ An";
                        quest[4]="Thanh hóa";
                        dung=2;
                        break;
                    }case(9):
                    {
                        quest[0]="Châu lục có nhiều quốc gia nhất?";
                        quest[1]="Châu Âu";
                        quest[2]="Châu Á";
                        quest[3]="Châu Phi";
                        quest[4]="Châu Mĩ";
                        dung=3;
                        break;
                    }case(10):
                    {
                        quest[0]="Hồ gươm ở đâu?";
                        quest[1]="Hà Tĩnh";
                        quest[2]="Hà Nam";
                        quest[3]="Hà Nội";
                        quest[4]="Tp.Hồ Chí Minh";
                        dung=3;
                        break;
                    }case(11):
                    {
                        quest[0]="Trong các con vật sau đây, con vật nào khác nhất trong các con vật còn lại?";
                        quest[1]="Ngựa";
                        quest[2]="Kangaroo";
                        quest[3]="Dê";
                        quest[4]="Huơu";
                        dung=2;
                        break;
                    }case(12):
                    {
                        quest[0]="Khí nào cần thiết cho sự sống của con người?";
                        quest[1]="Hidro";
                        quest[2]="Nito";
                        quest[3]="Oxi";
                        quest[4]="Clo";
                        dung=3;
                        break;
                    }case(13):
                    {
                        quest[0]="Chuồn chuồn bay thấp báo hiệu điều gì?";
                        quest[1]="Trời nắng";
                        quest[2]="Trời sắp mưa";
                        quest[3]="Trời râm";
                        quest[4]="Trời âm u";
                        dung=2;
                        break;
                    }
                    case(14):
                    {
                        quest[0]="Điền vào chô trống: Ai ơi chớ vội cười nhau, ngẫm mình cho kỹ, ... mới cười";
                        quest[1]="Trước sau";
                        quest[2]="Sau trước";
                        quest[3]="Trái phải";
                        quest[4]="Trên dưới";
                        dung=1;
                        break;
                    }
                    case(15):
                    {
                        quest[0]="Con gì đầu dê mình ốc?";
                        quest[1]="Không tồn tại";
                        quest[2]="Con dê lai ốc";
                        quest[3]="Con ốc lai dê";
                        quest[4]="Con dốc";
                        dung=4;
                        break;
                    }
                    case(16):
                    {
                        quest[0]="Nước nào đông dân nhất thế giới?";
                        quest[1]="Nước Nga";
                        quest[2]="Việt Nam";
                        quest[3]="Mỹ";
                        quest[4]="Trung Quốc";
                        dung=4;
                    }
                    case(17):
                    {
                        quest[0]="Hình thoi có 1 góc vuông gọi là hình gì?";
                        quest[1]="Hình tam giác";
                        quest[2]="Hình tròn";
                        quest[3]="Hình Vuông";
                        quest[4]="Hình chữ nhật";
                        dung=4;
                    }
                    case(0):
                    {
                        quest[0]="Seagame22 được tổ chức vào năm nào? Nước nào đăng cai?";
                        quest[1]="2002,Thái Lan";
                        quest[2]="2002,Việt Nam";
                        quest[3]="2003,Thái Lan";
                        quest[4]="2003,ViệtNam";
                        dung=4;
                        break;
                    }
                }
        //System.out.print(quest[0]+quest[1]+quest[2]+quest[3]+quest[4]);
        
        
        
    }
    
}
