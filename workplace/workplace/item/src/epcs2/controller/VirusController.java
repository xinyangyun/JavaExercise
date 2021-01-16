package epcs2.controller;


import java.util.ArrayList;

import epcs2.InputUtil;
import epcs2.dao.VirusDao;
import epcs2.entity.Vrius;

/**
 * Created by Administrator on 2020/3/26 0026.
 */
public class VirusController {

    VirusDao virusDao = new VirusDao();


    public void virusManager(){

        boolean isExist = false;
        while (!isExist){
            System.out.println("********************");
            System.out.println("****病毒管理菜单******");
            System.out.println("****1.查看病毒");
            System.out.println("****2.添加病毒");
            System.out.println("****3.修改病毒");
            System.out.println("****4.删除病毒");
            System.out.println("****5.退出菜单");
            System.out.println("********************");
            int num = InputUtil.getInt();
            switch (num){
                case 1:{
                    ViewVirus();
                    break;
                }
                case 2:{
                    addVirus();
                    break;
                }
                case 3:{
                    editVirus();
                    break;
                }
                case 4:{
                    deleteVirus();
                    break;
                }
                case 5:{
                    isExist= true;
                    break;
                }
                default:{
                    System.out.println("请输入1-5");
                }
            }
        }

    }

    //添加病毒
    public void addVirus() {
        Vrius vrius = new Vrius();
        System.out.println("-->请输入病毒名称！");
        vrius.setName(InputUtil.getString());
        System.out.println("-->请输入病毒描述！");
        vrius.setDescrip(InputUtil.getString());
        int num = virusDao.addVrius(vrius);
        if (num > 0) {
            System.out.println("添加病毒成功！");
        } else {
            System.out.println("添加病毒失败！");
        }
    }

    //修改病毒
    public void editVirus() {
        System.out.println("-->请输入要修改病毒的Id！");
        int id = InputUtil.getInt();
        //根据ID查询病毒
        Vrius virus = virusDao.getVirus("select * from tbl_virus where id = " + id);
        if (virus == null) {
            System.out.println("未找到该病毒！");
            return;
        }
        System.out.println("请输入病毒名称");
        virus.setName(InputUtil.getString());
        System.out.println("请输入病毒描述");
        virus.setDescrip(InputUtil.getString());
        //更新病毒
        int num = virusDao.updateVrius(virus);
        if (num > 0) {
            System.out.println("更新成功");
        } else {
            System.out.println("更新失败");
        }
    }

    //删除病毒
    public  void deleteVirus(){
        System.out.println("-->请输入要删除病毒的Id！");
        int id = InputUtil.getInt();
        if(virusDao.deleteVriusById(id)>0){
            System.out.println("删除病毒成功");
        }else{
            System.out.println("删除病毒失败");
        }
    }

    //修改病毒
    public void ViewVirus() {
        ArrayList<Vrius> viruses = virusDao.getViruses("select * from tbl_virus");
        System.out.println("编号\t\t名称\t\t描述\t\t");
        for(Vrius vrius: viruses) {
            System.out.println(vrius);
        }
    }


}
