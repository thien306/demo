import entity.ToiPham;
import service.QuanLyService;
import service.ToiPhamService;

public class Main {
    public static void main(String[] args) {
        /*QuanLyService quanLyService= new QuanLyService();
        quanLyService.traluong();*/
        ToiPhamService toiPhamService = new ToiPhamService();
        ToiPham thang = new ToiPham("thang", 23, "BD", "undefined");
        thang.setName("thang");
        toiPhamService.themToiPham(thang, 0);

        ToiPham kietLon = new ToiPham("kietLon", 22, "BD", "undefined");
        toiPhamService.themToiPham(kietLon, 1);

        ToiPham kietNho = new ToiPham("kiet nho", 29, "Nam", "undefined");
        toiPhamService.themToiPham(kietNho, 2);
        toiPhamService.InDanhSachToiPham();
    }
}