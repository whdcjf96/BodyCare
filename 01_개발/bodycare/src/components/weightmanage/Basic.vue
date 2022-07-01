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
          <div class="sidebar-brand-icon">
            <i class="fas fa-laptop-medical"></i>
          </div>
          <div class="sidebar-brand-text mx-3">Nutrition Assistant</div>
        </router-link>

        <!-- TODO : Basic 라우터버튼 -->
        <!-- Nav Item - Basic -->
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

          <li class="nav-item" style="position: fixed; right: 0px">
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
          <li class="nav-item" style="position: fixed; right: 100px">
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
        <!-- 화면 바디 시작 -->
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
            <span>&lt; </span>{{ today }}<span> &gt;</span>
          </div>
        </div>
        <!-- 현재 날짜 출력 끝 -->

        <!-- 화면 시작 -->
        <div class="basic">
          <!-- 본문 시작 -->
          <div class="row no-gutters align-center justify-center">
            <!-- 체성분 인풋란 -->
            <div class="mt-3 col-sm-4 col-4">
              <!-- 체중 입력창 시작 -->
              <div
                class="
                  big
                  pa-4
                  ma-3
                  rounded-lg
                  v-card v-card--flat
                  v-sheet
                  theme--light
                "
              >
                <div class="card shadow mb-4">
                  <div class="card-header py-1">
                    <label
                      for="weight"
                      class="m-0 font-weight-bold text-primary"
                    >
                      체중
                    </label>
                  </div>
                  <div class="card-body text-center">
                    <input
                      type="text"
                      id="weight"
                      style="border: none; border-bottom: solid"
                      placeholder="0"
                      required
                      name="weight"
                      v-model="basic.weight"
                    />

                    <h6 class="float-right">kg</h6>
                  </div>
                </div>
                
              </div>
            </div>
            <!-- 체중 입력창 끝 -->

            <!-- 체지방률 입력창 시작 -->
            <div class="mt-3 col-sm-4 col-4">
              <div
                class="
                  big
                  pa-4
                  ma-3
                  rounded-lg
                  v-card v-card--flat
                  v-sheet
                  theme--light
                "
              >
                <div class="card shadow mb-4">
                  <div class="card-header py-1">
                    <label
                      for="bodyFat"
                      class="m-0 font-weight-bold text-primary"
                    >
                      체지방률
                    </label>
                  </div>
                  <div class="card-body text-center">
                    <input
                      type="text"
                      id="bodyFat"
                      style="border: none; border-bottom: solid"
                      placeholder="0"
                      required
                      name="bodyFat"
                      @keyup.enter="changeFat"
                      v-model="basic.bodyFat"
                    />
                    <h6 class="float-right">%</h6>
                  </div>
                </div>
              </div>
            </div>
            <!-- 체지방률 입력창 끝 -->

            <!-- 골격근량 입력창 시작 -->
            <div class="mt-3 col-sm-4 col-4">
              <div
                class="
                  big
                  pa-4
                  ma-3
                  rounded-lg
                  v-card v-card--flat
                  v-sheet
                  theme--light
                "
              >
                <div class="card shadow mb-4">
                  <div class="card-header py-1">
                    <label
                      for="muscleMass"
                      class="m-0 font-weight-bold text-primary"
                    >
                      골격근량
                    </label>
                  </div>
                  <div class="card-body text-center">
                    <input
                      type="text"
                      id="muscleMass"
                      style="border: none; border-bottom: solid"
                      placeholder="0"
                      required
                      name="muscleMass"
                      @keyup.enter="changeMuscle"
                      v-model="basic.muscleMass"
                    />
                    <h6 class="float-right">Kg</h6>
                  </div>
                </div>
              </div>
            </div>
            <!-- 골격근량 입력창 끝-->

            <!-- 가로그래프 시작 -->
            <div class="graph-wrapper">
              <div class="percent-indicator">
                <div class="per-3"></div>
                <div class="per-8"></div>
                <div class="per-12"></div>
                <div class="per-18"></div>
                <div class="per-25"></div>
                <div class="per-30"></div>
              </div>
              <ul class="graph">
                <br />
                <br />
                <li class="item1" :style="{ width: muscleg }"></li>
                <br />
                <br />
                <br />
                <li class="item2" :style="{ width: bodyFatg }"></li>
              </ul>
            </div>
            <!-- 가로그래프 끝 -->

            <!-- 추천 체중관리 시작 -->
            <div class="card shadow mt-3 col col-12">
              <div
                class="
                  pa-4
                  ml-3
                  mt-2
                  ma-3
                  v-card v-card--flat
                  v-sheet
                  theme--light
                "
              >
                <div class="v-card__title">추천 체중 관리</div>
                <div class="mt-2 mb-3 v-card__text font-weight-bold">
                  다이어트 추천, 상승다이어트 가능하나, 식단, 운동 노력이 상당히
                  필요.
                </div>
              </div>
            </div>
            <!-- 추천 체중관리 끝 -->

            <!-- 체중 관리 가이드 시작 -->
            <div class="card shadow mt-3 col col-12">
              <div
                class="
                  big
                  pa-4
                  ma-3
                  mt-0
                  rounded-lg
                  v-card v-card--flat
                  v-sheet
                  theme--light
                "
              >
                <div class="ml-3 mt-2 v-card__title">체중 관리 가이드</div>
                <div class="ml-3 mt-2 v-card__text font-weight-bold">
                  다음 버튼을 누르시면, 체중당 단백질, 칼로리 조정 값을 입력하실
                  수 있습니다.
                </div>
                <span style="color: red">
                  <span data-v-541632ae="">
                    <button
                      data-v-541632ae=""
                      type="button"
                      class="
                        elevation-0
                        op_btn
                        ml-3
                        mt-3
                        mb-3
                        ma-2
                        v-btn v-btn--is-elevated v-btn--has-bg
                        theme--light
                        v-size--default
                      "
                      style="
                        background-color: rgb(251, 222, 68);
                        border-color: rgb(251, 222, 68);
                      "
                    >
                      <span class="v-btn__content"> 다이어트 </span>
                    </button></span
                  ><!----><!----><!----><!----><!----></span
                >
              </div>
            </div>
            <!-- 체중 관리 가이드 끝 -->
          </div>
          <!-- 본문 끝 -->
        </div>
        <!-- 화면 끝 -->
      </div>
      <!-- 화면 전체 끝 -->
    </div>
  </div>
</template>

<script>
/*eslint-disable*/

import dayjs from "dayjs";

export default {
  name: "basic",
  data() {
    return {
      // TODO : 오늘 날짜 가져오는 함수
      today: dayjs().format("YYYY-MM-DD"),
      // 체지방률 가져오는 변수
      bodyFatg: 0,
      // 골격근량 가져오는 변수
      muscleg: 0,

      basic: {
        // 체지방률
        bodyFat: 0,
        // 골격근량
        muscleMass: 0,
        // 체중
        weight: 0,
      },
    };
  },
  methods: {
    // 체지방률 메소드
    changeFat: function () {
      this.bodyFatg = (this.basic.bodyFat / 30.0) * 100.0 + "%";
    },
    // 골격근량 메소드
    changeMuscle: function () {
      this.muscleg = ((this.basic.muscleMass / 36) * 30.2 * 1.8) + "%";
    },
  },
};
</script>

<style scoped>
@import "@/assets/css/Basic.css";
</style>