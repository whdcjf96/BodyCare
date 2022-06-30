<template>
  <div id="wrapper" style="width: 100%">
    <div>
      <!-- Sidebar -->
      <ul
        class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
        id="accordionSidebar"
        style="height: 100%"
      >
        <!-- Sidebar - Brand -->
        <router-link
          to="/"
          class="sidebar-brand d-flex align-items-center justify-content-center"
        >
          <div class="sidebar-brand-icon ">
            <i class="fas fa-laptop-medical"></i>
          </div>
          <div class="sidebar-brand-text mx-3">Nutrition Assistant</div>
        </router-link>

        <!-- TODO : Basic 라우터버튼 -->
        <!-- Nav Item - ActivityManage -->
        <li class="nav-item">
          <router-link to="/basic" class="nav-link">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>기본</span>
          </router-link>
        </li>

        <!-- TODO : ActivityManage 라우터버튼 -->
        <!-- Nav Item - ActivityManage -->
        <li class="nav-item">
          <router-link to="/activityManage" class="nav-link">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>활동관리</span>
          </router-link>
        </li>

        <!-- TODO : Food 라우터버튼 -->
        <!-- Nav Item - Food -->
        <li class="nav-item">
          <router-link to="/food" class="nav-link">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>식단관리</span>
          </router-link>
        </li>

        <!-- TODO : weightHisotry 라우터버튼 -->
        <!-- Nav Item - weightHisotry -->
        <li class="nav-item">
          <router-link to="/weight" class="nav-link">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>체중추적</span>
          </router-link>
        </li>
      </ul>
      <!-- End of Sidebar -->
    </div>
    <div style="width: 100%">
      <!-- Topbar -->
      <nav
        class="
          navbar navbar-expand navbar-light
          bg-primary
          topbar
          static-top
          shadow
        "
      >
        <!-- Topbar Navbar -->
        <ul class="navbar-nav">
          <li class="nav-item">
            <router-link
              to="/basic"
              class="nav-link mr-5 text-white"
              id="navbarDropdownMenuLink"
              aria-haspopup="true"
              aria-expanded="false"
            >
              체중관리
            </router-link>
          </li>
          <li class="nav-item">
            <router-link
              to="/diet"
              class="nav-link mr-5 text-white"
              id="navbarDropdownMenuLink"
              aria-haspopup="true"
              aria-expanded="false"
            >
              운동도우미
            </router-link>
          </li>
          <li class="nav-item" style="position: fixed; right: 0px;">
            <router-link
                to="/login"
                class="nav-link mr-5 text-white"
                id="navbarDropdownMenuLink"
                aria-haspopup="true"
                aria-expanded="false"
            >
              로그인
            </router-link>
          </li>
          <li class="nav-item" style="position: fixed; right: 100px;">
            <router-link
                to="/mypage"
                class="nav-link mr-5 text-white"
                id="navbarDropdownMenuLink"
                aria-haspopup="true"
                aria-expanded="false"
            >
              마이페이지
            </router-link>
          </li>
        </ul>
      </nav>
      <!-- End of Topbar -->

      <!-- 화면 전체 시작 -->
      <div class="container-fluid">
        <!-- 화면 헤더 시작 -->
        <!-- 현재 날짜 출력 시작 -->
        <!-- TODO : 현재 날짜 출력 -->
        <div class="text-center">
          <h2 class="text-primary">&lt;{{ today }}&gt;</h2>
        </div>
        <!-- 현재 날짜 출력 끝 -->
        <!-- 화면 헤더 끝 -->

        <!-- 화면 바디 시작 -->
        <div class="row">
          <!-- 활동대사량 시작 -->
          <!-- TODO : 활동 대사량 가로길이 6 -> 12 -->
          <div class="col-lg-12 mb-4">
            <div class="card shadow mb-4">
              <!-- 활동대사량 제목부분 -->
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">
                  활동대사량
                  <!-- TODO : 활동대사량 제목부분에 기초대사량 추가 -->
                  <h6 class="m-0 font-weight-bold text-primary float-right">
                    기초대사량 : 0000 kcal
                  </h6>
                </h6>
              </div>
              <!-- 활동대사량 바디부분 -->
              <div class="card-body text-center">
                <h2>0000</h2>
                <h6 class="float-right">kcal</h6>
              </div>
            </div>
          </div>
          <!-- 활동대사량 끝 -->

          <!-- 총 활동 시간 시작 -->
          <!-- TODO : 총 활동 시간 가로길이 6 -> 8 -->
          <div class="col-lg-8 mb-4">
            <div class="card shadow mb-4">
              <!-- 총 활동 시간 제목부분 -->
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">
                  총 활동 0 시간(24시간 기준)
                </h6>
                <!-- 활동을 선택하지 않으면 부족 -->
                <h6 class="m-0 font-weight-bold text-primary">
                  활동 정보 24시간 부족
                </h6>
              </div>
              <!-- 총 활동 시간 바디부분 -->
              <div class="card-body">
                <div class="table-responsive">
                  <table
                    class="table"
                    id="dataTable"
                    width="100%"
                    cellspacing="0"
                  >
                    <thead>
                      <tr>
                        <th scope="col">Name</th>
                        <th scope="col">Time</th>
                        <th scope="col">활동강도</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>빈둥빈둥</td>
                        <td>24hr</td>
                        <td>1.4</td>
                      </tr>
                      <tr>
                        <td>좌식업무</td>
                        <td>24hr</td>
                        <td>1.5</td>
                      </tr>
                      <tr>
                        <td>돌아다니는 업무</td>
                        <td>24hr</td>
                        <td>1.75</td>
                      </tr>
                      <tr>
                        <td>활동적인 업무</td>
                        <td>24hr</td>
                        <td>1.75</td>
                      </tr>
                      <tr>
                        <td>일반 직장인</td>
                        <td>24hr</td>
                        <td>1.75</td>
                      </tr>
                      <tr>
                        <td>휴일 직장인</td>
                        <td>24hr</td>
                        <td>1.75</td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
          </div>
          <!-- 총 활동 시간 끝 -->

          <!-- 코멘트 시작 -->
          <!-- TODO : 코멘트 가로길이 6 -> 12 -->
          <div class="col-lg-4 mb-4">
            <div class="card shadow mb-4">
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">comment</h6>
              </div>
              <div class="card-body"></div>
            </div>
          </div>
          <!-- 코멘트 끝 -->
        </div>
        <!-- 화면 바디 끝 -->

        <!-- 추가하기버튼 시작 -->
        <router-link to="/activityInput">
          <button class="btn btn-primary float-right">추가하기</button>
        </router-link>
        <!-- 추가하기버튼 끝 -->
      </div>
      <!-- 화면 전체 끝 -->
    </div>
  </div>
</template>

<script>
// 오늘 날짜를 불러오는 함수 임포트
import dayjs from "dayjs";

export default {
  name: "activityManage",
  data() {
    return {
      // TODO : 오늘 날짜 가져오는 함수
      today: dayjs().format("YYYY-MM-DD"),
    };
  },
};
</script>

<style scoped>
ul {
  list-style: none;
}
</style>