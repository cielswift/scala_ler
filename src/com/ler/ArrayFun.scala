package com.ler

object ArrayFun {

  def main(args: Array[String]): Unit = {

    var zs :Array[String] = new Array[String](3)

    zs(0) = "xiapeixin"
    zs(1) = "xiapeixin"
    zs(2) = "xiapeixin"

    for(z <- zs){
      println(zs)
    }

    var zzs = Array("Runoob", "Baidu", "Google")

    for(z <- zzs){
      println(z)
    }

    import Array._
    var myMatrix = ofDim[Int](3,3) //二维数组 创建指定长度的数组


    for(i <- 0 until myMatrix.length; j <- 0 until myMatrix.length){
        myMatrix(i)(j) = j
    }

    println(myMatrix(0)(2))

    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    var myList3 =  concat( myList1, myList2) //合并数组

    myList3.foreach(t => println(t))

    var myList11 = range(10, 20, 2) //区间数组,指定步长
    var myList22 = range(10,20)

    myList11.foreach(t => print(t.toString.concat("--"))) //10--12--14--16--18--

    val array = apply("xia", "peix", "xin") //创建数组

    array.foreach(t => println(t))

    var zds :Array[String] = new Array[String](3)

    array.copyToArray(zds,0,3) //复制数组,不包含3

    println("---------------------------------------")
    zds.foreach(t => println(t))

    val value : Array[String] = Array.iterate("Ciel", 3)(z => z.toString.toUpperCase)
    //组初始值为 Ciel，长度为 3，计算函数为转换大写
    value.foreach(t => println(t))


    val strings = Array.tabulate(10)(t => t+1)
    //返回指定长度数组，每个数组元素为指定函数的返回值，默认从 0 开始
    strings.foreach(t => println(t))


  }


}
