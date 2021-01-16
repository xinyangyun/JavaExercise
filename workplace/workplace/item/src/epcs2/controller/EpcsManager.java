package epcs2.controller;

import epcs2.InputUtil;

/**
 * Created by Administrator on 2020/3/27 0027.
 */
public class EpcsManager {
    VirusController virusController =  new VirusController();
    CaseController caseController =  new CaseController();

    public void start() {

        boolean isExist = false;
        while (!isExist) {
            System.out.println("********************");
            System.out.println("****疫情管理系统******");
            System.out.println("****1.病毒管理");
            System.out.println("****2.病人管理");
            System.out.println("****3.退出系统");
            System.out.println("********************");
            int num = InputUtil.getInt();
            switch (num) {
                case 1:{
                    virusController.virusManager();
                    break;
                }
                case 2:{
                    caseController.caseManager();
                    break;
                }
                case 3:{
                    isExist =true;
                    break;
                }
                default:{
                    System.out.println("请选择1-3");
                }
            }
        }
    }



}
