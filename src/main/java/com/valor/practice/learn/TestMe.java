package com.valor.practice.learn;

import org.springframework.util.StringUtils;

import javax.activation.DataHandler;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import java.time.*;

import java.time.format.DateTimeFormatter;
import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/7/5 18:47
 * Description:
 */
public class TestMe {
 private static int MAXIMUM_CAPACITY = 1<<8;
   static int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public static void main(String[] args) {
        String s = "01139942(夏梦君),01368324(王刚勇),01373820(李怀根),01372231(朱利斌),01198769(黄圣权),368324(他)";
//        Pattern p = Pattern.compile("[0-9]+");

        Pattern p = Pattern.compile("[^0-9]?01139942[^0-9]+");
        Matcher m = p.matcher(s);
        List<String> list = new ArrayList<>(1<<3);
        Set set = new HashSet(1<<3);
        //1. 能否初始化容量为10的hashmap
        System.out.println(tableSizeFor(17));
        LocalDateTime time = LocalDateTime.now();
        System.out.println("time=="+time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:ss:mm")));

        //2. map1的实际容量是多少?
        Map<String,Object> map1 = new HashMap<>(10);
        System.out.println(map1.size());
        //3. 为什么说hashmap 非安全, 线程安全问题触发条件

        //4. HashMap 使用了 数组 链表 红黑树方式存储数据
        Map<String,String> map = new HashMap<>(1<<3);

        int count =0;
        int amount = 0;
        int am = 0;
        for(int i=0;i<360;i++){
            am= 4369-count;
            amount = amount + am;
            count = count+6;
        }
        System.out.println("count=="+count);
        System.out.println("amount=="+amount);
        System.out.println("am=="+am);
        String s1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHssmm"));
        System.out.println("s==="+ s1);

        String validated = "失效";
        boolean f = !StringUtils.hasText(validated) || ("有效".equals(validated) || "失效".equals(validated));
        System.out.println("f=="+f);
        String moduleIdList="a,b,v,c";
        String[] s3 = moduleIdList.split(",");
        List<String> list1 = Arrays.asList(s3);
        System.out.println(list1);

//        while (m.find()){
//            list.add(m.group());
//        }
//        System.out.println(list);
//        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + LocalTime.now().getSecond());
//        if (s.matches("[^0-9]?01139942[^0-9]+")) {
//            System.out.println("ok");
//        }
//        CommJiraData jiraData = null;
//        try {
//            jiraData = new CommJiraData(new URL("http://10.202.6.70:6060/itdd-app/inf-ws/CommJiraData?wsdl"));
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        ICommJiraService service = jiraData.getCommJiraServiceImplPort();
//        String issueIdOrKey = "ITAO_ATCP_CORE-131";
//        try {
//            List<CxfFileHandler> files = new ArrayList<>();
//            String[] fs = new String[] {"application.yml"};
//            for(String fString : fs) {
//                File upFile = new File(fString);
//                DataHandler fileData = new DataHandler(upFile.toURI().toURL());
//
//                CxfFileHandler fileHandler = new CxfFileHandler();
//                fileHandler.setFileName(fString);
//                fileHandler.setFile(fileData);
//
//                files.add(fileHandler);
//            }
//            service.uploadIssueAttachments(issueIdOrKey, files);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

}
