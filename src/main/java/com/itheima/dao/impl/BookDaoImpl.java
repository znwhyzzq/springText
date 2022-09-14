package com.itheima.dao.impl;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

//@Component("bookDao")
@Repository

public class BookDaoImpl implements BookDao {
//   @Value("${jdbc.username}")
//   private String name;
    //   public int[] array;
//   public List<String> list;
//
//
//
//
//   public void setArray(int[] array){this.array=array;}
//   public void setList(List<String> list){this.list=list;}


//    public void save() {
//
//        System.out.println("book  dao save....");
//    }
//        for (int i = 0; i < 10000; i++) {
//
//            System.out.println("book  dao save....");
//        }
//        Long endTime = System.currentTimeMillis();
//        Long totalTime = endTime - startTime;
//        System.out.println(totalTime + "ms");

//    public void update() {
//        System.out.println("book  dao update....");
//    }

    @Override
    public String findName(int id) {
        System.out.println("id:"+id);
        return "itcast";
    }
}

//    public void delete() {
//        System.out.println("book  dao delete....");
//    }
//    public void select() {
//        System.out.println("book  dao select....");
//    }
//}

//   public void save(){
//      System.out.println("Book sao save...");
//      System.out.println(Arrays.toString(array));
//      System.out.println(list);
//
//
//   }


