import req.Result
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserReq {

    @POST("/yliu/user/register")
    fun reqgister(@Body user: User): Call<Result<User>>

    @POST("/yliu/user/login")
    fun login(@Body user: User): Call<Result<User>>
}
