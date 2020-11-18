package io.niuz.week5;

import io.niuz.utils.JdbcUtils;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class JdbcDemo {

    @Test
    public void insert() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();
            String sql = "insert into t_user(id_card,name,age,ismale)values('202005','张san',13,1)";
            int num = st.executeUpdate(sql);  //update
            if (num > 0) {
                System.out.println("插入成功！！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(conn, st, rs);
        }
    }

    @Test
    public void find() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            String sql = "select * from t_user where id=1";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (Exception e) {

        } finally {
            JdbcUtils.release(conn, st, rs);
        }
    }

    @Test
    public void update() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            String sql = "update t_user set name='李四' where id=3";
            st = conn.createStatement();
            int num = st.executeUpdate(sql);
            if (num > 0) {
                System.out.println("更新成功！！");
            }
        } catch (Exception e) {


        } finally {
            JdbcUtils.release(conn, st, rs);
        }
    }

    @Test
    public void delete() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            String sql = "delete from t_user where id=4";
            st = conn.createStatement();
            int num = st.executeUpdate(sql);
            if (num > 0) {
                System.out.println("删除成功！！");
            }
        } catch (Exception e) {


        } finally {
            JdbcUtils.release(conn, st, rs);
        }
    }


    @Test
    public void prepareStatementTest() throws SQLException {

        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        Savepoint sp = null;

        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);   //start transaction

            String sql1 = "update t_user set name='李四2' where id=3";
            st = conn.prepareStatement(sql1);
            st.executeUpdate();

            sp = conn.setSavepoint();//在这里设置事务回滚点

            String sql2 = "update t_user set age=16 where id=3";
            st = conn.prepareStatement(sql2);
            st.executeUpdate();

            int i=100/0;

            String sql3 = "update t_user set age=16 where id=5";
            st = conn.prepareStatement(sql3);
            st.executeUpdate();

            conn.commit();

        }catch (Exception e) {
            try {
                conn.rollback(sp);//回滚到该事务点，即该点之前的会正常执行（sql1）
                conn.commit();  //回滚了要记得提交,如果没有提交sql1会自动回滚
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally{
            JdbcUtils.release(conn, st, rs);
        }
    }
}
