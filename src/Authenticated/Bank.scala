package Authenticated

import org.apache.http.{Consts, HttpEntity}
import org.apache.http.client.methods.{HttpGet, HttpPost}
import org.apache.http.entity.{ContentType, StringEntity}
import org.apache.http.impl.client.HttpClients
import org.apache.http.message.BasicNameValuePair
import org.apache.http.util.EntityUtils
import org.apache.http.client.entity.UrlEncodedFormEntity

/**
  * Created by leehwangchun on 2016. 11. 6..
  */
class Bank {
  val urlString : String = "https://api.guildwars2.com/v2/account/bank"

  def Request (apiKey : String) : Unit = {
    val httpClient = HttpClients.createDefault()
    val httpRequest = new HttpGet(urlString)

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
