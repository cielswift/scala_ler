package com.ler

import java.util.Date

object World {

  def main(args: Array[String]): Unit = {

    //Scala 中使用 val 语句可以定义函数，def 语句定义方法

    val eat = (food :String) => { //函数,可以用变量接受
      print("eat:"+food)
      "aaa"  //scala 返回值不要加return; 可能会出错
    }

    val str = eat("apple")
    println(str)


    val l = fuck(getl())

    println(l)


    printInt(b = 5, a = 7) //指定函数参数名，并且不需要按照顺序向函数传递参数

    printStrings("a","b","c")

    val jc = jiecheng(5)
    println(jc)

    val addint = addInt()
    println(addint)


    val i = cus(jiecheng, 5)
    println(i)

    println( apply( layout, 10) )

//////////////////////////////////////

    //函数应用化
    val date = new Date()
    val logWithDateBound = log(date, _ : String) //把 date 绑定到 第一个_ 的位置上并把这个新的函数值的索引的赋给变量

    logWithDateBound("message1")
    Thread.sleep(1000)
    logWithDateBound("message2")
    Thread.sleep(1000)
    logWithDateBound("message3")

    println( "str1 + str2 = " +  strcat("str1")("str2") )

    val buf = new StringBuilder()

    val name = "xiapeixin"



  }

  def eat(food :String) :String = {
    print("ccc:"+food)
    "word"
  }

  def getl():Long={
    println("get datetime")
    System.nanoTime()
  }

  def fuck(t : => Long ):Long={ //使用 => 符号来设置传名调用,每次使用传名调用时，解释器都会计算一次表达式的值
    println("fffffffffff")
    t
  }

  def printInt( a:Int, b:Int ) = {
    println("Value of a : " + a +"Value of b : " + b );
  }

  def printStrings(args: String* ) = { //可变参数
    for( arg <- args ){
      println(arg);

    }
  }

  def jiecheng(n: Int):Int={ //递归
    if(n<=1){
      n
    }else{
      n * jiecheng(n-1)
    }
  }

  def addInt( a:Int=5, b:Int=7 ) : Int = { //默认参数
    a + b
  }

  def cus(f : Int => Int,x: Int): Int={ //把函数作为参数传递
    f(x)
  }

  // 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
  def apply(f: Int => String, v: Int) = f(v)
  // 函数f 需要一个int类型的参数

  def layout[A](x: A) = "[" + x.toString() + "]" //泛型


  def factorial(i: Int): Int = {  //内嵌函数
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }


  def log(date: Date, message: String)  = { //偏应用函数
    println(date + "----" + message)
  }

  def strcat(s1: String)(s2: String) = {  //非柯里化函数
    s1 + s2
  }
  //add(1)(2) 实际上是依次调用两个普通函数（非柯里化函数），
  //第一次调用使用一个参数 s1，返回一个匿名函数，第二次使用参数s2调用这个匿名函数。

  //拆解 def add(x:Int)=(y:Int)=>x+y
        // val result = add(1) result是一个匿名函数
        //val sum = result(2)  调用

}


