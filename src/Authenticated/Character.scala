package Authenticated

import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClients
import org.apache.http.util.EntityUtils

/**
  * Created by leehwangchun on 2016. 10. 29..
  */
class Character {
  val urlString = "https://api.guildwars2.com/v2/characters"

  def Request (apiKey : String, characterName : String = null): Unit = {
    val httpClient = HttpClients.createDefault()
    val httpRequest = if(characterName == null) new HttpGet(urlString) else new HttpGet(urlString + "/" + characterName)
    httpRequest.addHeader("Authorization", "Bearer " + apiKey)
    val response = httpClient.execute(httpRequest)

    try {
      val entity = response.getEntity()
      val resultString = EntityUtils.toString(entity)
      println(resultString)
    } finally {
      response.close()
    }
  }
}
