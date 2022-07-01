<template>
  <div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
      <div class="card-body p-0">
        <!-- Nested Row within Card Body -->
        <div class="row">
          <div class="col-lg-5 d-none d-lg-block bg-register-image" ></div>
          <div class="col-lg-7">
            <div class="p-5">
              <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">회원가입</h1>
              </div>
              <form class="user">
                <div class="form-group">
                    <input type="text" class="form-control form-control-user" id="Name"
                           placeholder="Name">
                </div>
                <div class="form-group">
                  <input type="email" class="form-control form-control-user" id="Email"
                         placeholder="Email Address">
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="password" class="form-control form-control-user"
                           id="Password" placeholder="Password">
                  </div>
                  <div class="col-sm-6">
                    <input type="password" class="form-control form-control-user"
                           id="RepeatPassword" placeholder="Repeat Password">
                  </div>
                </div>
                <div class="form-group">
                  성별
                    <input type="radio" name="gender" value="female">여성
                    <input type="radio" name="gender" value="male">남성
                </div>
                <a href="login.html" class="btn btn-primary btn-user btn-block">
                  가입하기
                </a>
              </form>
              <div class="text-center">
                <a class="small" href="/login">이미 가입하셨나요? 로그인하러가기</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

  </div>
</template>

<script>
export default {
  name: "RegisterCom"
}
</script>

<style scoped>

</style>