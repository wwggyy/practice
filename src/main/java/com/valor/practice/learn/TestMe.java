package com.valor.practice.learn;

import javax.activation.DataHandler;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import java.time.*;

import java.util.ArrayList;

import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/7/5 18:47
 * Description:
 */
public class TestMe {
    public static void main(String[] args) {
        String s = "01139942(夏梦君),01368324(王刚勇),01373820(李怀根),01372231(朱利斌),01198769(黄圣权),368324(他)";
//        Pattern p = Pattern.compile("[0-9]+");
        Pattern p = Pattern.compile("[^0-9]?01139942[^0-9]+");
        Matcher m = p.matcher(s);
        List<String> list = new ArrayList<>(1<<3);
        boolean f1 = list instanceof List;
        boolean f2 = list instanceof ArrayList;
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
