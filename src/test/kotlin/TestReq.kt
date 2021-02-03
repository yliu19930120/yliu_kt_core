import com.google.gson.Gson
import req.ReqUtils


fun main() {
        val get = ReqUtils.get(HelloReq::getHello)

        println(Gson().toJson(get))

        val user = User("刘永华", "5716597Asd@", "soinbbzn", "17328700183")

        val post = ReqUtils.post(user, UserReq::reqgister)

        println(Gson().toJson(post))
}
