import dao.People;
import singleton.LazySingleton;
import nested.PublicClass;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.Timer;

/**
 * Created by ALEX on 2018/6/22.
 */
public class TestMain {

    public static void main(String[] args) throws Exception{
        // 1.0.0 tag
        // 1.0.0 tag bug 未修复

        // 1.1.0 版本
        // 1.1.0 bug1 在1.1.0-RELEASE中检测出并修复
        // 1.1.0 bug2 在1.1.0-hotfix中修复

        // 2.0.0 版本
        // 2.0.0 bug1 在2.0.0-RELEASE测试中检测出并修复
        // 2.0.0 bug2 在2.0.0-bug fix中修复

        // 3.0.0 版本
        // 3.0.0 bug1 在release中修复
        // 3.0.0 bug2 在3.0.0-hotfix中修复

        // 4.0.0 版本

        // 4.1.0 版本

        // IDE使用 目录结构 代码规范 jRebel

        // 基本数据类型

        // 包装类

        // CLASS  OBJECT

        // STRING

        // 集合类

        // 父类 重写

        // 接口

        // 重载

        // 条件语句

        // 循环语句

        // 异常

        // 多线程

        // 日志

        // 代理

        // 反射

        // 设计模式

        // 注解

        // AOP

        // maven项目


        // git diff test
        // 懒汉单例
        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        LazySingleton lazySingleton2 = LazySingleton.getLazySingleton();
        System.out.println(lazySingleton == lazySingleton2);

        // 调用内部类作为入参
        PublicClass publicClass=new PublicClass();
        PublicClass.NestedClass dataStructure = publicClass.new NestedClass();

        dataStructure.setName("test");

        publicClass.printNestedClass(dataStructure);

        People p=new People();
        // 反射调用People set方法
        Method setName=People.class.getDeclaredMethod("setName", String.class);
        setName.invoke(p,"张三");

        // 反射调用get方法
        Method getName=People.class.getDeclaredMethod("getName");
        String name=(String)getName.invoke(p);
        System.out.println(name);

        Date d1=new Date();
        Thread.sleep(3000);
        Date d2=new Date();
        System.out.println((d2.getTime()-d1.getTime())/1000);

    }


}
