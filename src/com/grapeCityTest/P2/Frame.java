package com.grapeCityTest.P2;

import com.grapeCityTest.P2.util.Draw;
import com.grapeCityTest.P2.util.Entry;


import java.util.List;

/**
 * 框架类
 */
public class Frame {
    /**
     * 数据的集合
     */
    public List<Entry<String,Integer>> data;
    public Frame(Controller controller){
        data = controller.c.data;

    }

    /**
     * 输出框架
     */
    public void printTable(){
        StringBuilder s = new StringBuilder();
        s.append(getUpLine()+"\n");
        for(int i=0;i<data.size();i++){
            s.append(getMid(data.get(i))+"\n");
            if(i==data.size()-1){
                break;
            }
            s.append(getMidLine()+"\n");
        }
        s.append(getDownLine());
        System.out.print(s.toString());
    }

    /**
     * 填充数据
     * @param data 数据源
     * @return 例：│pineapple│████████████████████│
     */
    public String getMid(Entry<String,Integer> data){
        StringBuilder s = new StringBuilder();
        s.append(Draw.vertical());
        for(int i=0;i<Entry.maxKLen-data.key.length();i++){
            s.append(Draw.space());
        }
        s.append(data.key);
        s.append(Draw.vertical());
        int v = (int)(data.value* 20/(float)Entry.maxVLen) ;
        for(int i=0;i<20;i++){
            if(v>0){
                s.append(Draw.pillar());
                v--;
            }else{
                s.append(Draw.space());
            }
        }
        s.append(Draw.vertical());
        return s.toString();
    }

    /**
     * 获得中间行
     * @return 例：│─────────┼────────────────────│
     */
    public String getMidLine(){
        StringBuilder s = new StringBuilder();
        s.append(Draw.vertical());
        for(int i=0;i<Entry.maxKLen;i++){
            s.append(Draw.horizontal());
        }
        s.append(Draw.cross());
        for(int i=0;i<20;i++){
            s.append(Draw.horizontal());
        }
        s.append(Draw.vertical());
        return s.toString();
    }

    /**
     * 获得顶部行
     * @return 例：┌─────────┬────────────────────┐
     */
    public String getUpLine(){
        StringBuilder s = new StringBuilder();
        s.append(Draw.top_left());
        for(int i=0;i<Entry.maxKLen;i++){
            s.append(Draw.horizontal());
        }
        s.append(Draw.horizontal_down());
        for(int i=0;i<20;i++){
            s.append(Draw.horizontal());
        }
        s.append(Draw.top_right());
        return s.toString();
    }

    /**
     * 获得底部行
     * @return 例：└─────────┴────────────────────┘
     */
    public String getDownLine(){
        StringBuilder s = new StringBuilder();
        s.append(Draw.down_left());
        for(int i=0;i<Entry.maxKLen;i++){
            s.append(Draw.horizontal());
        }
        s.append(Draw.horizontal_up());
        for(int i=0;i<20;i++){
            s.append(Draw.horizontal());
        }
        s.append(Draw.down_right());
        return s.toString();
    }
}
