package com.ler

object CollectionFun {

  def main(args: Array[String]): Unit = {

    testdigui(1)

    //Scala 集合分为可变的和不可变的集合。

    // 定义整型 List
    val x1 = List(1,2,3,4)
    val list = List()

    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    println(site)

    val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val site2 = "Facebook" :: ("Taobao" :: Nil)

    // 使用 ::: 运算符 ;使用 ::: 运算符或 List.:::() 方法或 List.concat() 方法来连接两个或多个列表
    var fruit = site1 ::: site2   //List(Runoob, Google, Baidu, Facebook, Taobao)
    println( "site1 ::: site2 : " + fruit )

    // 使用 List.:::() 方法
    fruit = site1.:::(site2)
    println( "site1.:::(site2) : " + fruit )

    // 使用 concat 方法
    fruit = List.concat(site1, site2)
    println( "List.concat(site1, site2) : " + fruit  )

    val site11 = List.fill(3)("Runoob") // 重复 Runoob 3次 List(Runoob, Runoob, Runoob)
    println( "site : " + site11  )

    val num11 = List.fill(10)(2)         // 重复元素 2, 10 次  List(2, 2, 2, 2, 2, 2, 2, 2, 2, 2)
    println( "num : " + num11  )

    // 通过给定的函数创建 5 个元素
    val squares = List.tabulate(6)(n => n * n)   //List(0, 1, 4, 9, 16, 25)
    println( "一维 : " + squares  )

    // 创建二维列表
    val mul = List.tabulate( 4,5 )( _ * _ ) //List(List(0, 0, 0, 0, 0), List(0, 1, 2, 3, 4), List(0, 2, 4, 6, 8), List(0, 3, 6, 9, 12))
    println( "多维 : " + mul  )

    val list1 = List.tabulate(4, 5)((x, y) => x * y) //等同上面的写法
    println(list1)

    val sitecc = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    println( "site 反转前 : " + sitecc )
    println( "site 反转后 : " + sitecc.reverse )

    var a = "ciel" +: sitecc  //头部添加元素 +:
    println(a)
    println(a==sitecc) //false 是一个新对象

    var b = "swift" :: sitecc  //头部添加元素
    println(b)
    println(b==sitecc) //新对象

    var jjd =  sitecc :+ "john" //尾部添加 :+
    println(jjd)

    val builder = jjd.addString(new StringBuilder, ">>") //列表的所有元素添加到 StringBuilder，并指定分隔符
    println(builder)

    val str = jjd.apply(2) //通过列表索引获取元素
    println(str)

    val bool = jjd.contains("Baidu")
    println(bool)



    //////////////////////////////////////////////////////////////////////////////////////////////
    // 定义 Set
    val x2 = Set(1,3,5,7)
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
    println(nums)

    println(nums.head) //返回回列表第一个元素

    println(nums.tail)  //回一个列表，包含除了第一元素之外的其他元素
    val empty : Boolean = nums.isEmpty //是否为空
    println(empty)


    // 定义 Map
    val x3 = Map("one" -> 1, "two" -> 2, "three" -> 3)

    // 创建两个不同类型元素的元组
    val x4 = (10, "Runoob")


    // 定义 Option
    val x5 : Option[Int] = Some(5)


  }

  def testdigui(i: Int): Unit ={
    println(i)
    testdigui(i+1)
  }
}
