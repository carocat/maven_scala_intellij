package com.recursive

object Main extends App with Logging {

  for (i <- Seq.range(1,101,1)) {
    i match {
      case _ if i%3 == 0 && i%5 == 0 => println("CracklePop")
      case _ if i%3 == 0  => println("Crackle")
      case _ if i%5 == 0  => println("Pop")
      case _ => println(i)
    }
  }

  def msg = "Hi Recurse Center :-D"
  log.info(msg)

}

