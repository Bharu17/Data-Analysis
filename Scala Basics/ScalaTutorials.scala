// Databricks notebook source
// MAGIC %md ScalaTutorials.Com

// COMMAND ----------

2 * 3

// COMMAND ----------

25 / (3+2)

// COMMAND ----------

(1). + (2)
//scala primitives are treated as objects. since they are objects they are simply method calls

// COMMAND ----------

var x = 1+5
println(x)

// COMMAND ----------

//final variables are declared using the key word "Val". final variables are the variables which cannot be reassigned
val x = 4 + 5

// COMMAND ----------

println("Hello World")
//printing functions are imported in the default scala.predef

// COMMAND ----------

//string interpolation is supported in Scala.strings can be called using s and f.
var name = "James"
println(s"Hello, $name")

// COMMAND ----------

printf("%3d", 0) //printf can also be used

// COMMAND ----------

printf("%-3d", 129) //using a '-' sign will result in left allignment

// COMMAND ----------

// MAGIC %md Useful Operators

// COMMAND ----------

val range1 = 1 to 10

// COMMAND ----------

val range2 = 1 until 10
//exclusive 

// COMMAND ----------

val range3 = 2 until 20 by 3

// COMMAND ----------

println(range3.tolist)

// COMMAND ----------

val num = -5
val numAbs = num.abs
//absolute value

// COMMAND ----------

val max5or7 = numAbs.max(7)

// COMMAND ----------

val min5or7 = numAbs.min(7)

// COMMAND ----------

val reverse ="Scala".reverse

// COMMAND ----------

val cap = "scala".capitalize

// COMMAND ----------

val multi = "Scala!" * 9

// COMMAND ----------

val int ="253".toInt

// COMMAND ----------

val moreThan4 = range.filter(_>4)
println(moreThan4)

// COMMAND ----------

val doubleIt = range.map(_ * 2)

// COMMAND ----------

def add(x:Int, y:Int):Int = {
  x + y
}


// COMMAND ----------

println(add(25,36))

// COMMAND ----------

def add1(x:Int, y:Int) = x + y

// COMMAND ----------

add1(20,20)

// COMMAND ----------

def doWithOneAndTwo(f: (Int, Int) => Int) = {
  f(1,2)
}

// COMMAND ----------

val call1 = doWithOneAndTwo((x:Int, y:Int) => x +y)

// COMMAND ----------

  val call3 = doWithOneAndTwo(_ + _)

// COMMAND ----------

println(call1, call3)

// COMMAND ----------

def add1(x:Int, y:Int) = x + y 

// COMMAND ----------

val add1 =(x:Int, y:Int) => x + y

// COMMAND ----------

val add3:(Int, Int) => Int = _ + _ 

// COMMAND ----------

val add4 = (_ + _ ):(Int, Int) => Int

// COMMAND ----------

println(add3(43,23))

// COMMAND ----------

def swap(x:String, y:String) = (y,x)

// COMMAND ----------

val (a,b) = swap("Hello", "World")
println(a,b)

// COMMAND ----------

var x, y, z = 0
var w, python, scala = false
println(x,y,z,w,python,scala)

// COMMAND ----------

var (x,y,z,c,python,scala) = (1,3,4,true,false,"no!")
println(x,y,z,c,python,scala)

// COMMAND ----------

val list1 = scala.collection.mutable.ListBuffer.empty[Int]

// COMMAND ----------

var i, sum = 0
while(i< 10) {
  sum+=i
  i+=1
}
println(sum)

// COMMAND ----------

var sum= 0
for (i<- 0 until 10){
  sum+=i
}
println(sum)

// COMMAND ----------

if(true)
println("No braces on a single expression")

// COMMAND ----------

if(1 + 1 == 2) {
  println("Multiple")
  println("statements")
  println("require")
  println("braces")
}
  else{
    println("new math is found")
    println("your system gone crazy")
  }

// COMMAND ----------

val likeeggs = false
val breakfast = 
if(likeeggs) "scrambled eggs"
else "apple"
println(breakfast)

// COMMAND ----------

val selection = "One"
selection match {
  case "One" => println("You selected option one!")
  case "Two" => println("You selected option two!")
  case _ => println("You selected something else")
}

// COMMAND ----------

def printArray[K](array:Array[K]) = array.mkString("Array(" , ", " , ")")

// COMMAND ----------

val array1 = Array(1,2,3)
printArray(array1)

// COMMAND ----------

val array2 = Array("a", 2, true)
val array3 = Array("a", "b", "c")
printArray(array2)
printArray(array3)

// COMMAND ----------

val itemAtIndex0 = array3(0)

// COMMAND ----------

array3(0)="d"
printArray(array3)

// COMMAND ----------

//Concatenation using the ++operator,
//prepending items using +: and appending using :+
val concatenated = "prepend" +: (array1 ++ array2) :+ "append"
printArray(concatenated)

// COMMAND ----------

array3.indexOf("b")

// COMMAND ----------



// COMMAND ----------



// COMMAND ----------

// MAGIC %md Mutable Collections

// COMMAND ----------

val evenList = scala.collection.mutable.ListBuffer.empty[Int]

// COMMAND ----------

val oddList = scala.collection.mutable.ListBuffer.empty[Int]

// COMMAND ----------

val myList = 1 to 100

// COMMAND ----------

for(i <- myList){
  if(i % 2 == 0) {
    evenList += i
  
 }
  else {
    oddList += i
  }
}

// COMMAND ----------

println(evenList)

// COMMAND ----------

val numberTwo = scala.collection.mutable.ListBuffer.empty[Int]
val numberThree = scala.collection.mutable.ListBuffer.empty[Int]
val numberFour = scala.collection.mutable.ListBuffer.empty[Int]
val numberFive = scala.collection.mutable.ListBuffer.empty[Int]
val others = scala.collection.mutable.ListBuffer.empty[Int]

// COMMAND ----------

for (j <- myList){
  if(j%2==0){
    numberTwo += j
  }
  else if(j%3==0){
    numberThree +=j
  }
  else if(j%4==0){
    numberFour +=j
  }
  else {
    others +=j
  }
}

// COMMAND ----------

println(numberTwo)

// COMMAND ----------

println(numberThree)

// COMMAND ----------


