public class Users {
	// 全局变量（成员变量）---有默认值---可以不赋值
	int userid;
	String username;
	String password;
	String sex;
	int age;

	public void sayHello() {
		System.out.println("hello world!");
	}

	// String name 局部变量----只属于某一个方法
	// 方法定义时
	// 形参---形式参数---样子货 ---形参类型必须制定正确，形参名称--随便写（建议见名知意，遵循java标识符命名规则）

	// public void somebodySayHello(形参) {
	// public void somebodySayHello(形参类型 形参名称) {
	public void somebodySayHello(String name) {
		// 还是局部变量---没有默认值---在使用之前必须进行初始化、
		// 同一作用域内不允许重名
		// String name = "令狐冲";
		// 全局变量与局部变量可以名称一样
		String username = "令狐冲";
		// String name3;
		System.out.println(name + "say: hello world!");
	}

	// 定义方法: 如果有多个参数，多个参数之间以逗号（，）隔开
	public void showUserInfo(String username, String password, String sex, int age, int userid) {
		System.out.println(userid + "  " + username + "  " + password + "  " + sex + "  " + age);
	}

	public void showUserInfo_() {
		System.out.println(userid + "  " + username + "  " + password + "  " + sex + "  " + age);
	}

}
