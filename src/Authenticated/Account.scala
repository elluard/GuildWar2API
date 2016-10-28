package Authenticated

/**
  * Created by leehwangchun on 2016. 10. 28..
  */

import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClients
import org.apache.http.util.EntityUtils

class Account {
  val urlString : String = "https://api.guildwars2.com/v2/account?access_token="

  def Request (apiKey : String): Unit = {
    val httpClient = HttpClients.createDefault()
    val httpGet = new HttpGet(urlString + apiKey)
    val response = httpClient.execute(httpGet)

    try {
      val entity = response.getEntity()
      val resultString = EntityUtils.toString(entity)
      println(resultString)
    } finally {
      response.close()
    }
  }
}