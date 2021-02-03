import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import req.ReqUtils
import java.time.LocalDate
import req.Result

fun testReq() {
//        val get = ReqUtils.get(HelloReq::getHello)
//
//        println(Gson().toJson(get))

        val user = User(
                name = "刘永华",
                password = "5716597Asd@",
                account = "soinbbzn",
                phone = "17328700183",
        )

//        val post = ReqUtils.post(user, UserReq::reqgister)
//
//        println(Gson().toJson(post))

        //eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI2MDFhNDFkYzkyZWExYzYxNzBlNDUyMjgifQ.vWwl60XuGxXeeoFMJB9VmsiX44Dpjezoc2LoIKKuOiI


        val actionReq = ReqUtils.retrofit.create(ActionReq::class.java)
        val date = LocalDate.of(2020, 1, 1)

        val token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI2MDFhNTRjYTkyZWExYzFkZDRhZmM4ZjUifQ.8BjOGLBvXzZo9SjlfYAnuRpPX6cJzSA_HRdzTjwu5EA"
        val userId = "5f1cfee15e3b002314a6ec13"

        val actionsCall = actionReq.getActions(userId, date, token)

        val body = ReqUtils.getBody(actionsCall)

        println(Gson().toJson(body))

}

fun main() {
//        testGson()
        testReq()
}
fun testGson(){
        val json = "{\n" +
                "  \"message\": null,\n" +
                "  \"code\": 0,\n" +
                "  \"data\": []\n" +
                "}"

        val fromJson = Gson().fromJson<Result<List<Action>>>(json, object : TypeToken<Result<List<Action>>>() {}.type)

        println(Gson().toJson(fromJson))
}
