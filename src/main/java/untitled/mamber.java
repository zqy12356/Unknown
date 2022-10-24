/************************************************************   
 Copyright (C), 1988-1999, Huawei Tech. Co., Ltd.
 FileName: test.cpp

 Author:  Light
 Version : 1.0
 Date:   2018/4/17
 Description:
 假设商店货品价格(R) 都不大于100元（且为整数），若顾客付款(P)在100元内，
 现有一个程序能在每位顾客付款后给出找零钱的最佳组合（找给顾客货币张数最少）。
 假定此商店的货币面值只包括：50元(N50)、10元(N10)、 5元(N5)、1元(N1) 四种
 // 模块描述         
 Version:
 仅用于软件测试，完成作业
 // 版本信息

 Function List: // 主要函数及其功能
 1.
 History: 
 // 历史修改记录

 <author>  <time>   <version >   <desc>
 Light    18/4/17     1.0        建立函数

 ***********************************************************/
package untitled;

import java.util.Scanner;

public class mamber {

    /**
     * 主函数
     * @param args
     */
    public static void main (int pay,int cost) {
        // TODO Auto-generated method stub

        int change = 0;//找钱

        //对输入的内容进行检测，是否符合规则
        try
        {
            if (pay > 100 || pay < 0)
            {
                System.out.println("请输入正确的金额");
                return;
            }

        }catch (Exception e)
        {
            System.out.println("请输入合法数字");
            return;
        }


        //对输入的内容进行检测，是否符合规则
        try
        {
            if (cost > 100 || cost < 0)
            {
                System.out.println("请输入正确的金额");
                return;
            }
            else if (cost > pay)
            {
                System.out.println("您的消费金额超出支付金额");
                return;
            }
        }catch (Exception e)
        {
            System.out.println("请输入合法数字");
            return;
        }

        change = pay-cost;

        //输出此时的付款金额，商品价格，应找金额
        System.out.println("付款金额" + pay +"   货品价格" + cost + "     应找总金额：" + change);

        //获得结果，进行输出
        String end = giveChange(change);
        System.out.println("此次消费应找金额  " + change + " 元，其中应找  " + end);

    }

    /**
     * 以找钱规则找钱
     * @param change
     * @return String//返回最终的找钱结果
     */
    public static String giveChange(int change)
    {
        String str="";
        int qianshu;//应该找钱的张数
        int leftmoney = change;//还剩下多少钱,初始值为change

        if (leftmoney / 50 != 0)
        {
            qianshu = leftmoney / 50;
            str = str + qianshu + "张50元 ";
            leftmoney = leftmoney - qianshu * 50;
        }
        if (leftmoney / 10 != 0)
        {
            qianshu = leftmoney / 10;
            str = str + qianshu + "张10元 ";
            leftmoney = leftmoney - qianshu * 10;
        }
        if (leftmoney / 5 != 0)
        {
            qianshu = leftmoney / 5;
            str = str + qianshu + "张5元 ";
            leftmoney = leftmoney - qianshu * 5;
        }
        if (leftmoney / 1 != 0)
        {
            qianshu = leftmoney / 1;
            str = str + qianshu + "张1元 ";
            leftmoney = leftmoney - qianshu * 1;
        }

        //检验是否完全找完
        System.out.println("剩余没有找完的钱数为："+leftmoney);
        return str;
    }
}