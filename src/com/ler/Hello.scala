package com.ler

import java.util

object Hello {

  def main(args: Array[String]): Unit = {
    fuck("my life")


    var name : String = "xiapeixin" //变量
    val age : Integer = 22   //常量 加上了final

    name = "xiapeixin22"
    //age = 23

    var arr  = ("xiapeixin","liuxuewen","missyou") //数组



    for(a <- 1 to 10){ //从1-10
      print(a)
    }

    for(a <- 1 until 10){ //从1-9 不包含10
      println(a)
    }

    for( a <- 1 to 3; b <- 1 to 3){ //多重for循环,右边是内循环
      println(a+":"+b)
    }

    val numList = List(1,2,3,4,5,6,7,8,9,10);

    for( a <- numList if a != 3; if a < 8 ){ // for循环过滤

      println( "Value of a: " + a );
    }

    var retVal = for{  //注意大括号中用于保存变量和条件，循环中的 yield 会把当前的元素记下来，保存在集合中，循环结束后将返回该集合。
      a <- numList if a != 3; if a < 8
    }yield a

    // 输出返回值
    for( a <- retVal){
      println( "Value of a: " + a );
    }


    import scala.util.control._
    var a = 0;
    var b = 0;
    val numList1 = List(1,2,3,4,5);
    val numList2 = List(11,12,13);

    val outer = new Breaks;
    val inner = new Breaks;

    outer.breakable {
      for( a <- numList1){ //循环一个集合
        println( "Value of a: " + a );
        inner.breakable {
          for( b <- numList2){
            println( "Value of b: " + b );
            if( b == 12 ){

              if(a==0){
                inner.break; //中断内部循环
              }else{
                outer.break() //中断外部循环
              }

            }
          }
        }
      }
    }



  }

  def fuck(name: String): String ={
    println("fuck"+name)
    return "fuck"
  }

}

//Scala 中的 private 限定符，比 Java 更严格，在嵌套类情况下，外层类甚至不能访问内层类的私有成员
//对保护（Protected）成员的访问比 java 更严格一些。因为它只允许保护成员在定义了该成员的的类的子类中被访问。不能被同包访问
