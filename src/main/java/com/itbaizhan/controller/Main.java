package com.itbaizhan.controller;

class text{
    private static text t;
    private text(){};
    public static text info(){
        if(t==null){
            t=new text();
        }
        return t;
    }
//    private static text t=new text();
//    public static text info(){
//        return t;
//    }
}

public class Main {
    public static void main(String[] args) {
//        Map<String,Integer> map=new HashMap<String, Integer>();
//        map.put("a",1);
//        map.put("b",2);
//        map.put("c",3);
//        Iterator<Map.Entry<String,Integer>> s=map.entrySet().iterator();
//        while (s.hasNext()){
//            Map.Entry<String,Integer> m=s.next();
//            System.out.println(m.getKey()+m.getValue());
//        }
        System.out.println(text.info());
        System.out.println(text.info());
        System.out.println(text.info());
    }
}
