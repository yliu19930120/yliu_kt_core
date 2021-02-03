class User(val name:String, val password:String, val account:String, val phone:String, val token: String?, val id: String?) {
    constructor(name: String, password: String, account: String, phone: String) : this(name,password,account,phone,null,null)
}
