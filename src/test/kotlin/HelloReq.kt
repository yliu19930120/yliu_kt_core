import req.Result
import retrofit2.Call
import retrofit2.http.GET

interface HelloReq {

    @GET("/yliu/hello")
    fun getHello():Call<Result<String>>
}
