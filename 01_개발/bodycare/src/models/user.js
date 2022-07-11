// 사용자 모델 정의
// 인증을 위한 사용자 모델
export default class User {
  constructor(name, email, password,gender,height,age) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.gender = gender;
    this.height = height;
    this.age=age;
  }
}



