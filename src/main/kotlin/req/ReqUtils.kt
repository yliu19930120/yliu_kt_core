package req

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ReqUtils {

    val url = "http://localhost:10001"
    val retrofit = Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build()

    inline fun<reified S,T> get(reqFunc :S.()-> Call<Result<T>>):Result<T>{
        val create = retrofit.create(S::class.java)

        val call = create.reqFunc()

        val execute = call.execute()

        val body = try {
            val body = execute.body()
            return body!!
        } catch (e: Exception) {
            throw Exception()
        }
        return body!!
    }

    inline fun<reified S,P,T> post(p:P, reqFunc:S.(p :P)-> Call<Result<T>>):Result<T>{
        val create = retrofit.create(S::class.java)

        val call = create.reqFunc(p)

        val execute = call.execute()

        val body = try {
            val body = execute.body()
            return body!!
        } catch (e: Exception) {
            throw Exception()
        }
        return body!!
    }

}
