<template>
  <div id="wrapper" style="width: 100%">
    <div>
      <!-- Sidebar -->
      <ul
        class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
        id="accordionSidebar"
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

        <!-- TODO : DietCom 라우터버튼 -->
        <!-- Nav Item - ActivityManage -->
        <li class="nav-item">
          <router-link to="/diet" class="nav-link">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>다이어트</span>
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

        <!--    첫줄-->
        <div class="row mt-3">
          <!--    체중 시작-->
          <div class="col">
            <div class="card shadow mb-4">
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">체중</h6>
              </div>
              <div class="card-body">체중값 긁어오기0000</div>
            </div>
          </div>
          <!--    체중 끝-->

          <!--    체지방률 시작-->
          <div class="col">
            <div class="card shadow mb-4">
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">체지방률</h6>
              </div>
              <div class="card-body">체지방률 긁어오기</div>
            </div>
          </div>
          <!--    체지방률 끝-->
        </div>
        <!--    1번 row 끝-->

        <!--    2번 row-->
        <div class="row">
          <!--    원하는 체지방률 시작-->
          <div class="col">
            <div class="card shadow mb-4">
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">
                  원하는 체지방률
                </h6>
              </div>
              <div class="card-body">0</div>
            </div>
          </div>
          <!--    원하는 체지방률 끝-->
          <!--    시작시 줄일 칼로리 시작-->
          <div class="col">
            <div class="card shadow mb-4">
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">
                  시작시 줄일 칼로리
                </h6>
              </div>
              <div class="card-body">0</div>
            </div>
          </div>
          <!--    시작시 줄일 칼로리 끝-->
          <!--    매주 줄일 칼로리 시작-->
          <div class="col">
            <div class="card shadow mb-4">
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">
                  매주 줄일 칼로리
                </h6>
              </div>
              <div class="card-body">0</div>
            </div>
          </div>
          <!--    매주 줄일 칼로리 끝-->
        </div>
        <!--    2번 row끝-->

        <!--    3번 row시작-->
        <div class="row">
          <!--    원하는 체지방률일 때의 체중 시작-->
          <div class="col">
            <div class="card shadow mb-4">
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">
                  원하는 체지방률일 때의 체중
                </h6>
              </div>
              <div class="card-body">0</div>
            </div>
          </div>
          <!--    원하는 체지방률일 때의 체중 끝-->
          <!--    빼야 할  시작-->
          <div class="col">
            <div class="card shadow mb-4">
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">빼야 할 체중</h6>
              </div>
              <div class="card-body">0</div>
            </div>
          </div>
          <!--    빼야 할 체중 끝-->
          <!--    다이어트 기간 시작-->
          <div class="col">
            <div class="card shadow mb-4">
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">
                  예상 다이어트 기간
                </h6>
              </div>
              <div class="card-body">0</div>
            </div>
          </div>
          <!--    다이어트 기간 끝-->
        </div>
        <!--    3번 row 끝-->

        <!--    comment 시작-->
        <div class="row">
          <div class="col">
            <div class="card shadow mb-4">
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Comment</h6>
              </div>
              <div class="card-body">...</div>
            </div>
          </div>
        </div>
        <!--    comment 끝-->
      </div>
    </div>
  </div>
</template>

<script>

import dayjs from "dayjs";

export default {
  name: "DietCom",
  data() {
    return {
      // TODO : 오늘 날짜 가져오는 함수
      today: dayjs().format("YYYY-MM-DD"),
      bodyFat:0,
      bodyFatg:0,
      muscle:0,
      muscleg:0,
      weight:0
    };

  },
};
</script>

<style scoped>
</style>