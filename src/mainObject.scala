import Authenticated._

/**
  * Created by leehwangchun on 2016. 10. 28..
  */

object mainObject {
  def main(args : Array[String]): Unit = {
    val accountObj = new Account()
    val characterObj = new Character()
    val bank = new Bank()

    //Insert Key that you can get https://account.arena.net/applications
    bank.Request()
  }
}
