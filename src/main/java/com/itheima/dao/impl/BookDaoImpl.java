package com.itheima.dao.impl;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


public class BookDaoImpl implements BookDao {
   private String name;

   //   public int[] array;
//   public List<String> list;
//
//
//
//
//   public void setArray(int[] array){this.array=array;}
//   public void setList(List<String> list){this.list=list;}
   public void setName(String name){
      this.name=name;
   }

   public BookDaoImpl() {

   }

   @Override
   public void save() {
      System.out.println("save...."+name);
   }

//   public void save(){
//      System.out.println("Book sao save...");
//      System.out.println(Arrays.toString(array));
//      System.out.println(list);
//
//
//   }

}
