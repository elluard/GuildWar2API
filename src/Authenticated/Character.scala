package Authenticated

import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClients
import org.apache.http.util.EntityUtils

/**
  * Created by leehwangchun on 2016. 10. 29..
  */
class Character {
  val urlString = "https://api.guildwars2.com/v2/characters?access_token="

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
