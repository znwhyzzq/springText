package com.itheima.dao.impl;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

//@Component("bookDao")
@Repository("bookDao")
@Scope("prototype")
public class BookDaoImpl implements BookDao {
   @Value("${jdbc.username}")
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
      System.out.println("book  dao save...."+name);
   }
   public void init() {
      System.out.println("save...."+name);
   }

   public void Destroy() {
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
