package epcs2.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import epcs2.JdbcUtil;
import epcs2.entity.Case;
import epcs2.entity.Vrius;

/**
 * Created by Administrator on 2020/3/30 0030.
 */
public class CaseDao {


    /**
     * 添加病例
     *
     * @param acase
     * @return
     */
    public boolean addCase1(Case acase) {
        //insert
        /*int num = JdbcUtil.executeUpdate("insert into tbl_cases(id , name, provice, age, status, in_time, virusid) values(seq_cases.nextval, '"
                + acase.getName() + "','" + acase.getProvince() + "', " + acase.getAge() + "," + acase.getStatus() + ", sysdate, "+acase.getVrius().getId()+" )");
        if (num > 0) {
            return true;
        }
        return false;*/
        Connection cn = null;
        PreparedStatement pst = null;

        try {
            cn = JdbcUtil.getConnection();
            //第一步？ 做站位符
            pst = cn.prepareStatement("insert into tbl_cases(id , name, provice, age, status, in_time, virusid) " +
                    "values(seq_cases.nextval,?,?,?, ?, sysdate, ?)");
            //给站位符赋值

//            for(int =1; i< =a.length; i++){
//                pst.setObject(i, a[i]);
//            }
            pst.setObject(1, acase.getName());
            pst.setObject(2, acase.getProvince());
            pst.setObject(3, acase.getAge());
            pst.setObject(4, acase.getStatus());
            pst.setObject(5, acase.getVrius().getId());
//        pst.executeQuery();
            //执行增删查改
            //可防止sql 注入
            int num = pst.executeUpdate();
            if (num > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }

    //通过 PreparedStatement 封装调用
    public boolean addCase(Case acase){
        String sql = "insert into tbl_cases(id , name, provice, age, status, in_time, virusid) " +
                "values(seq_cases.nextval,?,?,?, ?, sysdate, ?)";
        int num =  JdbcUtil.executeUpdate(sql, acase.getName(), acase.getProvince(),
                acase.getAge(), acase.getStatus(), acase.getVrius().getId());
        if(num>0){
            return true;
        }
        return false;
    }


    /**
     * 根据ID 出院
     *
     * @param id
     * @return
     */
    public boolean caseOutHospt(int id) {
        //update tbl_cases set status =1 where id =?
        int num = JdbcUtil.executeUpdate("update tbl_cases set status =1 where id =? ",  id);
        if (num > 0) {
            return true;
        }
        return false;
    }


    /**
     * 根据ID 删除病人
     *
     * @param id
     * @return
     */
    public boolean deleteCaseById(int id) {
        int num = JdbcUtil.executeUpdate("delete from  tbl_cases where id =?" , id);
        if (num > 0) {
            return true;
        }
        return false;

    }

    /**
     * 根据sql 查看病人情况
     *
     * @param sql
     * @return
     */
    public ArrayList<Case> getCasees(String sql) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtil.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            ArrayList<Case> arrayList = new ArrayList<Case>();
            while (resultSet.next()) {
                Case acase = new Case();
                acase.setId(resultSet.getInt("id"));
                acase.setName(resultSet.getString("name"));
                acase.setStatus(resultSet.getInt("status"));
                acase.setProvince(resultSet.getString("provice"));
                //Vrius vrius =  virusDao.getVirus("select * from tbl_virus where id ="+ resultSet.getInt("virusid") );
                // 病人里面含有一个病毒的对象要new 一个并设值
                // 否则初始化值为 null
                Vrius vrius = new Vrius();
                vrius.setId(resultSet.getInt("virusid"));
                vrius.setName(resultSet.getString("vname"));
                vrius.setDescrip(resultSet.getString("descrip"));
                acase.setVrius(vrius);
                arrayList.add(acase);
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        } finally {
            JdbcUtil.closeConnection(connection, statement, resultSet);

        }
    }


}
