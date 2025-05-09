package jamilligioielli.com.github.cryptomonitor

import retrofit2.http.GET
import retrofit2.Response

interface MercadoBitcoinService {

    @GET("api/BTC/ticker/")
    suspend fun getTicker(): retrofit2.Response<TickerResponse>
}