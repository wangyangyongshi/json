package com.example.demo.mysql;

/**
 * Created by wangyang on 2019/1/24.
 */
public class CascadeController {

    /**
     * 请注意，ON DELETE CASCADE仅支持使用存储引擎支持外键(如InnoDB)的表上工作。
     * 某些表类型不支持诸如MyISAM的外键，因此应该在使用MySQL ON DELETE CASCADE引用操作的表上选择适当的存储引擎。
     */


    public static void main(String[] args) {
        for(int i = 1;i<= 9;i++){
            for(int j =1;j<=i;j++){
                System.out.print(""+j+"*"+i+"="+i*j+" ");
//                System.out.println("\n");
            }
            System.out.println("\n");
        }
    }
}
