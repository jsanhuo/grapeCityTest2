package com.grapeCityTest.P2.util;


import java.util.ArrayList;
import java.util.List;

public class Command {
    public int length = 0;
    public orderOption orderOption;
    public List<Entry<String,Integer>> data = new ArrayList<Entry<String,Integer>>();
    
    public Command(String[] args) {
        if(args.length<3){
            System.err.println("命令不全");
            return;
        }
        try{
            length = Integer.parseInt(args[0]);
            String[] o = args[1].split(" ");
            orderOption = new orderOption(o[0],o[1]);
            initData(args);
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("命令初始化失败");
        }
    }

    private void initData(String[] args){
        for(int i=2;i<args.length;i++){
            String[] temp = args[i].split(" ");
            Entry<String, Integer> stringIntegerEntry = new Entry<String, Integer>(temp[0],Integer.parseInt(temp[1]));
            data.add(stringIntegerEntry);
        }
    }
}
