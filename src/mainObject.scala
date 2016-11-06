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
    bank.Request("8A4C1D8D-6188-FB46-B0F3-5492CC0841AE3717C229-C7C3-4BFD-9D44-8B4656FF70E1")
  }
}
