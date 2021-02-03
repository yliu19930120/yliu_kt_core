import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query
import java.time.LocalDate
import req.Result

interface ActionReq {

    @GET("/yliu/action/action")
    fun getActions(@Query("userId") userId:String,
                   @Query("traningDate") traningDate:LocalDate,
                   @Header("X-AUTH-TOKEN")token:String):
            Call<Result<List<Action>>>

}
