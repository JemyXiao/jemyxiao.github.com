package tk.mybatis.springboot.controller;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jmx on 16/4/19.
 */
public class PoiExcel {
    public static void main(String[] args) {

        Connection conn = null;
        String sql;
        // MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称?参数=值
        // 避免中文乱码要指定useUnicode和characterEncoding
        // 执行数据库操作之前要在数据库管理系统上创建一个数据库，名字自己定，
        // 下面语句之前就要先创建javademo数据库
//        String url = "jdbc:mysql://192.168.113.15:3306/dt_case?"
//                +"user=dt_case&password=JEbIuJJ24WW9qIc&useUnicode=true&characterEncoding=UTF8";
        File file = new File("/Users/caiyongqiao/Documents/Label_case.xls");
        InputStream in = null;//输入流
        try {
            in = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        HSSFWorkbook workbook = null;
        try {
            workbook = new HSSFWorkbook(new POIFSFileSystem(in));
        } catch (IOException e) {
            e.printStackTrace();
        }
        HSSFSheet sheet = workbook.getSheetAt(0);//获取要读取的工作表
        Statement stmt = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("成功加载MySQL驱动程序");
//            // 一个Connection代表一个数据库连接
//            conn = DriverManager.getConnection(url);
//            // Statement里面带有很多方法，比如executeUpdate可以实现插入，更新和删除等
//            stmt = conn.createStatement();
//
//
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
        HSSFRow row = sheet.getRow(0);
        int colNum = row.getPhysicalNumberOfCells();
        System.out.println("colNum:" + colNum);
        String[] title = new String[colNum];
        for (int i = 0; i < colNum; i++) {
            //title[i] = getStringCellValue(row.getCell((short) i));
            title[i] = String.valueOf(row.getCell((short) i));
            System.out.println(title[i]);
        }
        List<Map<String,String>> list = new ArrayList<>();
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            HSSFRow row1 = sheet.getRow(i);
            Map<String, String> map = new HashMap<>();
            for (int j = 0; j < title.length; j++) {
                map.put(title[j], String.valueOf(row1.getCell(j)));
            }
            list.add(map);
        }
        for (Map<String, String> map : list) {
            for (Map.Entry<String, String> entry : map.entrySet()) {

                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

            }
        }
//        for (int i = 0; i <=sheet.getLastRowNum() ; i++) {
//            HSSFRow row = sheet.getRow(i);
//        }
//        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//            HSSFRow row = sheet.getRow(i);
//            HSSFCell cell;
//            cell = row.getCell(1);
//            //System.out.println(row.getCell(0).toString().split("\\.")[0]+"  "+row.getCell(1)+"  "+row.getCell(2).toString().split("\\.")[0]);
//            sql ="INSERT INTO favorid_match (favor_id,favor_name,isvalid)"+
//                    "values("+Integer.parseInt(row.getCell(0).toString().split("\\.")[0])+",'"+row.getCell(1)+"',"+Integer.parseInt(row.getCell(2).toString().split("\\.")[0])+")";
//            System.out.println(sql);
//            try {
//                stmt.executeUpdate(sql);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
