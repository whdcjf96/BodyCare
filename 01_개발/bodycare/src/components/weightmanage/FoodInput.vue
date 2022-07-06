<template>
  <!-- 화면 시작 -->
  <div class="container-fluid" id="page-top">



    <!-- 화면 바디 시작 -->
    <div class="row">

      <!-- 1번 row 시작 -->
      <div class="col-lg-6 mb-4">
        <div class="card shadow mb-4">
          <div class="card-body">


            <div class="table-responsive">


              <table class="table" id="dataTable" width="100%" cellspacing="0">
                <thead>
                  <tr>
                    <th>활동</th>
                    <th>활동강도</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>잠자기</td>
                    <td>0.93</td>
                  </tr>
                  <tr>
                    <td>누워있기</td>
                    <td>1.2</td>
                  </tr>
                  <tr>
                    <td>읽기</td>
                    <td>1.3</td>
                  </tr>
                  <tr>
                    <td>앉아서 TV</td>
                    <td>1.57</td>
                  </tr>
                  <tr>
                    <td>사무업무</td>
                    <td>1.6</td>
                  </tr>
                  <tr>
                    <td>휴일 직장인</td>
                    <td>1.75</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
      <!-- 1번 row 끝-->

      <!-- 2번 row 시작-->
      <div class="col-lg-6 mb-4">
        <!-- 활동창 시작 -->
        <div class="card shadow mb-4">
          <div class="card-body text-center">
            <div class="text-left">
              <h6>식품명</h6>
            </div>
            <div class="row">
              <div class="col">
                <h4>0g</h4>
              </div>
              <div class="col">
                <h4>0g</h4>
              </div>
              <div class="col">
                <h4>0g</h4>
              </div>
            </div>
          </div>
        </div>
        <!-- 활동창 끝 -->

        <!-- 시간창 시작 -->
        <div class="card shadow mb-4">
          <div class="card-body">
            <div class="text-left">
              <h6>수량</h6>
            </div>
            <div class="text-center">1</div>
            <div class="float-right">100g 기준</div>
          </div>
        </div>
        <!-- 시간창 끝 -->

        <!-- 아점저창 시작 -->
        <div class="card shadow mb-4">
          <div class="card-body">
            <ul class="navbar-nav">
              <!-- dropdown #1 시작 -->
              <li class="nav-item dropdown mr-4">
                <a
                  class="nav-link dropdown-toggle mr-5"
                  href="#"
                  id="navbarDropdownMenuLink"
                  data-toggle="dropdown"
                  aria-haspopup="true"
                  aria-expanded="false"
                >
                  식사구분
                </a>
                <div
                  class="dropdown-menu"
                  aria-labelledby="navbarDropdownMenuLink"
                >
                  <a href="#" class="dropdown-item"> 아침 </a>
                  <a href="#" class="dropdown-item"> 점심 </a>
                  <a href="#" class="dropdown-item"> 저녁 </a>
                  <a href="#" class="dropdown-item"> 간식 </a>
                </div>
              </li>
            </ul>
            <!-- dropdown #1 끝 -->
          </div>
        </div>
        <!-- 아점저창 끝 -->
      </div>
      <!-- 2번 row 끝-->
    </div>
    <!-- 화면 바디 끝 -->

    <!-- 취소버튼 -->
    <router-link to="/food">
      <button class="btn btn-danger float-left">취소</button>
    </router-link>

    <!-- 저장 후 추가 버튼 -->
    <button class="btn btn-primary float-right">저장 후 추가</button>
  </div>
</template>

<script>
export default {
  name: "foodInput",
};
</script>

<style>
</style>