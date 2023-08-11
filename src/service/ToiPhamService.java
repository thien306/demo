package service;

import entity.ToiPham;

public class ToiPhamService {
    private ToiPham[] toiphams;

    public ToiPhamService (){
        toiphams = new ToiPham[10];
    }

    public void themToiPham(ToiPham toiPham, int index){
        toiphams[index] = toiPham;
    }

    public void InDanhSachToiPham(){
        for(int index = 0; index < toiphams.length; index++){
            System.out.println(toiphams[index]);
        }
    }
}
