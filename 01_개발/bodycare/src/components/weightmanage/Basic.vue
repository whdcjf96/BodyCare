<template>
  <div id="wrapper">
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
          <div class="sidebar-brand-icon rotate-n-15">
            <i class="fas fa-laugh-wink"></i>
          </div>
          <div class="sidebar-brand-text mx-3">Body Care</div>
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
            <router-link to="/basic"
                         class="nav-link mr-5 text-white"
                         id="navbarDropdownMenuLink"
                         aria-haspopup="true"
                         aria-expanded="false"
            >
              체중관리
            </router-link>
          </li>
          <li class="nav-item">
            <router-link to="/diet"
                         class="nav-link mr-5 text-white"
                         id="navbarDropdownMenuLink"
                         aria-haspopup="true"
                         aria-expanded="false"
            >
              운동도우미
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
        <div class="row ">
          <div
              class="ma-0 pa-3 col col-12"
              style="
          color: #4e73df;
          font-size: 30px;
          font-weight: bold;
          text-align: center;
        ">
            <span>&lt;   </span>{{ today }}<span c>   &gt;</span>
          </div>
        </div>
        <!-- 현재 날짜 출력 끝 -->
        <div class="basic">

          <!-- 본문 -->
          <div class="row no-gutters align-center justify-center">

            <!-- 체성분 인풋란 -->
            <div class="mt-3 col-sm-4 col-4">
              <div class="big pa-4 ma-3 rounded-lg v-card v-card--flat v-sheet theme--light">
                <div class="card shadow mb-4">
                  <div class="card-header py-1">
                    <h6 class="m-0 font-weight-bold text-primary">
                      체중
                    </h6>
                  </div>
                  <div class="card-body text-center">
                    <input
                        type="text"
                        style="border: none; border-bottom: solid"
                        placeholder="0"
                    />

                    <h6 class="float-right">kg</h6>
                  </div>
                </div>
              </div>
            </div>
            <div class="mt-3 col-sm-4 col-4">
              <div class="big pa-4 ma-3 rounded-lg v-card v-card--flat v-sheet theme--light">
                <div class="card shadow mb-4">
                  <div class="card-header py-1">
                    <h6 class="m-0 font-weight-bold text-primary">
                      체지방률
                    </h6>
                  </div>
                  <div class="card-body text-center">
                    <input
                        type="text"
                        style="border: none; border-bottom: solid"
                        placeholder="0"
                    />
                    <h6 class="float-right">%</h6>
                  </div>
                </div>
              </div>
            </div>
            <div class="mt-3 col-sm-4 col-4">
              <div class="big pa-4 ma-3 rounded-lg v-card v-card--flat v-sheet theme--light">
                <div class="card shadow mb-4">
                  <div class="card-header py-1">
                    <h6 class="m-0 font-weight-bold text-primary">
                      골격근량
                    </h6>
                  </div>
                  <div class="card-body text-center">
                    <input
                        type="text"
                        style="border: none; border-bottom: solid"
                        placeholder="0"
                    />
                    <h6 class="float-right">kg</h6>
                  </div>
                </div>
              </div>
            </div>
            <!-- 체성분 인풋란 끝-->

            <!-- 가로그래프-->
            <div class="card shadow mt-3 col col-12">
              <div class="pa-4 ma-3 v-card v-card--flat v-sheet theme--light">
                <div class="row mt-0 row--dense">
                  <div class="ma-0 mb-5 pa-0 col col-2"></div>
                  <div class="caption ma-0 mb-3 pa-0 col col-10"
                       style="position: relative; background: transparent;">
                    <div vertical-align="center" style="position: absolute; left: 0%;">6</div>
                    <div style="position: absolute; left: 20%;">9.5</div>
                    <div style="position: absolute; left: 40%;">11.5</div>
                    <div style="position: absolute; left: 60%;">13.2</div>
                    <div style="position: absolute; left: 80%;">14.5</div>
                    <div align="center" class="ma-0 mt-6 pa-0 white--text"
                         style="z-index: 1; position: absolute; left: 0%; width: 20%;">매우낮음
                    </div>
                    <div align="center" class="ma-0 mt-6 pa-0 white--text"
                         style="z-index: 1; position: absolute; left: 20%; width: 20%;">낮음
                    </div>
                    <div align="center" class="ma-0 mt-6 pa-0 white--text"
                         style="z-index: 1; position: absolute; left: 40%; width: 20%;">보통
                    </div>
                    <div align="center" class="ma-0 mt-6 pa-0 white--text"
                         style="z-index: 1; position: absolute; left: 60%; width: 20%;">높음
                    </div>
                    <div align="center" class="ma-0 mt-6 pa-0 white--text"
                         style="z-index: 1; position: absolute; left: 80%; width: 20%;">매우높음
                    </div>
                  </div><!----></div>
                <div class="row mt-1 row--dense">
                  <div align="center" class="subtitle-2 font-weight-bold col col-2"> 골격근량</div>
                  <div class="caption pa-0 col col-10"
                       style="position: relative; background: linear-gradient(90deg, rgb(214, 57, 57) 0%, rgb(228, 175, 11) 50%, rgb(15, 106, 195) 100%);">
                    <div
                        style="position: absolute; left: 20%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                    <div
                        style="position: absolute; left: 40%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                    <div
                        style="position: absolute; left: 60%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                    <div
                        style="position: absolute; left: 80%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                    <div class="mt-0"
                         style="position: relative; left: 0%; border: 2px solid black; height: 100%; width: 2px;"></div>
                  </div><!----></div>
                <div class="row mt-5 row--dense">
                  <div class="ma-0 mb-5 pa-0 col col-2"></div>
                  <div class="caption ma-0 mb-3 pa-0 col col-10"
                       style="position: relative; background: transparent;">
                    <div style="position: absolute; left: 0%;">3%</div>
                    <div style="position: absolute; left: 20%;">8%</div>
                    <div style="position: absolute; left: 40%;">12%</div>
                    <div style="position: absolute; left: 60%;">18%</div>
                    <div style="position: absolute; left: 80%;">25%</div>
                    <div align="center" class="ma-0 mt-6 pa-0 white--text"
                         style="z-index: 1; position: absolute; left: 0%; width: 20%;">매우낮음
                    </div>
                    <div align="center" class="ma-0 mt-6 pa-0 white--text"
                         style="z-index: 1; position: absolute; left: 20%; width: 20%;">낮음
                    </div>
                    <div align="center" class="ma-0 mt-6 pa-0 white--text"
                         style="z-index: 1; position: absolute; left: 40%; width: 20%;">보통
                    </div>
                    <div align="center" class="ma-0 mt-6 pa-0 white--text"
                         style="z-index: 1; position: absolute; left: 60%; width: 20%;">높음
                    </div>
                    <div align="center" class="ma-0 mt-6 pa-0 white--text"
                         style="z-index: 1; position: absolute; left: 80%; width: 20%;">매우높음
                    </div>
                  </div><!----></div>
                <div class="row mt-1 mb-5 row--dense">
                  <div align="center" class="subtitle-2 font-weight-bold col col-2"> 체지방률</div>
                  <div class="caption pa-0 col col-10"
                       style="position: relative; background: linear-gradient(270deg, rgb(214, 57, 57) 0%, rgb(228, 175, 11) 50%, rgb(15, 106, 195) 100%);">
                    <div
                        style="position: absolute; left: 20%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                    <div
                        style="position: absolute; left: 40%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                    <div
                        style="position: absolute; left: 60%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                    <div
                        style="position: absolute; left: 80%; border: 1px dotted white; height: 100%; width: 1px;"></div>
                    <div class="mt-0"
                         style="position: relative; left: 0%; border: 2px solid black; height: 100%; width: 2px;"></div>
                  </div><!----></div>
              </div>
            </div>
            <!-- 추천 체중관리 -->
            <div class="card shadow mt-3 col col-12">
              <div class="pa-4 ml-3  mt-2 ma-3 v-card v-card--flat v-sheet theme--light">
                <div class="v-card__title">추천 체중 관리</div>
                <div class="mt-2 mb-3 v-card__text font-weight-bold"> 다이어트 추천, 상승다이어트 가능하나, 식단, 운동 노력이 상당히 필요.
                </div>
              </div>
            </div>
            <!-- 체중 관리 가이드 -->
            <div class="card shadow mt-3 col col-12">
              <div class="big pa-4 ma-3 mt-0 rounded-lg v-card v-card--flat v-sheet theme--light">
                <div class="ml-3 mt-2 v-card__title">체중 관리 가이드</div>
                <div class="ml-3 mt-2 v-card__text font-weight-bold"> 다음 버튼을 누르시면, 체중당 단백질, 칼로리 조정 값을 입력하실 수
                  있습니다.
                </div>
                <span style="color: red;">
              <span data-v-541632ae="">
              <button data-v-541632ae=""
                      type="button"
                      class="elevation-0 op_btn ml-3 mt-3  mb-3 ma-2 v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default"
                      style="background-color: rgb(251, 222, 68); border-color: rgb(251, 222, 68);"><span
                  class="v-btn__content"> 다이어트 </span></button></span><!----><!----><!----><!----><!----></span></div>
            </div>
          </div>

        </div>
      </div>
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
    };
  },
};
</script>

<style scoped>
</style>