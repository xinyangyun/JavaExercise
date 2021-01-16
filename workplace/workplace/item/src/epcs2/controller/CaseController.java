package epcs2.controller;



import java.util.ArrayList;

import epcs2.InputUtil;
import epcs2.dao.CaseDao;
import epcs2.dao.VirusDao;
import epcs2.entity.Case;
import epcs2.entity.Vrius;

/**
 * Created by Administrator on 2020/3/26 0026.
 */
public class CaseController {

    CaseDao caseDao =  new CaseDao();

    VirusDao virusDao = new VirusDao();

    public void caseManager(){

        boolean isExist = false;
        while (!isExist){
            System.out.println("********************");
            System.out.println("****病人管理菜单******");
            System.out.println("****1.查看病人");
            System.out.println("****2.添加病人");
            System.out.println("****3.病人出院");
            System.out.println("****4.删除病人");
            System.out.println("****5.退出菜单");
            System.out.println("********************");
            int num = InputUtil.getInt();
            switch (num){
                case 1:{
                    ViewCase();
                    break;
                }
                case 2:{
                    addCase();
                    break;
                }
                case 3:{
                    caseOutHospt();
                    break;
                }
                case 4:{
                    deleteCase();
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

    //添加病人
    public void addCase() {
        Case acase =  new Case();
        System.out.println("-->请输入病人名字");
        acase.setName(InputUtil.getString());
        System.out.println("-->请输入病人省份");
        acase.setProvince(InputUtil.getString());
        System.out.println("-->请输入病人年纪");
        acase.setAge(InputUtil.getInt());
        System.out.println("-->请选择患者所患病毒");

        //Vrius[] list = new Vrius[3];
        ArrayList<Vrius>  list =  virusDao.getViruses("select * from tbl_virus");
        for(int i =0;i <list.size(); i++){
            System.out.println(i +"\t\t" + list.get(i).getName());
        }
        int indx = InputUtil.getInt();
        //相当于 list[0] list[1]
        acase.setVrius(list.get(indx));
        if(caseDao.addCase(acase)){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    //出院
    public void caseOutHospt() {
        System.out.println("-->请输入出院病人id");
       if(caseDao.caseOutHospt(InputUtil.getInt())){
           System.out.println("出院成功");
       } else{
           System.out.println("出院失败");
       }
    }

    //删除病人
    public  void deleteCase(){
        System.out.println("-->请输入删除病人id");
        if(caseDao.deleteCaseById(InputUtil.getInt())){
            System.out.println("删除成功");
        } else{
            System.out.println("删除失败");
        }
    }

    //查看病人情况
    public void ViewCase() {
        System.out.println("编号\t\t姓名\t\t省份\t\t描述\t\t");
        ArrayList<Case> caseses = caseDao.getCasees("select cs.*, v.name vname , v.descrip from tbl_cases cs \n" +
                "left join tbl_virus v on cs.virusid =v.id order by cs.id desc");
        for(Case acase: caseses){
            System.out.println(acase.getId() +"\t\t"+acase.getName()+"\t\t"+acase.getProvince()+"\t\t"+ acase.getVrius().getDescrip());
        }

    }


}
