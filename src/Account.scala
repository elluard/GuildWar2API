/**
  * Created by leehwangchun on 2016. 10. 28..
  */

import org.apache.http.client.methods.{CloseableHttpResponse, HttpGet}
import org.apache.http.impl.client.{CloseableHttpClient, HttpClients}
import org.apache.http.util.EntityUtils

class Account() {
  val urlString : String = "https://api.guildwars2.com/v2/account"

  def Request (apiKey : String): Unit = {
    val httpClient = HttpClients.createDefault()
    val httpGet = new HttpGet("https://api.guildwars2.com/v2/account?access_token=" + apiKey)
    val response = httpClient.execute(httpGet)

    try {
      val entity = response.getEntity()
      val resultString = EntityUtils.toString(entity)
      print(resultString)
    } finally {
      response.close()
    }
  }
}
