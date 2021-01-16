package epcs2;

import epcs2.controller.EpcsManager;

/**
 * Created by Administrator on 2020/3/26 0026.
 */
public class EpcsDemo {
    public static void main(String[] args) {
        /*
         建立序列的语句
         */
        //create sequence seq_virus increment by 1 start with 1001;
        //create sequence seq_cases increment by 1 start with 1001;

        //可单独测试病人管理
        /*CaseController caseController = new CaseController();
        caseController.caseManager();*/
        //可单独测试病毒管理
        /*VirusController virusController =  new VirusController();
        virusController.virusManager();*/
        //测试疫情管理系统
        EpcsManager epcsManager = new EpcsManager();
        epcsManager.start();

    }
}
