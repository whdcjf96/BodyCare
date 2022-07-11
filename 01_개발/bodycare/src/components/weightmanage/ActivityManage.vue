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
          bg-gradient-primary2
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
        <div class="row">
          <div
              class="ma-0 pa-3 col col-12"
              style="
              color: #4e73df;
              font-size: 30px;
              font-weight: bold;
              text-align: center;
            "
          >
            <span>&lt; </span>{{ today }}<span c> &gt;</span>
          </div>
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
                  <!-- TODO : 활동대사량 제목부분에 기초대사량 추가 -->
                  <h6 v-if="user.gender==F" class="m-0 font-weight-bold text-primary float-right">
                    기초대사량 : {{ mBmr }} kcal
                  </h6>
                  <h6 v-else class="m-0 font-weight-bold text-primary float-right">
                    기초대사량 : {{ wBmr }} kcal
                  </h6>
                </h6>
              </div>
              <!-- 활동대사량 바디부분 -->
              <div class="card-body text-center">
                <h2 v-if="user.gender==F">{{ mAmr }}</h2>
                <h2 v-else>{{ wAmr }}</h2>
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
<!--                      <tr v-for="(act,index) in saveActivities" :key="index">-->
<!--                        <td>{{ act.activity }}</td>-->
<!--                        <td>{{ act.actTime }}</td>-->
<!--                        <td>{{ act.intensity}}</td>-->
<!--                      </tr>-->
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
  /* eslint-disable */
  name: "activityManage",
  data() {
    return {
      user:[],
      activities: [],
      bmr:0,
      saveActivities:{
        id:null,
        activity:"",
        actTime:0,
        intensity:0,
      },
      basic: {
        // 체지방률
        bodyFat: 0,
        // 골격근량
        muscleMass: 0,
        // 체중
        weight: 0,
      },
      message: "", // 에러 메세지 저장용
      // TODO : 오늘 날짜 가져오는 함수
      today: dayjs().format("YYYY-MM-DD"),
    };
  },
  methods:{
  //  기초대사량
    // 체지방률 메소드
    //남
    mBmr: function () {
      this.mBmr = 66+ (13.8*this.basic.weight)+(5*this.user.height)-(6.8*this.user.age);
    },
    //여
    wBmr: function () {
      this.mBmr = 655+ (9.6*this.basic.weight)+(1.8*this.user.height)-(4.7*this.user.age);
    },
  },
  computed:{
  }
};
</script>

<style scoped>
ul {
  list-style: none;
}
</style>